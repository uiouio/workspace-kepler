package com.ctfo.sys.beans;

public class SysAlarmType {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_ALARM_TYPE.ALARM_CODE
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	private String alarmCode;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_ALARM_TYPE.ALARM_NAME
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	private String alarmName;
	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database column SYS_ALARM_TYPE.ALARM_COMMENT
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	private String alarmComment;

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_ALARM_TYPE.ALARM_CODE
	 * @return  the value of SYS_ALARM_TYPE.ALARM_CODE
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public String getAlarmCode() {
		return alarmCode;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_ALARM_TYPE.ALARM_CODE
	 * @param alarmCode  the value for SYS_ALARM_TYPE.ALARM_CODE
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode == null ? null : alarmCode.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_ALARM_TYPE.ALARM_NAME
	 * @return  the value of SYS_ALARM_TYPE.ALARM_NAME
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public String getAlarmName() {
		return alarmName;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_ALARM_TYPE.ALARM_NAME
	 * @param alarmName  the value for SYS_ALARM_TYPE.ALARM_NAME
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName == null ? null : alarmName.trim();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method returns the value of the database column SYS_ALARM_TYPE.ALARM_COMMENT
	 * @return  the value of SYS_ALARM_TYPE.ALARM_COMMENT
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public String getAlarmComment() {
		return alarmComment;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method sets the value of the database column SYS_ALARM_TYPE.ALARM_COMMENT
	 * @param alarmComment  the value for SYS_ALARM_TYPE.ALARM_COMMENT
	 * @abatorgenerated  Mon Mar 24 16:46:46 CST 2014
	 */
	public void setAlarmComment(String alarmComment) {
		this.alarmComment = alarmComment == null ? null : alarmComment.trim();
	}
}