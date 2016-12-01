/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.objectmodel;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.uclab.mm.dcl.llm.dataaccess.DBConnection;

/**
 *
 * @author Rizvi
 */
public class VoilationNotification implements Serializable {

	private List<Violations> listViolations = new ArrayList<Violations>();

	public List<Violations> getViolations() {
		Connection conn = null;
		Statement sta = null;
		try {
			conn = DBConnection.getDBConnection().getConnection();
			sta = conn.createStatement();
			/*
			 * CallableStatement callableStatement =
			 * conn.prepareCall("{call usp_PhysicalActivitiesMonitor()}");
			 * ResultSet rs = callableStatement.executeQuery();
			 */
			CallableStatement callableStatement = conn
					.prepareCall("{call usp_GetTopViolations()}");
			ResultSet rs = callableStatement.executeQuery();
			// ResultSet rs =
			// sta.executeQuery("select top 10 ActivityID, ActivityTargetDuration, RecordedTime,Log_Id, UserID from tbllog_CurrentLifeLog where ActivityStatus!='NM' order by RecordedTime desc");
			if (rs != null) {
				// String[] result = new String[7];
				while (rs.next()) {
					String UserID = rs.getString("UserID");
					String ActivityID = rs.getString("ActivityID");
					String StartTime = rs.getString("RecordedTime");
					String ActivityTargetDuration = rs
							.getString("ActivityTargetDuration");
					String LogID = rs.getString("Log_Id");
					Violations objViolations = new Violations();
					objViolations.setActivityID(ActivityID);
					objViolations
							.setActivityTargetDuration(ActivityTargetDuration);
					objViolations.setStartTime(StartTime);
					objViolations.setLogID(LogID);
					objViolations.setUserID(UserID);
					listViolations.add(objViolations);
				}
			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
		}
		return listViolations;
	}

	public List<Violations> getMaxViolations(String maxlgid) {
		Connection conn = null;
		Statement sta = null;
		try {
			conn = DBConnection.getDBConnection().getConnection();
			// sta = conn.createStatement();
			/*
			 * CallableStatement callableStatement =
			 * conn.prepareCall("{call usp_PhysicalActivitiesMonitor()}");
			 * ResultSet rs = callableStatement.executeQuery();
			 */
			CallableStatement callableStatement = conn
					.prepareCall("{call usp_GetMaxViolationsLog( " + maxlgid
							+ ")}");
			ResultSet rs = callableStatement.executeQuery();
			// ResultSet rs =
			// sta.executeQuery("select top 10 ActivityID, ActivityTargetDuration, RecordedTime,Log_Id, UserID from tbllog_CurrentLifeLog where ActivityStatus!='NM' and Log_id>'"
			// + maxlgid + "'order by RecordedTime desc");
			if (rs != null) {
				// String[] result = new String[7];
				while (rs.next()) {
					String UserID = rs.getString("UserID");
					String ActivityID = rs.getString("ActivityID");
					String StartTime = rs.getString("RecordedTime");
					String ActivityTargetDuration = rs
							.getString("ActivityTargetDuration");
					String LogID = rs.getString("Log_Id");
					Violations objViolations = new Violations();
					objViolations.setActivityID(ActivityID);
					objViolations
							.setActivityTargetDuration(ActivityTargetDuration);
					objViolations.setStartTime(StartTime);
					objViolations.setLogID(LogID);
					objViolations.setUserID(UserID);
					listViolations.add(objViolations);
				}
			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
		}
		return listViolations;
	}

	public List<Violations> getTotalViolations() {
		Connection conn = null;
		Statement sta = null;
		try {
			conn = DBConnection.getDBConnection().getConnection();

			CallableStatement callableStatement = conn
					.prepareCall("{call usp_GetTotalViolations()}");
			ResultSet rs = callableStatement.executeQuery();
			// ResultSet rs =
			// sta.executeQuery("select userid,COUNT(userid)TotalViolations from tbllog_CurrentLifeLog where ActivityStatus!='NM' group by UserId");
			if (rs != null) {
				// String[] result = new String[7];
				while (rs.next()) {
					String UserID = rs.getString("UserID");
					String TotalViolations = rs.getString("TotalViolations");
					Violations objViolations = new Violations();
					objViolations.setUserID(UserID);
					objViolations.setTotalViolations(TotalViolations);
					listViolations.add(objViolations);
				}
			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
		}
		return listViolations;
	}

	public List<Violations> getUserViolations(String userId) {

		Connection conn = null;
		Statement sta = null;
		try {
			conn = DBConnection.getDBConnection().getConnection();

			sta = conn.createStatement();

			CallableStatement callableStatement = conn
					.prepareCall("{call usp_GetUserViolations( " + userId
							+ ")}");
			ResultSet rs = callableStatement.executeQuery();

			// ResultSet rs =
			// sta.executeQuery("select  ActivityID, ActivityTargetDuration, RecordedTime,Log_Id, UserID from tbllog_CurrentLifeLog where ActivityStatus!='NM' and UserId='"
			// + uid + "'");
			if (rs != null) {
				// String[] result = new String[7];
				while (rs.next()) {

					String UserID = rs.getString("UserID");
					String ActivityID = rs.getString("ActivityID");
					String StartTime = rs.getString("RecordedTime");
					String ActivityTargetDuration = rs
							.getString("ActivityTargetDuration");
					String LogID = rs.getString("Log_Id");
					Violations objViolations = new Violations();
					objViolations.setActivityID(ActivityID);
					objViolations
							.setActivityTargetDuration(ActivityTargetDuration);
					objViolations.setStartTime(StartTime);
					objViolations.setLogID(LogID);
					objViolations.setUserID(UserID);
					listViolations.add(objViolations);

				}

			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
		}
		return listViolations;
	}

	public List<Violations> getLogDeatails(String logId) {

		Connection conn = null;
		Statement sta = null;
		try {
			conn = DBConnection.getDBConnection().getConnection();

			sta = conn.createStatement();
			CallableStatement callableStatement = conn
					.prepareCall("{call usp_GetLogDeatails( " + logId + ")}");
			ResultSet rs = callableStatement.executeQuery();

			// ResultSet rs =
			// sta.executeQuery("select ActivityID, ActivityTargetDuration, RecordedTime,Log_Id, UserID from tbllog_CurrentLifeLog where log_Id='"
			// + lgid + "'");
			if (rs != null) {
				// String[] result = new String[7];
				while (rs.next()) {

					String UserID = rs.getString("UserID");
					String ActivityID = rs.getString("ActivityID");
					String StartTime = rs.getString("RecordedTime");
					String ActivityTargetDuration = rs
							.getString("ActivityTargetDuration");
					String LogID = rs.getString("Log_Id");
					Violations objViolations = new Violations();
					objViolations.setActivityID(ActivityID);
					objViolations
							.setActivityTargetDuration(ActivityTargetDuration);
					objViolations.setStartTime(StartTime);
					objViolations.setLogID(LogID);
					objViolations.setUserID(UserID);
					listViolations.add(objViolations);

				}

			}
		} catch (Exception e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
		}
		return listViolations;
	}

}
