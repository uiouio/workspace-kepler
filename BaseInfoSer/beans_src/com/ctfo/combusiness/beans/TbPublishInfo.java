package com.ctfo.combusiness.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ctfo.local.bean.ETB_Base;
import com.ctfo.local.exception.CtfoAppException;

@SuppressWarnings("serial")
public class TbPublishInfo extends ETB_Base {
	/**
	 * 日志
	 */
	private static Log log = LogFactory.getLog(TbPublishInfo.class);

	/** 当前系统时间 */
	private Long sysTime;

	private String userName;

	private String msgType;

	private String publicInfoTime;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.INFO_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String infoId;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.INFO_TYPE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String infoType;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.INFO_THEME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String infoTheme;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.INFO_STATUS
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String infoStatus;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.PUBLISH_USER
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String publishUser;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.PUBLISH_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Long publishTime;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.ACCESSORY_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Short accessoryFlag;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.ENT_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String entId;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.IS_SETTOP
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Short isSettop;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.CREATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String createBy;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.CREATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Long createTime;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.UPDATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String updateBy;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.UPDATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Long updateTime;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.ENABLE_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String enableFlag;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.ENDDATE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private Long enddate;

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column TB_PUBLISH_INFO.INFO_CONTENT
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	private String infoContent;

	public Long getSysTime() {
		return sysTime;
	}

	public void setSysTime(Long sysTime) {
		this.sysTime = sysTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.INFO_ID
	 * 
	 * @return the value of TB_PUBLISH_INFO.INFO_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getInfoId() {
		return infoId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.INFO_ID
	 * 
	 * @param infoId
	 *            the value for TB_PUBLISH_INFO.INFO_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.INFO_TYPE
	 * 
	 * @return the value of TB_PUBLISH_INFO.INFO_TYPE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getInfoType() {
		return infoType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.INFO_TYPE
	 * 
	 * @param infoType
	 *            the value for TB_PUBLISH_INFO.INFO_TYPE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.INFO_THEME
	 * 
	 * @return the value of TB_PUBLISH_INFO.INFO_THEME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getInfoTheme() {
		return infoTheme;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.INFO_THEME
	 * 
	 * @param infoTheme
	 *            the value for TB_PUBLISH_INFO.INFO_THEME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setInfoTheme(String infoTheme) {
		this.infoTheme = infoTheme;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.INFO_STATUS
	 * 
	 * @return the value of TB_PUBLISH_INFO.INFO_STATUS
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getInfoStatus() {
		return infoStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.INFO_STATUS
	 * 
	 * @param infoStatus
	 *            the value for TB_PUBLISH_INFO.INFO_STATUS
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setInfoStatus(String infoStatus) {
		this.infoStatus = infoStatus;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.PUBLISH_USER
	 * 
	 * @return the value of TB_PUBLISH_INFO.PUBLISH_USER
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getPublishUser() {
		return publishUser;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.PUBLISH_USER
	 * 
	 * @param publishUser
	 *            the value for TB_PUBLISH_INFO.PUBLISH_USER
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setPublishUser(String publishUser) {
		this.publishUser = publishUser;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.PUBLISH_TIME
	 * 
	 * @return the value of TB_PUBLISH_INFO.PUBLISH_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Long getPublishTime() {
		return publishTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.PUBLISH_TIME
	 * 
	 * @param publishTime
	 *            the value for TB_PUBLISH_INFO.PUBLISH_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setPublishTime(Long publishTime) {
		this.publishTime = publishTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.ACCESSORY_FLAG
	 * 
	 * @return the value of TB_PUBLISH_INFO.ACCESSORY_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Short getAccessoryFlag() {
		return accessoryFlag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.ACCESSORY_FLAG
	 * 
	 * @param accessoryFlag
	 *            the value for TB_PUBLISH_INFO.ACCESSORY_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setAccessoryFlag(Short accessoryFlag) {
		this.accessoryFlag = accessoryFlag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.ENT_ID
	 * 
	 * @return the value of TB_PUBLISH_INFO.ENT_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getEntId() {
		return entId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.ENT_ID
	 * 
	 * @param entId
	 *            the value for TB_PUBLISH_INFO.ENT_ID
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setEntId(String entId) {
		this.entId = entId;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.IS_SETTOP
	 * 
	 * @return the value of TB_PUBLISH_INFO.IS_SETTOP
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Short getIsSettop() {
		return isSettop;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.IS_SETTOP
	 * 
	 * @param isSettop
	 *            the value for TB_PUBLISH_INFO.IS_SETTOP
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setIsSettop(Short isSettop) {
		this.isSettop = isSettop;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.CREATE_BY
	 * 
	 * @return the value of TB_PUBLISH_INFO.CREATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.CREATE_BY
	 * 
	 * @param createBy
	 *            the value for TB_PUBLISH_INFO.CREATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.CREATE_TIME
	 * 
	 * @return the value of TB_PUBLISH_INFO.CREATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Long getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.CREATE_TIME
	 * 
	 * @param createTime
	 *            the value for TB_PUBLISH_INFO.CREATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.UPDATE_BY
	 * 
	 * @return the value of TB_PUBLISH_INFO.UPDATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.UPDATE_BY
	 * 
	 * @param updateBy
	 *            the value for TB_PUBLISH_INFO.UPDATE_BY
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.UPDATE_TIME
	 * 
	 * @return the value of TB_PUBLISH_INFO.UPDATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Long getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.UPDATE_TIME
	 * 
	 * @param updateTime
	 *            the value for TB_PUBLISH_INFO.UPDATE_TIME
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.ENABLE_FLAG
	 * 
	 * @return the value of TB_PUBLISH_INFO.ENABLE_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getEnableFlag() {
		return enableFlag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.ENABLE_FLAG
	 * 
	 * @param enableFlag
	 *            the value for TB_PUBLISH_INFO.ENABLE_FLAG
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.ENDDATE
	 * 
	 * @return the value of TB_PUBLISH_INFO.ENDDATE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public Long getEnddate() {
		return enddate;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.ENDDATE
	 * 
	 * @param enddate
	 *            the value for TB_PUBLISH_INFO.ENDDATE
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setEnddate(Long enddate) {
		this.enddate = enddate;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column TB_PUBLISH_INFO.INFO_CONTENT
	 * 
	 * @return the value of TB_PUBLISH_INFO.INFO_CONTENT
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public String getInfoContent() {
		return infoContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column TB_PUBLISH_INFO.INFO_CONTENT
	 * 
	 * @param infoContent
	 *            the value for TB_PUBLISH_INFO.INFO_CONTENT
	 * 
	 * @abatorgenerated Thu Oct 13 15:08:04 CST 2011
	 */
	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent;
	}

	public String getPublicInfoTime() {
		try {
			if (null != this.getPublishTime()) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(this.getPublishTime());
				Date resultDate = calendar.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				publicInfoTime = sdf.format(resultDate);
			}
		} catch (Exception e) {
			log.debug(e);
			e.printStackTrace();
			throw new CtfoAppException(e);
		}
		return publicInfoTime;
	}

	public void setPublicInfoTime(String publicInfoTime) {
		this.publicInfoTime = publicInfoTime;
	}

}