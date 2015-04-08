package com.ctfo.storage.dispatch.model;



import java.io.Serializable;

public class TbSim extends BaseModel implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.SID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String sid ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.ENT_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String entId = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.COMMADDR
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String commaddr = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.PASSWORD
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String password = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.ICCID_ELECTRON
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String iccidElectron = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.BUSINESS_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String businessId = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.COMBO_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private Long comboId =-1l;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.SVC_START
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private Long svcStart =-1l;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.SVC_STOP
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private Long svcStop =-1l;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.SUDESC
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String sudesc = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.PROVINCE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String province = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.CREATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String createBy;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.CREATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String createTime ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.UPDATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String updateBy ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.UPDATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String updateTime ;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.ENABLE_FLAG
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String enableFlag = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.SIM_STATE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String simState = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.ICCID_PRINT
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String iccidPrint = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.IMSI
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String imsi = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.APN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String apn = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.PIN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String pin = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.PUK
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String puk = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column TB_SIM.CITY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    private String city = "";


    /**
     * 交付状态(0:交付中;1:未交付;2:已交付;3:交付未通过)
     */
    private Long deliveryStatus = -1l;
    /**
     * 失效时间
     */
    private Long expireTime = -1l;
    /**
     * 最近缴费日期
     */
    private Long lastPayTime = -1l;
    /**
     * 开卡日期
     */
    private Long openTime = -1l;
    
    /**
     * 真实sim卡号
     */
    private String realcommanddr = "";
    
    
    /**
	 * 获取真实sim卡号的值
	 * @return realcommanddr  
	 */
	public String getRealcommanddr() {
		return realcommanddr;
	}

	/**
	 * 设置真实sim卡号的值
	 * @param realcommanddr
	 */
	public void setRealcommanddr(String realcommanddr) {
		this.realcommanddr = realcommanddr;
	}

	/**
	 * 获取开卡日期的值
	 * @return openTime  
	 */
	public Long getOpenTime() {
		return openTime;
	}

	/**
	 * 设置开卡日期的值
	 * @param openTime
	 */
	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}

	/**
	 * 获取最近缴费日期的值
	 * @return lastPayTime  
	 */
	public Long getLastPayTime() {
		return lastPayTime;
	}

	/**
	 * 设置最近缴费日期的值
	 * @param lastPayTime
	 */
	public void setLastPayTime(Long lastPayTime) {
		this.lastPayTime = lastPayTime;
	}

	/**
	 * 获取失效时间的值
	 * @return expireTime  
	 */
	public Long getExpireTime() {
		return expireTime;
	}

	/**
	 * 设置失效时间的值
	 * @param expireTime
	 */
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * 获取交付状态(0:交付中;1:未交付;2:已交付;3:交付未通过)的值
	 * @return deliveryStatus  
	 */
	public Long getDeliveryStatus() {
		return deliveryStatus;
	}

	/**
	 * 设置交付状态(0:交付中;1:未交付;2:已交付;3:交付未通过)的值
	 * @param deliveryStatus
	 */
	public void setDeliveryStatus(Long deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getSid() {
        return sid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.SID
     *
     * @param sid the value for TB_SIM.SID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.ENT_ID
     *
     * @return the value of TB_SIM.ENT_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getEntId() {
        return entId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.ENT_ID
     *
     * @param entId the value for TB_SIM.ENT_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setEntId(String entId) {
        this.entId = entId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.COMMADDR
     *
     * @return the value of TB_SIM.COMMADDR
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getCommaddr() {
        return commaddr;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.COMMADDR
     *
     * @param commaddr the value for TB_SIM.COMMADDR
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setCommaddr(String commaddr) {
        this.commaddr = commaddr;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.PASSWORD
     *
     * @return the value of TB_SIM.PASSWORD
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.PASSWORD
     *
     * @param password the value for TB_SIM.PASSWORD
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.ICCID_ELECTRON
     *
     * @return the value of TB_SIM.ICCID_ELECTRON
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getIccidElectron() {
        return iccidElectron;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.ICCID_ELECTRON
     *
     * @param iccidElectron the value for TB_SIM.ICCID_ELECTRON
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setIccidElectron(String iccidElectron) {
        this.iccidElectron = iccidElectron;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.BUSINESS_ID
     *
     * @return the value of TB_SIM.BUSINESS_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.BUSINESS_ID
     *
     * @param businessId the value for TB_SIM.BUSINESS_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.COMBO_ID
     *
     * @return the value of TB_SIM.COMBO_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public Long getComboId() {
        return comboId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.COMBO_ID
     *
     * @param comboId the value for TB_SIM.COMBO_ID
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setComboId(Long comboId) {
        this.comboId = comboId;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.SVC_START
     *
     * @return the value of TB_SIM.SVC_START
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public Long getSvcStart() {
        return svcStart;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.SVC_START
     *
     * @param svcStart the value for TB_SIM.SVC_START
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setSvcStart(Long svcStart) {
        this.svcStart = svcStart;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.SVC_STOP
     *
     * @return the value of TB_SIM.SVC_STOP
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public Long getSvcStop() {
        return svcStop;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.SVC_STOP
     *
     * @param svcStop the value for TB_SIM.SVC_STOP
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setSvcStop(Long svcStop) {
        this.svcStop = svcStop;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.SUDESC
     *
     * @return the value of TB_SIM.SUDESC
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getSudesc() {
        return sudesc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.SUDESC
     *
     * @param sudesc the value for TB_SIM.SUDESC
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setSudesc(String sudesc) {
        this.sudesc = sudesc;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.PROVINCE
     *
     * @return the value of TB_SIM.PROVINCE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.PROVINCE
     *
     * @param province the value for TB_SIM.PROVINCE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.CREATE_BY
     *
     * @return the value of TB_SIM.CREATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.CREATE_BY
     *
     * @param createBy the value for TB_SIM.CREATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.CREATE_TIME
     *
     * @return the value of TB_SIM.CREATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.CREATE_TIME
     *
     * @param createTime the value for TB_SIM.CREATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.UPDATE_BY
     *
     * @return the value of TB_SIM.UPDATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.UPDATE_BY
     *
     * @param updateBy the value for TB_SIM.UPDATE_BY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.UPDATE_TIME
     *
     * @return the value of TB_SIM.UPDATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.UPDATE_TIME
     *
     * @param updateTime the value for TB_SIM.UPDATE_TIME
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.ENABLE_FLAG
     *
     * @return the value of TB_SIM.ENABLE_FLAG
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getEnableFlag() {
        return enableFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.ENABLE_FLAG
     *
     * @param enableFlag the value for TB_SIM.ENABLE_FLAG
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.SIM_STATE
     *
     * @return the value of TB_SIM.SIM_STATE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getSimState() {
        return simState;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.SIM_STATE
     *
     * @param simState the value for TB_SIM.SIM_STATE
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setSimState(String simState) {
        this.simState = simState;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.ICCID_PRINT
     *
     * @return the value of TB_SIM.ICCID_PRINT
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getIccidPrint() {
        return iccidPrint;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.ICCID_PRINT
     *
     * @param iccidPrint the value for TB_SIM.ICCID_PRINT
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setIccidPrint(String iccidPrint) {
        this.iccidPrint = iccidPrint;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.IMSI
     *
     * @return the value of TB_SIM.IMSI
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.IMSI
     *
     * @param imsi the value for TB_SIM.IMSI
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.APN
     *
     * @return the value of TB_SIM.APN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getApn() {
        return apn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.APN
     *
     * @param apn the value for TB_SIM.APN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setApn(String apn) {
        this.apn = apn;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.PIN
     *
     * @return the value of TB_SIM.PIN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getPin() {
        return pin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.PIN
     *
     * @param pin the value for TB_SIM.PIN
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.PUK
     *
     * @return the value of TB_SIM.PUK
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getPuk() {
        return puk;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.PUK
     *
     * @param puk the value for TB_SIM.PUK
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setPuk(String puk) {
        this.puk = puk;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column TB_SIM.CITY
     *
     * @return the value of TB_SIM.CITY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column TB_SIM.CITY
     *
     * @param city the value for TB_SIM.CITY
     *
     * @abatorgenerated Sat Oct 15 11:33:28 CST 2011
     */
    public void setCity(String city) {
        this.city = city;
    }
}