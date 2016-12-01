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
public interface ServiceNotificationChannel {

	public void notifyToRestService(
			SituationNotification objSituationNotification, String endPoint);
}
