/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.sql.Connection;
import java.sql.SQLException;

import org.uclab.mm.dcl.llm.objectmodel.FoodLog;

/**
 *
 * @author Rizvi
 */
public interface MonitoringStrategy {

	/**
	 * This method is used to monitor the different kids of activities and
	 * nutrition.
	 *
	 * @param dbConn
	 * @param objMonitoringEvent
	 */
	public void doMonitor(Connection dbConn, String objMonitoringEvent)
			throws SQLException;

	public void doMonitor(FoodLog objFoodLog);

}
