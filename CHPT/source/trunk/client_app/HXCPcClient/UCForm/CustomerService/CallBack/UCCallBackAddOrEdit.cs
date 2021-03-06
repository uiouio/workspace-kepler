﻿using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Data;
using System.Linq;
using System.Windows.Forms;
using ClientBLL;
using HXCPcClient.Chooser;
using HXCPcClient.CommonClass;
using HXCPcClient.UCForm.RepairBusiness.RepairQuery;
using ServiceStationClient.ComponentUI;
using SYSModel;
using Utility.Common;

namespace HXCPcClient.UCForm.CustomerService.CallBack
{
    ///*************************************************************************//
    /// System:       HuiXuCheSYS
    /// FileName:     UCCallBackAddOrEdit         
    /// Author:       Kord
    /// Date:         2014/10/22 17:55:09
    /// Machine Name: KORD-PC
    ///***************************************************************************//
    /// Function: 
    /// 	客户服务-客户回访-新增/编辑
    ///***************************************************************************//
    public partial class UCCallBackAddOrEdit : UCBase
    {
        #region Constructor -- 构造函数
        public UCCallBackAddOrEdit()
        {
            InitializeComponent();

            Load += UCCallBackAddOrEdit_Load;
        }
        #endregion

        #region Field -- 字段

        #endregion

        #region Property -- 属性
        /// <summary>
        /// 父窗体
        /// </summary>
        public UCCallBackManager UCCallBackManager { get; set; }
        /// <summary>
        /// 客户Id
        /// </summary>
        public String CustId { get; set; }
        /// <summary>
        /// 被回访人Id
        /// </summary>
        public String ContId { get; set; }
        /// <summary>
        /// 回访记录Id
        /// </summary>
        public String CallBackId { get; set; }
        /// <summary>
        /// 经办人Id
        /// </summary>
        public String HandleId { get; set; }
        #endregion

        #region Method -- 方法
        public override bool CloseMenu()
        {
            if (_autoClose) return true;
            if (MessageBoxEx.Show("确定要关闭当前窗体吗？", "提示", MessageBoxButtons.OKCancel, MessageBoxIcon.Question) != DialogResult.OK)
            {
                return false;
            }
            return true;
        }

        Boolean _autoClose = true;
        //初始化
        private void Init()
        {
            #region 设置功能按钮可见性
            UIAssistants.SetUCBaseFuncationVisible(this, new ObservableCollection<ButtonEx_sms>()
            {
                btnSave, btnCancel, btnSet, btnView, btnPrint
            });
            #endregion

            #region 初始化下拉框数据绑定
            CommonCtrl.CmbBindDict(cbo_cb_Callback_type, "sys_callback_type", false);    //绑定回访类型
            CommonCtrl.CmbBindDict(cbo_cb_Callback_mode, "sys_callback_mode", false);    //绑定回访方式
            CommonCtrl.CmbBindDict(cbo_member_class, "sys_member_grade", false);    //绑定会员等级
            CommonFuncCall.BindProviceComBox(cbo_province, "请选择");  //绑定省份
            CommonFuncCall.BindCityComBox(cbo_city, "", "请选择");   //绑定城市
            CommonFuncCall.BindCountryComBox(cbo_county, "", "请选择");    //绑定县/区
            cbo_province.SelectedIndexChanged += ddlprovince_SelectedIndexChanged;
            cbo_city.SelectedIndexChanged += ddlcity_SelectedIndexChanged;
            CommonCtrl.CmbBindDict(cbo_cust_type, "sys_customer_category", false);  //客户类别
            #endregion

            lbl_cb_create_by.Text = GlobalStaticObj.CurrUserCom_Name;
            lbl_cb_create_by.Tag = GlobalStaticObj.UserID;
            if (windowStatus == WindowStatus.Edit || windowStatus == WindowStatus.View)
            {
                SetCustInfo();
                SetContInfo();
                SetCallbackInfo();
            }
            if (windowStatus == WindowStatus.View) palQTop.Enabled = false;
            #region 注册功能按钮事件
            #region 选择客户信息
            txt_cust_code.ChooserClick += delegate
            {
                var frmCustomer = new frmCustomerInfo();
                var result = frmCustomer.ShowDialog();
                if (result == DialogResult.OK)
                {
                    CustId = frmCustomer.strCustomerId;
                    txt_cust_code.Tag = CustId;
                    txt_cust_code.Text = frmCustomer.strCustomerNo;
                    SetCustInfo();
                }
            };
            dataGridViewEx1.CellContentClick += delegate(object sender, DataGridViewCellEventArgs args)
            {
                if (args.ColumnIndex < 0 || args.RowIndex < 0) return;
                if (dataGridViewEx1.Columns[args.ColumnIndex] == drtxt_maintain_no)
                {
                    var ytServiceNo = CommonCtrl.IsNullToString(dataGridViewEx1.Rows[args.RowIndex].Cells[drtxt_maintain_id.Name].Value);
                    if (String.IsNullOrEmpty(CommonCtrl.IsNullToString(ytServiceNo))) return;
                    var uc = new RepairQueryView(ytServiceNo);
                    uc.addUserControl(uc, "维修单-详细信息", "RepairQueryView" + ytServiceNo, Tag.ToString(),
                        Name);
                }
            };
            #endregion

            #region 选择被回访人
            txt_cb_Callback_by.ChooserClick += delegate
            {
                var frmContacts = new frmContacts();
                var result = frmContacts.ShowDialog();
                if (result == DialogResult.OK)
                {
                    ContId = frmContacts.contID;
                    txt_cb_Callback_by.Tag = ContId;
                    txt_cb_Callback_by.Text = frmContacts.contName;
                    txt_cb_Callback_by_duty.Caption = frmContacts.contDuty;
                    txt_cb_Callback_by_phone.Caption = frmContacts.contPhone;
                }
            };
            #endregion

            #region 选择经办人
            txt_handle_name.ChooserClick += delegate
            {
                var chooser = new frmUsers();
                var result = chooser.ShowDialog();
                if (result == DialogResult.OK)
                {
                    txt_handle_name.Text = chooser.User_Name;
                    txt_handle_name.Tag = chooser.User_ID;
                    txt_cb_handle_org.Caption = chooser.OrgName;
                }
            };
            #endregion

            //CancelEvent += (sender, args) => deleteMenuByTag(Tag.ToString(), UCCallBackManager.Name);
            CancelEvent += new ClickHandler(UCCallBackAddOrEdit_CancelEvent);

            #region 保存数据
            SaveEvent += delegate
            {
                var check = CheckValue();
                if (!check) return;
                var dicFileds = new Dictionary<String, String>();
                if (windowStatus == WindowStatus.Add)
                {
                    dicFileds.Add("create_by", GlobalStaticObj.UserID);  //创建人
                    dicFileds.Add("create_time", DBHelper.GetCurrentTime().Ticks.ToString());    //创建时间
                    dicFileds.Add("update_by", GlobalStaticObj.UserID);  //最后编辑人
                    dicFileds.Add("update_time", DBHelper.GetCurrentTime().Ticks.ToString());    //最后编辑时间
                    dicFileds.Add("Callback_id", Guid.NewGuid().ToString());  //客户ID
                    dicFileds.Add("status", "58b325d2-0792-4847-8e4a-22b3f25628f3");   //数据状态
                }
                else if (windowStatus == WindowStatus.Edit)
                {
                    DBHelper.BatchDeleteDataByWhere("删除客户与维修单关系", "tr_maintain_customer_callback", String.Format("callback_id = '{0}'", CallBackId));
                    dicFileds.Add("update_by", GlobalStaticObj.UserID);  //最后编辑人
                    dicFileds.Add("update_time", DBHelper.GetCurrentTime().Ticks.ToString());    //最后编辑时间
                }
                dicFileds.Add("Callback_corp", txt_cust_code.Tag.ToString());  //客户ID
                dicFileds.Add("Callback_time", DBHelper.GetCurrentTime().Ticks.ToString());   //回访时间
                dicFileds.Add("Callback_type", cbo_cb_Callback_type.SelectedValue.ToString()); //回访类型
                dicFileds.Add("Callback_mode", cbo_cb_Callback_mode.SelectedValue.ToString()); //回访方式
                dicFileds.Add("title",txt_cb_title.Caption);    //回访标题
                dicFileds.Add("record", rtx_cb_record.Text);    //回访内容
                dicFileds.Add("Callback_by", txt_cb_Callback_by.Tag.ToString());  //被回访人员名称
                dicFileds.Add("Callback_by_org", txt_cb_Callback_by_org.Caption);   //被回访人员部门名称
                dicFileds.Add("Callback_by_phone", txt_cb_Callback_by_phone.Caption);   //被回访人电话
                dicFileds.Add("Callback_by_duty", txt_cb_Callback_by_duty.Caption); //被回访人职务
                dicFileds.Add("handle_name", txt_handle_name.Tag.ToString());    //经办人
                dicFileds.Add("handle_org", txt_cb_handle_org.Caption); //经办人部门名称
                var result = false;
                try
                {
                    result = DBHelper.Submit_AddOrEdit("保存客户回访", "tb_CustomerSer_Callback", "Callback_id", CallBackId, dicFileds);
                    if (result)
                    {
                        const string sqlStr = "INSERT INTO tr_maintain_customer_callback(id,maintain_id,customer_id ,callback_id) VALUES(@id,@maintain_id,@customer_id,@callback_id)";
                        var list = GetCheckRows();
                        var sysSqlStrList = list.Select(str => new SysSQLString
                        {
                            cmdType = CommandType.Text, sqlString = sqlStr, Param = new Dictionary<string, string>
                            {
                                {"@id", Guid.NewGuid().ToString()}, {"@maintain_id", str}, {"@customer_id", txt_cust_code.Tag.ToString()}, {"@callback_id", String.IsNullOrEmpty(CallBackId) ? dicFileds["Callback_id"] : CallBackId}
                            }
                        }).ToList();
                        DBHelper.BatchExeSQLStringMultiByTrans("添加客户与维修单关系", sysSqlStrList);
                    }
                }
                catch (Exception ex)
                {
                    result = false;
                }
                MessageBoxEx.Show(result ? "保存成功!" : "保存失败!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                if (result)
                {
                    UCCallBackManager.BindPageData();
                    _autoClose = false;
                    deleteMenuByTag(Tag.ToString(), UCCallBackManager.Name);
                }
            };
            #endregion
            #endregion
        }

        #region 取消事件
        void UCCallBackAddOrEdit_CancelEvent(object sender, EventArgs e)
        {
            try
            {
                if (MessageBoxEx.Show("确认要取消吗?", "提示", MessageBoxButtons.OKCancel) != DialogResult.OK)
                {
                    return;
                }
                _autoClose = true;
                deleteMenuByTag(this.Tag.ToString(), UCCallBackManager.Name);
            }
            catch (Exception ex)
            {
                HXCPcClient.GlobalStaticObj.GlobalLogService.WriteLog(ex);
            }
        }
        #endregion

        private Boolean CheckValue()    //必填字段非空验证
        {
            if (String.IsNullOrEmpty(txt_cust_code.Text.Trim()))
            {
                MessageBoxEx.Show("客户编码不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                txt_cust_code.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(txt_cb_title.Caption.Trim()))
            {
                MessageBoxEx.Show("回访标题不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                txt_cb_title.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(txt_cb_Callback_by.Text.Trim()))
            {
                MessageBoxEx.Show("被回访人不允许为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                txt_cb_Callback_by.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(cbo_cb_Callback_mode.SelectedValue.ToString()))
            {
                MessageBoxEx.Show("回访形式不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                cbo_cb_Callback_mode.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(cbo_cb_Callback_type.Text.Trim()))
            {
                MessageBoxEx.Show("回访类型不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                cbo_cb_Callback_type.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(txt_handle_name.Text.Trim()))
            {
                MessageBoxEx.Show("经办人不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                txt_handle_name.Focus();
                return false;
            }
            if (String.IsNullOrEmpty(txt_cb_handle_org.Caption.Trim()))
            {
                MessageBoxEx.Show("部门不能为空!", "提示", MessageBoxButtons.OK, MessageBoxIcon.None);
                txt_cb_handle_org.Focus();
                return false;
            }
            return true;
        }
        private void SetCustInfo()  //设置客户信息
        {
            if (String.IsNullOrEmpty(CustId)) return;
            var custInfo = DBHelper.GetTable("查询客户信息", "tb_customer", "*", "cust_id = '" + CustId + "'", "",
                "");
            if (custInfo != null && custInfo.DefaultView.Count != 0)
            {
                txt_cust_code.Text = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_code"]);
                txt_cust_code.Tag = CustId;
                txt_cust_name.Text = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_name"]);
                txt_legal_person.Caption =CommonCtrl.IsNullToString( custInfo.DefaultView[0]["legal_person"]);
                cbo_cust_type.Text = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_type"]);
                txt_cust_short_name.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_short_name"]);
                txt_cust_quick_code.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_quick_code"]);
                cbo_province.SelectedValue = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["province"]);
                cbo_city.SelectedValue = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["city"]);
                txt_cust_fax.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_fax"]);
                cbo_county.SelectedValue = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["county"]);
                txt_cust_address.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_address"]);
                txt_cust_phone.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_phone"]);
                txt_cust_email.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["cust_email"]);
                chk_is_member.Checked = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["is_member"]) == "1";
                txt_member_number.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["member_number"]);
                cbo_member_class.SelectedValue = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["member_class"]);

                if (custInfo.DefaultView[0]["member_period_validity"] != DBNull.Value)
                {
                    var ticks = (long)custInfo.DefaultView[0]["member_period_validity"];
                    dtp_member_period_validity.Value = Common.UtcLongToLocalDateTime(ticks);
                }
                var str1 = "(cc.callback_id is null or cc.callback_id like '%" + CallBackId + "%')";
                if (String.IsNullOrEmpty(CallBackId))
                {
                    str1 = "cc.callback_id is null ";
                }
                var strWhere =
                    string.Format(
                        "select mi.* from tb_maintain_info mi left join tr_maintain_customer_callback cc on mi.maintain_id = cc.maintain_id where " +
                        str1 + " and enable_flag='" + Convert.ToInt32(DataSources.EnumEnableFlag.USING)) +
                    "' and (info_status='" + Convert.ToInt32(DataSources.EnumAuditStatus.Balance) +
                    "' or info_status='" + Convert.ToInt32(DataSources.EnumAuditStatus.AUDIT) +
                    "') and mi.customer_id = '" + CustId + "' order by maintain_no";
                var dt = DBHelper.GetDataSet("获取客户多对应的维修单", new SQLObj(){sqlString = strWhere, Param = new Dictionary<string, ParamObj>()});
                if (dt != null && dt.Tables.Count > 0)
                {
                    dataGridViewEx1.DataSource = dt.Tables[0];
                }
            }
        }
        private void SetContInfo() //设置被回访人信息
        {
            txt_cb_Callback_by.Tag = ContId;
            var custInfo = DBHelper.GetTable("查询回访记录信息", "tb_CustomerSer_Callback", "*", "Callback_id = '" + CallBackId + "'", "", "");

            if (custInfo != null && custInfo.DefaultView.Count != 0)
            {
                txt_cb_Callback_by.Tag = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["Callback_by"]);
                txt_cb_Callback_by_org.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["Callback_by_org"]);
                txt_cb_Callback_by_phone.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["Callback_by_phone"]);
                txt_cb_Callback_by_duty.Caption = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["Callback_by_duty"]);
            }

            var custInfo1 = DBHelper.GetTable("查询回访记录信息", "tb_contacts", "*", "cont_id = '" + txt_cb_Callback_by.Tag + "'", "", "");
            txt_cb_Callback_by.Text = CommonCtrl.IsNullToString(custInfo1.DefaultView[0]["cont_name"]);
        }
        private void SetCallbackInfo()  //设置客户回访信息
        {
            var feedbackInfo = DBHelper.GetTable("查询客户回访信息", "tb_CustomerSer_Callback", "*", "Callback_id = '" + CallBackId + "'", "", "");
            if (feedbackInfo != null && feedbackInfo.DefaultView.Count != 0)
            {
                txt_cb_title.Caption = CommonCtrl.IsNullToString(feedbackInfo.DefaultView[0]["title"]);
                rtx_cb_record.Text = CommonCtrl.IsNullToString(feedbackInfo.DefaultView[0]["record"]);
                HandleId = CommonCtrl.IsNullToString(feedbackInfo.DefaultView[0]["handle_name"]);
                txt_cb_handle_org.Caption = CommonCtrl.IsNullToString(feedbackInfo.DefaultView[0]["handle_org"]);
                SetHandleInfo();
            }
            UIAssistants.SetDataGridViewCheckColumn(dataGridViewEx1, drchk_check);
            var relationInfo = DBHelper.GetTable("查询客户与维修单关系", "tr_maintain_customer_callback", "*", "callback_id = '" + CallBackId + "'", "", "");
            if (relationInfo != null && relationInfo.DefaultView.Count != 0)
            {
                foreach (DataRow row in relationInfo.Rows)
                {
                    foreach (DataGridViewRow rowView in dataGridViewEx1.Rows)
                    {
                        if (CommonCtrl.IsNullToString(rowView.Cells[drtxt_maintain_id.Name].Value) ==
                            CommonCtrl.IsNullToString(row["maintain_id"]))
                        {
                            rowView.Cells[drchk_check.Name].Value = true;
                        }
                    }
                }
            }
        }
        private void SetHandleInfo() //设置经办人信息
        {
            var custInfo = DBHelper.GetTable("查询经办人信息", "sys_user", "*", "user_id = '" + HandleId + "'", "", "");
            if (custInfo != null && custInfo.DefaultView.Count != 0)
            {
                txt_handle_name.Text = CommonCtrl.IsNullToString(custInfo.DefaultView[0]["user_name"]);
                txt_handle_name.Tag = ContId;
            }
        }
        private List<string> GetCheckRows()
        {
            return (from DataGridViewRow dr in dataGridViewEx1.Rows let isCheck = dr.Cells[drchk_check.Name].EditedFormattedValue where isCheck != null && (bool)isCheck select dr.Cells[drtxt_maintain_id.Name].Value.ToString()).ToList();
        }
        #endregion

        #region Event -- 事件
        private void UCCallBackAddOrEdit_Load(object sender, EventArgs e)
        {
            Init();
        }
        private void ddlprovince_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!string.IsNullOrEmpty(cbo_province.SelectedValue.ToString()))
            {
                CommonFuncCall.BindCityComBox(cbo_city, cbo_province.SelectedValue.ToString(), "请选择");
                CommonFuncCall.BindCountryComBox(cbo_county, cbo_city.SelectedValue.ToString(), "请选择");
            }
            else
            {
                CommonFuncCall.BindCityComBox(cbo_city, "", "请选择");
                CommonFuncCall.BindCountryComBox(cbo_county, "", "请选择");
            }
        }

        private void ddlcity_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (!string.IsNullOrEmpty(CommonCtrl.IsNullToString(cbo_city.SelectedValue)))
            {
                CommonFuncCall.BindCountryComBox(cbo_county, cbo_city.SelectedValue.ToString(), "请选择");
            }
            else
            {
                CommonFuncCall.BindCountryComBox(cbo_county, "", "请选择");
            }
        }
        #endregion
    }
}
