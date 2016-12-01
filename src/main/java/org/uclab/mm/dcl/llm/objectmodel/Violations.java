/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.objectmodel;

/**
 *
 * @author Rizvi
 */
public class Violations {

	private String UserID;
	private String ActivityID;
	private String RecordedTime;
	private String ActivityTargetDuration;
	private String LogID;

	private String TotalViolations;

	/**
	 * @return the UserID
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * @param UserID
	 *            the UserID to set
	 */
	public void setUserID(String UserID) {
		this.UserID = UserID;
	}

	/**
	 * @return the ActivityID
	 */
	public String getActivityID() {
		return ActivityID;
	}

	/**
	 * @param ActivityID
	 *            the ActivityID to set
	 */
	public void setActivityID(String ActivityID) {
		this.ActivityID = ActivityID;
	}

	/**
	 * @return the StartTime
	 */
	public String getStartTime() {
		return RecordedTime;
	}

	/**
	 * @param StartTime
	 *            the StartTime to set
	 */
	public void setStartTime(String RecordedTime) {
		this.RecordedTime = RecordedTime;
	}

	/**
	 * @return the ActivityTargetDuration
	 */
	public String getActivityTargetDuration() {
		return ActivityTargetDuration;
	}

	/**
	 * @param ActivityTargetDuration
	 *            the ActivityTargetDuration to set
	 */
	public void setActivityTargetDuration(String ActivityTargetDuration) {
		this.ActivityTargetDuration = ActivityTargetDuration;
	}

	/**
	 * @return the LogID
	 */
	public String getLogID() {
		return LogID;
	}

	/**
	 * @param LogID
	 *            the LogID to set
	 */
	public void setLogID(String LogID) {
		this.LogID = LogID;
	}

	/**
	 * @return the TotalViolations
	 */
	public String getTotalViolations() {
		return TotalViolations;
	}

	/**
	 * @param TotalViolations
	 *            the TotalViolations to set
	 */
	public void setTotalViolations(String TotalViolations) {
		this.TotalViolations = TotalViolations;
	}

}
