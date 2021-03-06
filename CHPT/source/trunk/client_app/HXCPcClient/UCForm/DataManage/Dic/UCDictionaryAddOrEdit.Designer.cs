﻿namespace HXCPcClient.UCForm.DataManage.Dic
{
    partial class UCDictionaryAddOrEdit
    {
        /// <summary> 
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region 组件设计器生成的代码

        /// <summary> 
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(UCDictionaryAddOrEdit));
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle2 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle3 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle4 = new System.Windows.Forms.DataGridViewCellStyle();
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle5 = new System.Windows.Forms.DataGridViewCellStyle();
            this.panelEx1 = new ServiceStationClient.ComponentUI.PanelEx();
            this.cobDataSources = new ServiceStationClient.ComponentUI.ComboBoxEx(this.components);
            this.label3 = new System.Windows.Forms.Label();
            this.dtpEnd = new ServiceStationClient.ComponentUI.DateTimePickerEx_sms();
            this.dtpStart = new ServiceStationClient.ComponentUI.DateTimePickerEx_sms();
            this.label12 = new System.Windows.Forms.Label();
            this.txtcreate_by = new ServiceStationClient.ComponentUI.TextBox.TextChooser();
            this.txtdic_name = new ServiceStationClient.ComponentUI.TextBoxEx();
            this.txtdic_code = new ServiceStationClient.ComponentUI.TextBoxEx();
            this.btnSearch = new ServiceStationClient.ComponentUI.ButtonEx();
            this.btnClear = new ServiceStationClient.ComponentUI.ButtonEx();
            this.label11 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.tcDicList = new ServiceStationClient.ComponentUI.TabControlEx();
            this.tpDicList = new System.Windows.Forms.TabPage();
            this.dgvDicList = new ServiceStationClient.ComponentUI.DataGridViewEx(this.components);
            this.colCheck = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.dic_code = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dic_name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.is_class = new System.Windows.Forms.DataGridViewComboBoxColumn();
            this.parent_code = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.parent_name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.data_source = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.create_name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.create_time = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.update_name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.update_time = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.remark = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.enable_flag = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dic_id = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.parent_id = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.page = new ServiceStationClient.ComponentUI.WinFormPager();
            this.panelEx1.SuspendLayout();
            this.tcDicList.SuspendLayout();
            this.tpDicList.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dgvDicList)).BeginInit();
            this.SuspendLayout();
            // 
            // pnlOpt
            // 
            this.pnlOpt.Size = new System.Drawing.Size(1000, 28);
            // 
            // panelEx1
            // 
            this.panelEx1.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.panelEx1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(239)))), ((int)(((byte)(248)))), ((int)(((byte)(255)))));
            this.panelEx1.BackColor2 = System.Drawing.Color.FromArgb(((int)(((byte)(239)))), ((int)(((byte)(248)))), ((int)(((byte)(255)))));
            this.panelEx1.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(189)))), ((int)(((byte)(211)))), ((int)(((byte)(254)))));
            this.panelEx1.BorderWidth = 1;
            this.panelEx1.Controls.Add(this.cobDataSources);
            this.panelEx1.Controls.Add(this.label3);
            this.panelEx1.Controls.Add(this.dtpEnd);
            this.panelEx1.Controls.Add(this.dtpStart);
            this.panelEx1.Controls.Add(this.label12);
            this.panelEx1.Controls.Add(this.txtcreate_by);
            this.panelEx1.Controls.Add(this.txtdic_name);
            this.panelEx1.Controls.Add(this.txtdic_code);
            this.panelEx1.Controls.Add(this.btnSearch);
            this.panelEx1.Controls.Add(this.btnClear);
            this.panelEx1.Controls.Add(this.label11);
            this.panelEx1.Controls.Add(this.label6);
            this.panelEx1.Controls.Add(this.label4);
            this.panelEx1.Controls.Add(this.label1);
            this.panelEx1.Curvature = 0;
            this.panelEx1.CurveMode = ((ServiceStationClient.ComponentUI.CornerCurveMode)((((ServiceStationClient.ComponentUI.CornerCurveMode.TopLeft | ServiceStationClient.ComponentUI.CornerCurveMode.TopRight)
                        | ServiceStationClient.ComponentUI.CornerCurveMode.BottomLeft)
                        | ServiceStationClient.ComponentUI.CornerCurveMode.BottomRight)));
            this.panelEx1.GradientMode = ServiceStationClient.ComponentUI.LinearGradientMode.None;
            this.panelEx1.Location = new System.Drawing.Point(1, 29);
            this.panelEx1.Name = "panelEx1";
            this.panelEx1.Size = new System.Drawing.Size(999, 80);
            this.panelEx1.TabIndex = 6;
            // 
            // cobDataSources
            // 
            this.cobDataSources.DrawMode = System.Windows.Forms.DrawMode.OwnerDrawFixed;
            this.cobDataSources.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cobDataSources.FormattingEnabled = true;
            this.cobDataSources.Location = new System.Drawing.Point(420, 48);
            this.cobDataSources.Name = "cobDataSources";
            this.cobDataSources.Size = new System.Drawing.Size(121, 22);
            this.cobDataSources.TabIndex = 140;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(356, 51);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(65, 12);
            this.label3.TabIndex = 139;
            this.label3.Text = "数据来源：";
            // 
            // dtpEnd
            // 
            this.dtpEnd.Location = new System.Drawing.Point(204, 49);
            this.dtpEnd.Name = "dtpEnd";
            this.dtpEnd.ShowFormat = "yyyy-MM-dd";
            this.dtpEnd.Size = new System.Drawing.Size(116, 21);
            this.dtpEnd.TabIndex = 31;
            // 
            // dtpStart
            // 
            this.dtpStart.Location = new System.Drawing.Point(82, 49);
            this.dtpStart.Name = "dtpStart";
            this.dtpStart.ShowFormat = "yyyy-MM-dd";
            this.dtpStart.Size = new System.Drawing.Size(99, 21);
            this.dtpStart.TabIndex = 30;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(185, 53);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(23, 12);
            this.label12.TabIndex = 29;
            this.label12.Text = "至 ";
            // 
            // txtcreate_by
            // 
            this.txtcreate_by.ChooserTypeImage = ServiceStationClient.ComponentUI.TextBox.ChooserType.Default;
            this.txtcreate_by.Font = new System.Drawing.Font("宋体", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.txtcreate_by.Location = new System.Drawing.Point(628, 12);
            this.txtcreate_by.Name = "txtcreate_by";
            this.txtcreate_by.ReadOnly = false;
            this.txtcreate_by.Size = new System.Drawing.Size(121, 24);
            this.txtcreate_by.TabIndex = 28;
            this.txtcreate_by.ToolTipTitle = "";
            this.txtcreate_by.ChooserClick += new System.EventHandler(this.txtcreate_by_ChooserClick);
            // 
            // txtdic_name
            // 
            this.txtdic_name.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.None;
            this.txtdic_name.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.None;
            this.txtdic_name.BackColor = System.Drawing.Color.Transparent;
            this.txtdic_name.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.txtdic_name.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(208)))), ((int)(((byte)(226)))));
            this.txtdic_name.Font = new System.Drawing.Font("宋体", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.txtdic_name.ForeImage = null;
            this.txtdic_name.InputtingVerifyCondition = null;
            this.txtdic_name.Location = new System.Drawing.Point(339, 12);
            this.txtdic_name.MaxLengh = 32767;
            this.txtdic_name.Multiline = false;
            this.txtdic_name.Name = "txtdic_name";
            this.txtdic_name.Radius = 3;
            this.txtdic_name.ReadOnly = false;
            this.txtdic_name.SelectStart = 0;
            this.txtdic_name.ShadowColor = System.Drawing.Color.FromArgb(((int)(((byte)(175)))), ((int)(((byte)(212)))), ((int)(((byte)(228)))));
            this.txtdic_name.ShowError = false;
            this.txtdic_name.Size = new System.Drawing.Size(202, 23);
            this.txtdic_name.TabIndex = 20;
            this.txtdic_name.UseSystemPasswordChar = false;
            this.txtdic_name.Value = "";
            this.txtdic_name.VerifyCondition = null;
            this.txtdic_name.VerifyType = null;
            this.txtdic_name.VerifyTypeName = null;
            this.txtdic_name.WaterMark = null;
            this.txtdic_name.WaterMarkColor = System.Drawing.Color.Silver;
            // 
            // txtdic_code
            // 
            this.txtdic_code.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.None;
            this.txtdic_code.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.None;
            this.txtdic_code.BackColor = System.Drawing.Color.Transparent;
            this.txtdic_code.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.txtdic_code.BorderColor = System.Drawing.Color.FromArgb(((int)(((byte)(166)))), ((int)(((byte)(208)))), ((int)(((byte)(226)))));
            this.txtdic_code.Font = new System.Drawing.Font("宋体", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.txtdic_code.ForeImage = null;
            this.txtdic_code.InputtingVerifyCondition = null;
            this.txtdic_code.Location = new System.Drawing.Point(82, 12);
            this.txtdic_code.MaxLengh = 32767;
            this.txtdic_code.Multiline = false;
            this.txtdic_code.Name = "txtdic_code";
            this.txtdic_code.Radius = 3;
            this.txtdic_code.ReadOnly = false;
            this.txtdic_code.SelectStart = 0;
            this.txtdic_code.ShadowColor = System.Drawing.Color.FromArgb(((int)(((byte)(175)))), ((int)(((byte)(212)))), ((int)(((byte)(228)))));
            this.txtdic_code.ShowError = false;
            this.txtdic_code.Size = new System.Drawing.Size(121, 23);
            this.txtdic_code.TabIndex = 19;
            this.txtdic_code.UseSystemPasswordChar = false;
            this.txtdic_code.Value = "";
            this.txtdic_code.VerifyCondition = null;
            this.txtdic_code.VerifyType = null;
            this.txtdic_code.VerifyTypeName = null;
            this.txtdic_code.WaterMark = null;
            this.txtdic_code.WaterMarkColor = System.Drawing.Color.Silver;
            // 
            // btnSearch
            // 
            this.btnSearch.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnSearch.BackgroundImage")));
            this.btnSearch.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnSearch.Caption = "查询";
            this.btnSearch.DialogResult = System.Windows.Forms.DialogResult.None;
            this.btnSearch.DownImage = ((System.Drawing.Image)(resources.GetObject("btnSearch.DownImage")));
            this.btnSearch.Location = new System.Drawing.Point(778, 44);
            this.btnSearch.MoveImage = ((System.Drawing.Image)(resources.GetObject("btnSearch.MoveImage")));
            this.btnSearch.Name = "btnSearch";
            this.btnSearch.NormalImage = ((System.Drawing.Image)(resources.GetObject("btnSearch.NormalImage")));
            this.btnSearch.Size = new System.Drawing.Size(76, 26);
            this.btnSearch.TabIndex = 13;
            this.btnSearch.Click += new System.EventHandler(this.btnSearch_Click);
            // 
            // btnClear
            // 
            this.btnClear.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("btnClear.BackgroundImage")));
            this.btnClear.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.btnClear.Caption = "清除";
            this.btnClear.DialogResult = System.Windows.Forms.DialogResult.None;
            this.btnClear.DownImage = ((System.Drawing.Image)(resources.GetObject("btnClear.DownImage")));
            this.btnClear.Location = new System.Drawing.Point(778, 10);
            this.btnClear.MoveImage = ((System.Drawing.Image)(resources.GetObject("btnClear.MoveImage")));
            this.btnClear.Name = "btnClear";
            this.btnClear.NormalImage = ((System.Drawing.Image)(resources.GetObject("btnClear.NormalImage")));
            this.btnClear.Size = new System.Drawing.Size(76, 26);
            this.btnClear.TabIndex = 12;
            this.btnClear.Click += new System.EventHandler(this.btnClear_Click);
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(19, 51);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(65, 12);
            this.label11.TabIndex = 10;
            this.label11.Text = "创建时间：";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(232, 18);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(107, 12);
            this.label6.TabIndex = 5;
            this.label6.Text = "码表名称/关键字：";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(575, 18);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "创建人：";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(17, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "码表编码：";
            // 
            // tcDicList
            // 
            this.tcDicList.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
                        | System.Windows.Forms.AnchorStyles.Left)
                        | System.Windows.Forms.AnchorStyles.Right)));
            this.tcDicList.ArrowColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(79)))), ((int)(((byte)(125)))));
            this.tcDicList.Controls.Add(this.tpDicList);
            this.tcDicList.Location = new System.Drawing.Point(2, 111);
            this.tcDicList.Name = "tcDicList";
            this.tcDicList.SelectedIndex = 0;
            this.tcDicList.Size = new System.Drawing.Size(995, 414);
            this.tcDicList.TabIndex = 8;
            // 
            // tpDicList
            // 
            this.tpDicList.Controls.Add(this.dgvDicList);
            this.tpDicList.Location = new System.Drawing.Point(4, 26);
            this.tpDicList.Name = "tpDicList";
            this.tpDicList.Padding = new System.Windows.Forms.Padding(3);
            this.tpDicList.Size = new System.Drawing.Size(987, 384);
            this.tpDicList.TabIndex = 0;
            this.tpDicList.Text = "码表列表";
            this.tpDicList.UseVisualStyleBackColor = true;
            // 
            // dgvDicList
            // 
            this.dgvDicList.AllowUserToAddRows = false;
            this.dgvDicList.AllowUserToDeleteRows = false;
            this.dgvDicList.AllowUserToResizeRows = false;
            dataGridViewCellStyle1.BackColor = System.Drawing.Color.WhiteSmoke;
            this.dgvDicList.AlternatingRowsDefaultCellStyle = dataGridViewCellStyle1;
            this.dgvDicList.BackgroundColor = System.Drawing.Color.White;
            this.dgvDicList.BorderStyle = System.Windows.Forms.BorderStyle.None;
            dataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(240)))), ((int)(((byte)(241)))), ((int)(((byte)(243)))));
            dataGridViewCellStyle2.Font = new System.Drawing.Font("微软雅黑", 9F, System.Drawing.FontStyle.Bold);
            dataGridViewCellStyle2.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(51)))), ((int)(((byte)(51)))), ((int)(((byte)(51)))));
            dataGridViewCellStyle2.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle2.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this.dgvDicList.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle2;
            this.dgvDicList.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvDicList.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.colCheck,
            this.dic_code,
            this.dic_name,
            this.is_class,
            this.parent_code,
            this.parent_name,
            this.data_source,
            this.create_name,
            this.create_time,
            this.update_name,
            this.update_time,
            this.remark,
            this.enable_flag,
            this.dic_id,
            this.parent_id});
            dataGridViewCellStyle3.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            dataGridViewCellStyle3.BackColor = System.Drawing.SystemColors.Window;
            dataGridViewCellStyle3.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            dataGridViewCellStyle3.ForeColor = System.Drawing.Color.Black;
            dataGridViewCellStyle3.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(183)))), ((int)(((byte)(233)))), ((int)(((byte)(156)))));
            dataGridViewCellStyle3.SelectionForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(51)))), ((int)(((byte)(51)))), ((int)(((byte)(51)))));
            dataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            this.dgvDicList.DefaultCellStyle = dataGridViewCellStyle3;
            this.dgvDicList.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dgvDicList.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnEnter;
            this.dgvDicList.EnableHeadersVisualStyles = false;
            this.dgvDicList.GridColor = System.Drawing.Color.FromArgb(((int)(((byte)(221)))), ((int)(((byte)(221)))), ((int)(((byte)(221)))));
            this.dgvDicList.IsCheck = true;
            this.dgvDicList.Location = new System.Drawing.Point(3, 3);
            this.dgvDicList.MergeColumnHeaderBackColor = System.Drawing.SystemColors.Control;
            this.dgvDicList.MergeColumnNames = ((System.Collections.Generic.List<string>)(resources.GetObject("dgvDicList.MergeColumnNames")));
            this.dgvDicList.MultiSelect = false;
            this.dgvDicList.Name = "dgvDicList";
            this.dgvDicList.ReadOnly = true;
            this.dgvDicList.RowHeadersBorderStyle = System.Windows.Forms.DataGridViewHeaderBorderStyle.Single;
            dataGridViewCellStyle4.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(236)))), ((int)(((byte)(255)))));
            dataGridViewCellStyle4.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(224)))), ((int)(((byte)(236)))), ((int)(((byte)(255)))));
            this.dgvDicList.RowHeadersDefaultCellStyle = dataGridViewCellStyle4;
            this.dgvDicList.RowHeadersVisible = false;
            dataGridViewCellStyle5.Font = new System.Drawing.Font("宋体", 9F);
            dataGridViewCellStyle5.ForeColor = System.Drawing.Color.Black;
            dataGridViewCellStyle5.SelectionBackColor = System.Drawing.Color.FromArgb(((int)(((byte)(183)))), ((int)(((byte)(233)))), ((int)(((byte)(156)))));
            dataGridViewCellStyle5.SelectionForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(51)))), ((int)(((byte)(51)))), ((int)(((byte)(51)))));
            this.dgvDicList.RowsDefaultCellStyle = dataGridViewCellStyle5;
            this.dgvDicList.RowTemplate.Height = 23;
            this.dgvDicList.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dgvDicList.ShowCheckBox = true;
            this.dgvDicList.Size = new System.Drawing.Size(981, 378);
            this.dgvDicList.TabIndex = 0;
            this.dgvDicList.CellBeginEdit += new System.Windows.Forms.DataGridViewCellCancelEventHandler(this.dgvDicList_CellBeginEdit);
            this.dgvDicList.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvDicList_CellClick);
            this.dgvDicList.CellDoubleClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvDicList_CellDoubleClick);
            this.dgvDicList.CellFormatting += new System.Windows.Forms.DataGridViewCellFormattingEventHandler(this.dgvDicList_CellFormatting);
            // 
            // colCheck
            // 
            this.colCheck.HeaderText = "";
            this.colCheck.MinimumWidth = 30;
            this.colCheck.Name = "colCheck";
            this.colCheck.ReadOnly = true;
            this.colCheck.Width = 30;
            // 
            // dic_code
            // 
            this.dic_code.DataPropertyName = "dic_code";
            this.dic_code.HeaderText = "码表字典编码";
            this.dic_code.Name = "dic_code";
            this.dic_code.ReadOnly = true;
            this.dic_code.Width = 120;
            // 
            // dic_name
            // 
            this.dic_name.DataPropertyName = "dic_name";
            this.dic_name.HeaderText = "码表字典名称";
            this.dic_name.Name = "dic_name";
            this.dic_name.ReadOnly = true;
            this.dic_name.Width = 120;
            // 
            // is_class
            // 
            this.is_class.DataPropertyName = "is_class";
            this.is_class.DisplayStyle = System.Windows.Forms.DataGridViewComboBoxDisplayStyle.Nothing;
            this.is_class.HeaderText = "是否类";
            this.is_class.Name = "is_class";
            this.is_class.ReadOnly = true;
            this.is_class.Resizable = System.Windows.Forms.DataGridViewTriState.True;
            this.is_class.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Automatic;
            this.is_class.Width = 80;
            // 
            // parent_code
            // 
            this.parent_code.DataPropertyName = "parent_code";
            this.parent_code.HeaderText = "父级码表编码";
            this.parent_code.Name = "parent_code";
            this.parent_code.ReadOnly = true;
            this.parent_code.Width = 120;
            // 
            // parent_name
            // 
            this.parent_name.DataPropertyName = "parent_name";
            this.parent_name.HeaderText = "父级码表名称";
            this.parent_name.Name = "parent_name";
            this.parent_name.ReadOnly = true;
            this.parent_name.Width = 120;
            // 
            // data_source
            // 
            this.data_source.DataPropertyName = "data_source";
            this.data_source.HeaderText = "来源";
            this.data_source.Name = "data_source";
            this.data_source.ReadOnly = true;
            this.data_source.Width = 120;
            // 
            // create_name
            // 
            this.create_name.DataPropertyName = "create_name";
            this.create_name.HeaderText = "创建人";
            this.create_name.Name = "create_name";
            this.create_name.ReadOnly = true;
            this.create_name.Width = 120;
            // 
            // create_time
            // 
            this.create_time.DataPropertyName = "create_time";
            this.create_time.HeaderText = "创建时间";
            this.create_time.Name = "create_time";
            this.create_time.ReadOnly = true;
            this.create_time.Width = 120;
            // 
            // update_name
            // 
            this.update_name.DataPropertyName = "update_name";
            this.update_name.HeaderText = "最后编辑人";
            this.update_name.Name = "update_name";
            this.update_name.ReadOnly = true;
            this.update_name.Width = 120;
            // 
            // update_time
            // 
            this.update_time.DataPropertyName = "update_time";
            this.update_time.HeaderText = "最后编辑时间";
            this.update_time.Name = "update_time";
            this.update_time.ReadOnly = true;
            this.update_time.Width = 120;
            // 
            // remark
            // 
            this.remark.DataPropertyName = "remark";
            this.remark.HeaderText = "备注（项目说明）";
            this.remark.Name = "remark";
            this.remark.ReadOnly = true;
            this.remark.Width = 150;
            // 
            // enable_flag
            // 
            this.enable_flag.DataPropertyName = "enable_flag";
            this.enable_flag.HeaderText = "删除标记";
            this.enable_flag.Name = "enable_flag";
            this.enable_flag.ReadOnly = true;
            this.enable_flag.Visible = false;
            this.enable_flag.Width = 53;
            // 
            // dic_id
            // 
            this.dic_id.DataPropertyName = "dic_id";
            this.dic_id.HeaderText = "码表ID";
            this.dic_id.Name = "dic_id";
            this.dic_id.ReadOnly = true;
            this.dic_id.Visible = false;
            this.dic_id.Width = 66;
            // 
            // parent_id
            // 
            this.parent_id.DataPropertyName = "parent_id";
            this.parent_id.HeaderText = "父级码表ID";
            this.parent_id.Name = "parent_id";
            this.parent_id.ReadOnly = true;
            this.parent_id.Visible = false;
            this.parent_id.Width = 75;
            // 
            // page
            // 
            this.page.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
            this.page.BackColor = System.Drawing.Color.Transparent;
            this.page.BtnTextNext = "下页";
            this.page.BtnTextPrevious = "上页";
            this.page.DisplayStyle = ServiceStationClient.ComponentUI.WinFormPager.DisplayStyleEnum.图片;
            this.page.Location = new System.Drawing.Point(519, 531);
            this.page.Name = "page";
            this.page.PageCount = 0;
            this.page.PageSize = 15;
            this.page.RecordCount = 0;
            this.page.Size = new System.Drawing.Size(480, 31);
            this.page.TabIndex = 9;
            this.page.TextImageRalitions = ServiceStationClient.ComponentUI.WinFormPager.TextImageRalitionEnum.图片显示在文字前方;
            this.page.PageIndexChanged += new ServiceStationClient.ComponentUI.WinFormPager.EventHandler(this.page_PageIndexChanged);
            // 
            // UCDictionaryAddOrEdit
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.page);
            this.Controls.Add(this.tcDicList);
            this.Controls.Add(this.panelEx1);
            this.Name = "UCDictionaryAddOrEdit";
            this.Size = new System.Drawing.Size(1000, 567);
            this.Load += new System.EventHandler(this.UCDictionaryAddOrEdit_Load);
            this.RightToLeftChanged += new System.EventHandler(this.UCDictionaryAddOrEdit_Load);
            this.Controls.SetChildIndex(this.panelEx1, 0);
            this.Controls.SetChildIndex(this.tcDicList, 0);
            this.Controls.SetChildIndex(this.page, 0);
            this.Controls.SetChildIndex(this.pnlOpt, 0);
            this.panelEx1.ResumeLayout(false);
            this.panelEx1.PerformLayout();
            this.tcDicList.ResumeLayout(false);
            this.tpDicList.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dgvDicList)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private ServiceStationClient.ComponentUI.PanelEx panelEx1;
        private ServiceStationClient.ComponentUI.TextBox.TextChooser txtcreate_by;
        private ServiceStationClient.ComponentUI.TextBoxEx txtdic_name;
        private ServiceStationClient.ComponentUI.TextBoxEx txtdic_code;
        private ServiceStationClient.ComponentUI.ButtonEx btnSearch;
        private ServiceStationClient.ComponentUI.ButtonEx btnClear;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label1;
        private ServiceStationClient.ComponentUI.TabControlEx tcDicList;
        private System.Windows.Forms.TabPage tpDicList;
        private ServiceStationClient.ComponentUI.DataGridViewEx dgvDicList;
        private ServiceStationClient.ComponentUI.WinFormPager page;
        private System.Windows.Forms.DataGridViewCheckBoxColumn colCheck;
        private System.Windows.Forms.DataGridViewTextBoxColumn dic_code;
        private System.Windows.Forms.DataGridViewTextBoxColumn dic_name;
        private System.Windows.Forms.DataGridViewComboBoxColumn is_class;
        private System.Windows.Forms.DataGridViewTextBoxColumn parent_code;
        private System.Windows.Forms.DataGridViewTextBoxColumn parent_name;
        private System.Windows.Forms.DataGridViewTextBoxColumn data_source;
        private System.Windows.Forms.DataGridViewTextBoxColumn create_name;
        private System.Windows.Forms.DataGridViewTextBoxColumn create_time;
        private System.Windows.Forms.DataGridViewTextBoxColumn update_name;
        private System.Windows.Forms.DataGridViewTextBoxColumn update_time;
        private System.Windows.Forms.DataGridViewTextBoxColumn remark;
        private System.Windows.Forms.DataGridViewTextBoxColumn enable_flag;
        private System.Windows.Forms.DataGridViewTextBoxColumn dic_id;
        private System.Windows.Forms.DataGridViewTextBoxColumn parent_id;
        private ServiceStationClient.ComponentUI.DateTimePickerEx_sms dtpEnd;
        private ServiceStationClient.ComponentUI.DateTimePickerEx_sms dtpStart;
        private System.Windows.Forms.Label label12;
        private ServiceStationClient.ComponentUI.ComboBoxEx cobDataSources;
        private System.Windows.Forms.Label label3;
    }
}
