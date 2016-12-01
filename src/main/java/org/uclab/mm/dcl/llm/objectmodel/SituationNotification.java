/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.objectmodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rizvi
 */
public class SituationNotification {

	private String UserID;
	private SituationEvent situationEvent = new SituationEvent();

	/**
	 * @return the SituationID
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * 
	 * @param UserID
	 */
	public void setUserID(String UserID) {
		this.UserID = UserID;
	}

	/**
	 * @return the situationEvent
	 */
	public SituationEvent getSituationEvent() {
		return situationEvent;
	}

	/**
	 * @param situationEvent
	 *            the situationEvent to set
	 */
	public void setSituationEvent(SituationEvent situationEvent) {
		this.situationEvent = situationEvent;
	}

}
