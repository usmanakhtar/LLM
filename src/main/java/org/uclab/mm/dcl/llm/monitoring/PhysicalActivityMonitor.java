/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.sql.*;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.apache.log4j.Logger;
import org.uclab.mm.dcl.llm.objectmodel.FoodLog;
import org.uclab.mm.dcl.llm.objectmodel.SituationConditions;
import org.uclab.mm.dcl.llm.objectmodel.SituationEvent;
import org.uclab.mm.dcl.llm.objectmodel.SituationLog;
import org.uclab.mm.dcl.llm.objectmodel.SituationNotification;

/**
 *
 * @author Rizvi
 */
public class PhysicalActivityMonitor implements MonitoringStrategy {

	static Logger log = Logger.getLogger(PhysicalActivityMonitor.class
			.getName());

	/**
	 * 
	 * @param conn
	 * @param a
	 * @throws SQLException
	 *             This method is the manager of the steps perform to manage the
	 *             monitored activities. It find out all the users whose
	 *             monitoring
	 */

	public void doMonitor(Connection conn, String a) throws SQLException {

		List<SituationConditions> objListSituationConditions = new ArrayList<SituationConditions>();
		SituationEvent objSituationEvent = new SituationEvent();
		SituationNotification objSituationNotification = new SituationNotification();
		SituationConditions objSituationConditionsMonitor = new SituationConditions();
		SituationConditions objSituationConditionsMeasuring = new SituationConditions();
		SituationConditions objSituationConditionsConstraints = new SituationConditions();
		SituationLog objSituationLog = new SituationLog();
		String situationLogID = null;
		RestServiceNotification objRestServiceNotification = null;

		CallableStatement callableStatement = conn
				.prepareCall("{call usp_PhysicalActivitiesMonitor()}");
		ResultSet rs = callableStatement.executeQuery();
		if (rs != null) {

			while (rs.next()) {

				String stActivity = rs.getString("Activity");
				String stActivityOperator = rs.getString("ActivityOperator");
				String stActivityValue = rs.getString("Activityvalue");
				String stActivityDataType = rs.getString("ActivityDataType");

				String stMeasuringMetric = rs.getString("MeasuringMetric");
				String stMeasuringOperator = rs.getString("MeasuringOperator");
				String stMeasuringTarget = rs.getString("MeasuringTargetValue");
				int scltime = Integer.parseInt(stMeasuringTarget);
				scltime = scltime / 60;
				String stMeasuringTargetValue = scltime + "h";
				String stMeasuringDataType = rs.getString("MeasuringDataType");

				String stUserID = rs.getString("UserID");
				String stActivityID = rs.getString("ActivityID");
				String stActivityTarget = rs
						.getString("ActivityTargetDuration");
				int sllogtime = Integer.parseInt(stActivityTarget);
				sllogtime = sllogtime / 60;

				String stActivityTargetDuration = sllogtime + "h"; // rs.getString("ActivityTargetDuration");
				String stSituationdate = rs.getString("Situationdate");// not
																		// using
																		// due
																		// to
																		// date
																		// format.

				String stConstraintKey = rs.getString("ConstraintKey");
				String stConstraintOperator = rs
						.getString("ConstraintOperator");
				String stConstraintValue = rs.getString("ConstraintValue");
				String stConstraintDataType = rs
						.getString("ConstraintDataType");

				objSituationLog.setUserID(stUserID);
				objSituationLog.setSituationCategoryID(stActivityID);
				objSituationLog
						.setSituationDescription(stActivityTargetDuration);
				objSituationLog.setSituationDate();
				// situationLogID=getSituationLog(objSituationLog);

				objSituationConditionsMonitor.setConditionKey(stActivity);
				objSituationConditionsMonitor
						.setConditionValue(stActivityValue);
				objSituationConditionsMonitor
						.setConditionValueOperator(stActivityOperator);
				objSituationConditionsMonitor
						.setConditionType(stActivityDataType);

				objSituationConditionsMeasuring
						.setConditionKey(stMeasuringMetric);
				objSituationConditionsMeasuring
						.setConditionValue(stMeasuringTargetValue);
				objSituationConditionsMeasuring
						.setConditionValueOperator(stMeasuringOperator);
				objSituationConditionsMeasuring
						.setConditionType(stMeasuringDataType);

				objSituationConditionsConstraints
						.setConditionKey(stConstraintKey);
				objSituationConditionsConstraints
						.setConditionValue(stConstraintValue);
				objSituationConditionsConstraints
						.setConditionValueOperator(stConstraintOperator);
				objSituationConditionsConstraints
						.setConditionType(stConstraintDataType);

				System.out.println("********** Situation Triggered **********");
				System.out.println("\t User Id:" + stUserID);
				System.out.println("\t Situation Details:");
				System.out.println("\t Current Activity:"
						+ objSituationConditionsMonitor.getConditionValue());
				System.out.println("\t Activity Duration:"
						+ objSituationConditionsMeasuring.getConditionValue());
				System.out
						.println("*****************************************\n");
				System.out.println("****** SCL Recomendation Response *******");

				objListSituationConditions
						.add(objSituationConditionsConstraints);
				objListSituationConditions.add(objSituationConditionsMonitor);
				objListSituationConditions.add(objSituationConditionsMeasuring);

				objSituationEvent
						.setListSConditions(objListSituationConditions);
				objSituationEvent.setSituationID(situationLogID);
				objSituationNotification.setSituationEvent(objSituationEvent);
				objSituationNotification.setUserID(stUserID);
				objRestServiceNotification = new RestServiceNotification();
				// objRestServiceNotification.notifyToRestService(objSituationNotification,
				// "http://163.180.116.185:8080/SCLMiningMind2.5/webresources/SCLService/PushPARecommendation");

				log.debug(stUserID + " " + stMeasuringMetric + " "
						+ stMeasuringTarget);
				// path of log file C:/usr/home/log4j

				System.out.println(stUserID + " " + stMeasuringMetric + " "
						+ stMeasuringTarget);
			}
		}
	}

	public void doMonitor(FoodLog objFoodLog) {

	}

	/**
	 * 
	 * @param objSituationLog
	 * @return This method is used to update the information in log to get the
	 *         respective logid for further usage of SCL for reasoning.
	 */

	protected static String getSituationLog(SituationLog objSituationLog) {
		String situationLogID = null;
		try {
			ClientConfig config = new DefaultClientConfig();
			config.getClasses().add(JacksonJsonProvider.class);
			Client client = Client.create(config);
			final String baseURI = "http://163.180.116.194:8080/MMDataCurationRestfulService/webresources/ServiceCuration/AddSituation";
			WebResource srv = client.resource(UriBuilder.fromUri(baseURI)
					.build());
			ClientResponse serverResponse = srv
					.type(MediaType.APPLICATION_JSON).post(
							ClientResponse.class, objSituationLog);
			situationLogID = serverResponse.getEntity(
					new GenericType<List<String>>() {
					}).get(0);
		} catch (Exception exp) {
			String error = exp.getMessage();
			System.err.println(error + ": ");
			exp.printStackTrace();
		}
		return situationLogID;
	}

}
