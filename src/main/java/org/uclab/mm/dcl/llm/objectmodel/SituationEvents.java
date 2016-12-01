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
public class SituationEvents implements Serializable {

	private List<SituationEvent> listSEvents = new ArrayList<SituationEvent>();

	/**
	 * @return the listSEvents
	 */
	public List<SituationEvent> getListSEvents() {
		return listSEvents;
	}

	/**
	 * @param listSEvents
	 *            the listSEvents to set
	 */
	public void setListSEvents(List<SituationEvent> listSEvents) {
		this.listSEvents = listSEvents;
	}
}
