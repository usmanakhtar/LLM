/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import org.uclab.mm.dcl.llm.objectmodel.SituationNotification;

/**
 *
 * @author Rizvi
 */
public class SCLSituationNotification extends NotifyService {

	private SituationNotification objSituationNotification;
	private String serviceName;

	public SCLSituationNotification(
			SituationNotification objSituationNotification, String serviceName,
			ServiceNotificationChannel objServiceNotification) {
		super(objServiceNotification);
		this.objSituationNotification = objSituationNotification;
		this.serviceName = serviceName;

	}

	@Override
	public void sendNotification() {
		objServiceNotification.notifyToRestService(objSituationNotification,
				serviceName);
	}

}
