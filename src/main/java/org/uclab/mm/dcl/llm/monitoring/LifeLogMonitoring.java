/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.uclab.mm.dcl.llm.dataaccess.DBConnection;
import org.uclab.mm.dcl.llm.exception.DatabaseConnectionProblem;

/**
 *
 * @author Rizvi
 */
public class LifeLogMonitoring implements Runnable {

	private static Connection conn = null;
	// private static Statement sta = null;
	static org.apache.log4j.Logger log = Logger
			.getLogger(LifeLogMonitoring.class.getName());
	/**
	 * @param args
	 *            the command line arguments
	 */
	static MonitoringContext objMonitoringContext = null;

	public void startMonitoring(String[] args) throws SQLException, IOException {
		args = new String[] { "3" };
		try {
			BasicConfigurator.configure();

			
			log.info("..........welcome for testing.........");
			conn = DBConnection.getDBConnection().getConnection();
			if (conn == null) {
				throw new DatabaseConnectionProblem("cant open database.");
			}

			objMonitoringContext = new MonitoringContext(
					new PhysicalActivityMonitor());
			if (args.length == 0) {

				System.out.println(" plz enter the number of second duration");
				System.exit(0);
			}
			int timelimit = Integer.parseInt(args[0]);

			for (int i = 0; i > -1; i++) {
				System.out.println(" timer : " + i * timelimit + "Sec");
				log.info(" timer : " + i * timelimit + "Sec");
				long startTime = System.currentTimeMillis();
				objMonitoringContext.executeStrategy(conn, "3");
				long endTime = System.currentTimeMillis();
				log.info("That took " + (endTime - startTime) + " milliseconds");
				log.info("-------------------------------");
				Thread.sleep(timelimit * 1000);

			}

		} catch (DatabaseConnectionProblem | SQLException
				| InterruptedException exp) {
			;
			log.error("error exception in database connectivity", exp);

		}

	}

	@Override
	public synchronized void run() {
		try {
			this.startMonitoring(null);
		} catch (SQLException ex) {
			java.util.logging.Logger.getLogger(
					LifeLogMonitoring.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (IOException ex) {
			java.util.logging.Logger.getLogger(
					LifeLogMonitoring.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (IllegalThreadStateException ex) {
			java.util.logging.Logger.getLogger(
					LifeLogMonitoring.class.getName()).log(Level.SEVERE, null,
					ex);
		}
	}

}
