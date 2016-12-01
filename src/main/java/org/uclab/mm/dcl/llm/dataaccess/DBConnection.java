/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.dataaccess;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.uclab.mm.dcl.llm.exception.DatabaseConnectionProblem;

/**
 *
 * @author Rizvi
 */
public class DBConnection {

	private static Connection conn = null;

	private DBConnection() {// throws DatabaseConnectionProblem {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// DCL DB Server
			// conn =
			// DriverManager.getConnection("jdbc:sqlserver://163.180.116.194:1433;instance=SQLEXPRESS;databaseName=DBMiningMindsV1_5;user=sa;password=adminsa");
			// End DCL DB Server

			// Local DB
			conn = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MMV2;user=sa;password=123");
			// end of Local DB
		} catch (SQLException | ClassNotFoundException exp) {

			StringWriter errors = new StringWriter();
			exp.printStackTrace(new PrintWriter(errors));
			System.out.println("conn exception " + exp);

		}
	}

	public Connection getConnection() {
		return conn;
	}

	public static DBConnection getDBConnection() {
		return DBConnectionHolder.INSTANCE;
	}

	private static class DBConnectionHolder {

		private static final DBConnection INSTANCE = new DBConnection();

	}
}
