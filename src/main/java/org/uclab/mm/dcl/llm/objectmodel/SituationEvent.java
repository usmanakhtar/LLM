/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.objectmodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rizvi
 */
@XmlRootElement()
public class SituationEvent implements Serializable {

	private String SituationID;
	private List<SituationConditions> ListSConditions = new ArrayList<SituationConditions>();

	/**
	 * @return the SituationID
	 */
	public String getSituationID() {
		return SituationID;
	}

	/**
	 * @param SituationID
	 *            the SituationID to set
	 */
	public void setSituationID(String SituationID) {
		this.SituationID = SituationID;
	}

	/**
	 * @return the ListSConditions
	 */
	public List<SituationConditions> getListSConditions() {
		return ListSConditions;
	}

	/**
	 * @param ListSConditions
	 *            the ListSConditions to set
	 */
	public void setListSConditions(List<SituationConditions> ListSConditions) {
		this.ListSConditions = ListSConditions;
	}

}
