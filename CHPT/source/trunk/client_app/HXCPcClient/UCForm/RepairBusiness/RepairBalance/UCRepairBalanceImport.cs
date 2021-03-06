﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using HXCPcClient.Chooser;
using HXCPcClient.CommonClass;
using ServiceStationClient.ComponentUI;
using Utility.Common;
using SYSModel;

namespace HXCPcClient.UCForm.RepairBusiness.RepairBalance
{
    public partial class UCRepairBalanceImport : FormChooser
    {
        #region 属性设置
        /// <summary>
        /// 查询条件
        /// </summary>
        string strWhere = string.Empty;
        /// <summary>
        /// 结算单父窗体
        /// </summary>
        public UCRepairBalanceAddOrEdit uc;
        /// <summary>
        /// 维修单编号
        /// </summary>
        string strRId = string.Empty;
        #endregion

        #region 初始化窗体
        public UCRepairBalanceImport()
        {
            InitializeComponent();
            UIAssistants.SetButtonStyle4QueryAndClear(btnSubmit, btnClear);  //设置查询按钮和清除按钮样式
            this.AcceptButton = btnSubmit;
            dgvRData.ReadOnly = false;
            dgvRData.Columns["maintain_no"].ReadOnly = true;
            dgvRData.Columns["reception_time"].ReadOnly = true;
            dgvRData.Columns["customer_name"].ReadOnly = true;
            dgvRData.Columns["vehicle_no"].ReadOnly = true;
            dgvRData.Columns["vehicle_vin"].ReadOnly = true;
            dgvRData.Columns["vehicle_brand"].ReadOnly = true;
            dgvRData.Columns["vehicle_model"].ReadOnly = true;
            dgvRData.Columns["engine_no"].ReadOnly = true;
            dgvRData.Columns["driver_name"].ReadOnly = true;
            dgvRData.Columns["driver_mobile"].ReadOnly = true;
            dgvRData.Columns["maintain_type"].ReadOnly = true;
            dgvRData.Columns["fault_describe"].ReadOnly = true;
            dgvRData.Columns["travel_mileage"].ReadOnly = true;
            dgvRData.Columns["vehicle_color"].ReadOnly = true;
            dgvRData.Columns["linkman"].ReadOnly = true;
            dgvRData.Columns["link_man_mobile"].ReadOnly = true;
            dgvRData.Columns["maintain_payment"].ReadOnly = true;
            dtpReserveSTime.Value = DateTime.Now.AddMonths(-1);
            dtpReserveETime.Value = DateTime.Now;          
        }
        #endregion

        #region 清除事件
        private void btnClear_Click(object sender, EventArgs e)
        {
            txtCarNO.Caption = string.Empty;
            txtCustomName.Caption = string.Empty;
            dtpReserveSTime.Value = DateTime.Now.AddMonths(-1);
            dtpReserveETime.Value = DateTime.Now;
            txtPhone.Caption = string.Empty;
        }
        #endregion

        #region 查询事件
        private void btnSubmit_Click(object sender, EventArgs e)
        {
            BindData();
        }
        #endregion

        #region 返修单所需数据绑定数据
        private void BindData()
        {
            try
            {
                #region 事件选择判断
                if (dtpReserveSTime.Value > dtpReserveETime.Value)
                {
                    MessageBoxEx.Show("完工时间,开始时间不能大于结束时间", "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    return;
                }
                #endregion                
                //strWhere = string.Format(" enable_flag='" + Convert.ToInt32(DataSources.EnumEnableFlag.USING).ToString() + "' and Import_status='0' and orders_source <>3 and (dispatch_status='" + Convert.ToInt32(DataSources.EnumDispatchStatus.FinishWork).ToString() + "' or dispatch_status='" + Convert.ToInt32(DataSources.EnumDispatchStatus.HasPassed).ToString() + "')");//enable_flag 1未删除
                strWhere = string.Format(" enable_flag='" + Convert.ToInt32(DataSources.EnumEnableFlag.USING).ToString() + "' and orders_source <>3 and (dispatch_status='" + Convert.ToInt32(DataSources.EnumDispatchStatus.FinishWork).ToString() + "' or dispatch_status='" + Convert.ToInt32(DataSources.EnumDispatchStatus.HasPassed).ToString() + "')");//enable_flag 1未删除
                if (!string.IsNullOrEmpty(txtCarNO.Text.Trim()))//车牌号
                {
                    strWhere += string.Format(" and  vehicle_no like '%{0}%'", txtCarNO.Text.Trim());
                }
                if (!string.IsNullOrEmpty(txtCustomName.Caption.Trim()))//客户名称
                {
                    strWhere += string.Format(" and  customer_name like '%{0}%'", txtCustomName.Caption.Trim());
                }
                if (!string.IsNullOrEmpty(txtPhone.Caption.Trim()))//报修人手机
                {
                    strWhere += string.Format(" and  driver_mobile like '%{0}%'", txtPhone.Caption.Trim());
                }
                strWhere += string.Format(" and complete_work_time BETWEEN {0} and {1}", Common.LocalDateTimeToUtcLong(dtpReserveSTime.Value.Date), Common.LocalDateTimeToUtcLong(dtpReserveETime.Value.Date.AddDays(1).AddMilliseconds(-1)));//接待日期
                string strTables = "tb_maintain_info";
                DataTable dt = DBHelper.GetTable("维修明细导入信息列表", strTables, "*", strWhere, "", "order by complete_work_time desc");
                dgvRData.DataSource = dt;
            }
            catch (Exception ex)
            {
                MessageBoxEx.Show(ex.Message, "提示", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }

        }
        #endregion

        #region 窗体Load事件
        private void UCRepairBalanceImport_Load(object sender, EventArgs e)
        {
            BindData();
        }
        #endregion

        #region 双击传递参数
        private void dgvRData_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                uc.strBefore_orderId = dgvRData.Rows[e.RowIndex].Cells["maintain_id"].Value.ToString();  //导入单据的Id值          
                uc.BindSetmentData();
                this.DialogResult = DialogResult.OK;
            }           
        }
        #endregion

        #region 取消功能
        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        #endregion

        #region 导入功能
        private void btnImport_Click(object sender, EventArgs e)
        {
            List<string> listField = new List<string>();
            #region 获取信息Id值

            foreach (DataGridViewRow dr in dgvRData.Rows)
            {
                object isCheck = dr.Cells["colCheck"].EditedFormattedValue;
                if (isCheck != null && (bool)isCheck)
                {
                    strRId = dr.Cells["maintain_id"].Value.ToString();
                    listField.Add(dr.Cells["maintain_id"].Value.ToString());
                }
            }
            #endregion
            if (listField.Count <= 0)
            {
                MessageBoxEx.Show("请选择需要导入的数据!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                return;
            }
            if (listField.Count > 1)
            {
                MessageBoxEx.Show("一次仅能导入1条数据!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                return;
            }
            uc.strBefore_orderId = strRId;  //导入单据的Id值          
            uc.BindSetmentData();
            this.DialogResult = DialogResult.OK;
        }
        #endregion

        #region 选择行
        private void dgvRData_CellMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            if (e.RowIndex < 0 || e.ColumnIndex < 0)
            {
                return;
            }
            if (e.ColumnIndex == colCheck.Index)
            {
                return;
            }
            //清空已选择框
            foreach (DataGridViewRow dgvr in dgvRData.Rows)
            {
                object check = dgvr.Cells[colCheck.Name].EditedFormattedValue;
                if (check != null && (bool)check)
                {
                    dgvr.Cells[colCheck.Name].Value = false;
                }
            }
            //选择当前行
            dgvRData.Rows[e.RowIndex].Cells[colCheck.Name].Value = true;
        }
        #endregion

        private void dgvRData_CellFormatting(object sender, DataGridViewCellFormattingEventArgs e)
        {
            if (e.Value == null)
            {
                return;
            }
            string fieldNmae = dgvRData.Columns[e.ColumnIndex].DataPropertyName;
            if (fieldNmae.Equals("vehicle_brand") || fieldNmae.Equals("vehicle_color") || fieldNmae.Equals("maintain_type") || fieldNmae.Equals("maintain_payment"))
            {
                e.Value = GetDicName(e.Value.ToString());
            }
            if (fieldNmae.Equals("vehicle_model"))
            {
                e.Value = GetVmodel(e.Value.ToString());
            }  
        }

        #region 获取车型名称
        private string GetVmodel(string strVId)
        {
            return DBHelper.GetSingleValue("获得车型名称", "tb_vehicle_models", "vm_name", "vm_id='" + strVId + "'", "");
        }
        #endregion

        #region 根据码表ID获取其对应的名称
        /// <summary>
        /// 根据码表ID获取其对应的名称
        /// </summary>
        /// <param name="strId">码表Id值</param>
        private string GetDicName(string strId)
        {
            return LocalCache.GetDictNameById(strId);
        }
        #endregion

        #region 回车事件
        private void dgvRData_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == 13)
            {
                uc.strBefore_orderId = dgvRData.CurrentRow.Cells["maintain_id"].Value.ToString();  //导入单据的Id值          
                uc.BindSetmentData();
                this.DialogResult = DialogResult.OK;
            }
        }
        #endregion
    }
}
