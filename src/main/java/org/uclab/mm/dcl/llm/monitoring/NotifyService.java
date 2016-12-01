/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

/**
 *
 * @author Rizvi
 */
public abstract class NotifyService {

	protected ServiceNotificationChannel objServiceNotification;

	protected NotifyService(ServiceNotificationChannel objServiceNotification) {
		this.objServiceNotification = objServiceNotification;
	}

	public abstract void sendNotification();
}
