/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.uclab.mm.dcl.llm.objectmodel.SCLResponse;
import org.uclab.mm.dcl.llm.objectmodel.SituationNotification;

/**
 *
 * @author Rizvi
 */
public class RestServiceNotification implements ServiceNotificationChannel {
	/**
	 * 
	 * @param objSituationNotification
	 * @param serviceName
	 *            This method is used to send notification to the SCL through
	 *            PushPARecommendation by consuming the web service.
	 */
	@Override
	public void notifyToRestService(
			SituationNotification objSituationNotification, String serviceName) {
		try {
			ClientConfig config = new DefaultClientConfig();
			config.getClasses().add(JacksonJsonProvider.class);
			Client client = Client.create(config);
			final String baseURI = serviceName;
			// final String baseURI =
			// "http://163.180.116.185:8080/SCLMiningMind2.5/webresources/SCLService/PushPARecommendation";
			WebResource srv = client.resource(UriBuilder.fromUri(baseURI)
					.build());
			ClientResponse ServerResponse = srv
					.type(MediaType.APPLICATION_JSON).post(
							ClientResponse.class, objSituationNotification);
			SCLResponse objResult = ServerResponse.getEntity(SCLResponse.class);
			if (objResult.getResult().size() > 0) {
				if (objResult.getResult().get(0).toString().contains("Err")) {
					System.out.println(objResult.getResult().get(0).toString());
				} else {
					for (String result : objResult.getResult()) {
						System.out.println(result);
					}
				}
			}
		} catch (Exception exp) {
			String error = exp.getMessage();
			System.err.println(error + ": ");
			exp.printStackTrace();
		}

	}

}
