﻿//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由工具生成。
//     运行时版本:4.0.30319.1026
//
//     对此文件的更改可能会导致不正确的行为，并且如果
//     重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------

// 
// 此源代码是由 Microsoft.VSDesigner 4.0.30319.1026 版自动生成。
// 
#pragma warning disable 1591

namespace yuTongWebService.QueryServiceSettleStatus {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.ComponentModel;
    using System.Xml.Serialization;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="serviceSettleStatusQueryBinding", Namespace="http://isg.yutong.com/serviceSettleStatusQuery/")]
    public partial class serviceSettleStatusQueryService : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        private System.Threading.SendOrPostCallback serviceSettleStatusQueryOperationCompleted;
        
        private bool useDefaultCredentialsSetExplicitly;
        
        /// <remarks/>
        public serviceSettleStatusQueryService() {
            this.Url = "https://isgqas.yutong.com:2222/ISG/ws/invokeService";
            if ((this.IsLocalFileSystemWebService(this.Url) == true)) {
                this.UseDefaultCredentials = true;
                this.useDefaultCredentialsSetExplicitly = false;
            }
            else {
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        public new string Url {
            get {
                return base.Url;
            }
            set {
                if ((((this.IsLocalFileSystemWebService(base.Url) == true) 
                            && (this.useDefaultCredentialsSetExplicitly == false)) 
                            && (this.IsLocalFileSystemWebService(value) == false))) {
                    base.UseDefaultCredentials = false;
                }
                base.Url = value;
            }
        }
        
        public new bool UseDefaultCredentials {
            get {
                return base.UseDefaultCredentials;
            }
            set {
                base.UseDefaultCredentials = value;
                this.useDefaultCredentialsSetExplicitly = true;
            }
        }
        
        /// <remarks/>
        public event serviceSettleStatusQueryCompletedEventHandler serviceSettleStatusQueryCompleted;
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapDocumentMethodAttribute("", RequestNamespace="http://isg.yutong.com/serviceSettleStatusQuery/", ResponseNamespace="http://isg.yutong.com/serviceSettleStatusQuery/", Use=System.Web.Services.Description.SoapBindingUse.Literal, ParameterStyle=System.Web.Services.Protocols.SoapParameterStyle.Wrapped)]
        [return: System.Xml.Serialization.XmlElementAttribute("Result", Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public Result serviceSettleStatusQuery([System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string RequestUser, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string RequestTime, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string RequestType, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] string settlement_no, [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)] clientInfo clientInfo) {
            object[] results = this.Invoke("serviceSettleStatusQuery", new object[] {
                        RequestUser,
                        RequestTime,
                        RequestType,
                        settlement_no,
                        clientInfo});
            return ((Result)(results[0]));
        }
        
        /// <remarks/>
        public void serviceSettleStatusQueryAsync(string RequestUser, string RequestTime, string RequestType, string settlement_no, clientInfo clientInfo) {
            this.serviceSettleStatusQueryAsync(RequestUser, RequestTime, RequestType, settlement_no, clientInfo, null);
        }
        
        /// <remarks/>
        public void serviceSettleStatusQueryAsync(string RequestUser, string RequestTime, string RequestType, string settlement_no, clientInfo clientInfo, object userState) {
            if ((this.serviceSettleStatusQueryOperationCompleted == null)) {
                this.serviceSettleStatusQueryOperationCompleted = new System.Threading.SendOrPostCallback(this.OnserviceSettleStatusQueryOperationCompleted);
            }
            this.InvokeAsync("serviceSettleStatusQuery", new object[] {
                        RequestUser,
                        RequestTime,
                        RequestType,
                        settlement_no,
                        clientInfo}, this.serviceSettleStatusQueryOperationCompleted, userState);
        }
        
        private void OnserviceSettleStatusQueryOperationCompleted(object arg) {
            if ((this.serviceSettleStatusQueryCompleted != null)) {
                System.Web.Services.Protocols.InvokeCompletedEventArgs invokeArgs = ((System.Web.Services.Protocols.InvokeCompletedEventArgs)(arg));
                this.serviceSettleStatusQueryCompleted(this, new serviceSettleStatusQueryCompletedEventArgs(invokeArgs.Results, invokeArgs.Error, invokeArgs.Cancelled, invokeArgs.UserState));
            }
        }
        
        /// <remarks/>
        public new void CancelAsync(object userState) {
            base.CancelAsync(userState);
        }
        
        private bool IsLocalFileSystemWebService(string url) {
            if (((url == null) 
                        || (url == string.Empty))) {
                return false;
            }
            System.Uri wsUri = new System.Uri(url);
            if (((wsUri.Port >= 1024) 
                        && (string.Compare(wsUri.Host, "localHost", System.StringComparison.OrdinalIgnoreCase) == 0))) {
                return true;
            }
            return false;
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1026")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://isg.yutong.com/serviceSettleStatusQuery/")]
    public partial class clientInfo {
        
        private string clientIDField;
        
        private string serviceIDField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string clientID {
            get {
                return this.clientIDField;
            }
            set {
                this.clientIDField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string serviceID {
            get {
                return this.serviceIDField;
            }
            set {
                this.serviceIDField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Xml", "4.0.30319.1026")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="http://isg.yutong.com/serviceSettleStatusQuery/")]
    public partial class Result {
        
        private string stateField;
        
        private string errorMsgField;
        
        private string settlement_noField;
        
        private string info_status_ytField;
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string state {
            get {
                return this.stateField;
            }
            set {
                this.stateField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string errorMsg {
            get {
                return this.errorMsgField;
            }
            set {
                this.errorMsgField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string settlement_no {
            get {
                return this.settlement_noField;
            }
            set {
                this.settlement_noField = value;
            }
        }
        
        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
        public string info_status_yt {
            get {
                return this.info_status_ytField;
            }
            set {
                this.info_status_ytField = value;
            }
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    public delegate void serviceSettleStatusQueryCompletedEventHandler(object sender, serviceSettleStatusQueryCompletedEventArgs e);
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.Web.Services", "4.0.30319.1")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    public partial class serviceSettleStatusQueryCompletedEventArgs : System.ComponentModel.AsyncCompletedEventArgs {
        
        private object[] results;
        
        internal serviceSettleStatusQueryCompletedEventArgs(object[] results, System.Exception exception, bool cancelled, object userState) : 
                base(exception, cancelled, userState) {
            this.results = results;
        }
        
        /// <remarks/>
        public Result Result {
            get {
                this.RaiseExceptionIfNecessary();
                return ((Result)(this.results[0]));
            }
        }
    }
}

#pragma warning restore 1591