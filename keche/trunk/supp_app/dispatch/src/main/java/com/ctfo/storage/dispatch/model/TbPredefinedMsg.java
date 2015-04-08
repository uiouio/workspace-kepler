package com.ctfo.storage.dispatch.model;




public class TbPredefinedMsg extends BaseModel{
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.MSG_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private String msgId ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.MSG_BODY
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private String msgBody = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.ENABLE_FLAG
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private int enableFlag ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.IS_SHARED
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private int isShared =-1;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.OP_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private String opId ;
    private String opName = "";
    private String createUtcStr = "";
    public String getCreateUtcStr() {
		return createUtcStr;
	}

	public void setCreateUtcStr(String createUtcStr) {
		this.createUtcStr = createUtcStr;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	/**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.CREATE_UTC
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private Long createUtc;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.MSG_IDX
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private String msgIdx;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_PREDEFINED_MSG.MSG_TYPE
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    private int msgType;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.MSG_ID
     *
     * @return the value of TB_PREDEFINED_MSG.MSG_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.MSG_ID
     *
     * @param msgId the value for TB_PREDEFINED_MSG.MSG_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.MSG_BODY
     *
     * @return the value of TB_PREDEFINED_MSG.MSG_BODY
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public String getMsgBody() {
        return msgBody;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.MSG_BODY
     *
     * @param msgBody the value for TB_PREDEFINED_MSG.MSG_BODY
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.ENABLE_FLAG
     *
     * @return the value of TB_PREDEFINED_MSG.ENABLE_FLAG
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public int getEnableFlag() {
        return enableFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.ENABLE_FLAG
     *
     * @param enableFlag the value for TB_PREDEFINED_MSG.ENABLE_FLAG
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setEnableFlag(int enableFlag) {
        this.enableFlag = enableFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.IS_SHARED
     *
     * @return the value of TB_PREDEFINED_MSG.IS_SHARED
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public int getIsShared() {
        return isShared;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.IS_SHARED
     *
     * @param isShared the value for TB_PREDEFINED_MSG.IS_SHARED
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setIsShared(int isShared) {
        this.isShared = isShared;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.OP_ID
     *
     * @return the value of TB_PREDEFINED_MSG.OP_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public String getOpId() {
        return opId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.OP_ID
     *
     * @param opId the value for TB_PREDEFINED_MSG.OP_ID
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setOpId(String opId) {
        this.opId = opId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.CREATE_UTC
     *
     * @return the value of TB_PREDEFINED_MSG.CREATE_UTC
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public Long getCreateUtc() {
        return createUtc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.CREATE_UTC
     *
     * @param createUtc the value for TB_PREDEFINED_MSG.CREATE_UTC
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setCreateUtc(Long createUtc) {
        this.createUtc = createUtc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.MSG_IDX
     *
     * @return the value of TB_PREDEFINED_MSG.MSG_IDX
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public String getMsgIdx() {
        return msgIdx;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.MSG_IDX
     *
     * @param msgIdx the value for TB_PREDEFINED_MSG.MSG_IDX
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setMsgIdx(String msgIdx) {
        this.msgIdx = msgIdx;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_PREDEFINED_MSG.MSG_TYPE
     *
     * @return the value of TB_PREDEFINED_MSG.MSG_TYPE
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public int getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_PREDEFINED_MSG.MSG_TYPE
     *
     * @param msgType the value for TB_PREDEFINED_MSG.MSG_TYPE
     *
     * @abatorgenerated Thu Dec 15 14:14:26 CST 2011
     */
    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }
}