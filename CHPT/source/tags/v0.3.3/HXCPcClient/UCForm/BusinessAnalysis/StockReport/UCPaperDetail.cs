﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace HXCPcClient.UCForm.BusinessAnalysis.StockReport
{
    public partial class UCPaperDetail : UCReport
    {
        public UCPaperDetail()
            : base("v_paper_detail", "账面库存明细表")
        {
            InitializeComponent();
        }
    }
}
