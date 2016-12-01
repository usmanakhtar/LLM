/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Rizvi
 */
public class MonitoringContext {

	private MonitoringStrategy objMonitoringStrategy;

	public MonitoringContext(MonitoringStrategy objMonitoringStrategy) {
		this.objMonitoringStrategy = objMonitoringStrategy;
	}

	public void executeStrategy(Connection conn, String objString)
			throws SQLException {
		objMonitoringStrategy.doMonitor(conn, objString);
	}

}
