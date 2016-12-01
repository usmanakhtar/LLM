/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.uclab.mm.dcl.llm.objectmodel.FoodLog;
import org.uclab.mm.dcl.llm.objectmodel.SituationLog;
import org.uclab.mm.dcl.llm.objectmodel.SituationNotification;

/**
 *
 * @author Rizvi
 */
public class NutritionMonitorTest {

	public NutritionMonitorTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of doMonitor method, of class NutritionMonitor.
	 */
	@Test
	public void testDoMonitor_Connection_String() throws Exception {
		System.out.println("doMonitor");
		Connection dbConn = null;
		String a = "";
		NutritionMonitor instance = new NutritionMonitor();
		instance.doMonitor(dbConn, a);
		// TODO review the generated test code and remove the default call to
		// fail.
		// fail("The test case is a prototype.");
	}

	/**
	 * Test of getNotificationMessage method, of class NutritionMonitor.
	 */
	@Test(expected = java.lang.AssertionError.class)
	public void testGetNotificationMessage2() {
		System.out.println("getNotificationMessage");
		String MapId = "3";
		String UserId = "31";
		String ConsumedFat = "40";
		NutritionMonitor instance = new NutritionMonitor();
		SituationNotification expResult = null;
		SituationNotification result = instance.getNotificationMessage(MapId,
				UserId, ConsumedFat);
		assertEquals(expResult, result);
	}

	/**
	 * Test of doMonitor method, of class NutritionMonitor.
	 */
	@Test
	public void testDoMonitor_FoodLog() {
		System.out.println("doMonitor");
		FoodLog ObjFoodLog = null;
		NutritionMonitor instance = new NutritionMonitor();
		instance.doMonitor(ObjFoodLog);
		// TODO review the generated test code and remove the default call to
		// fail.
		// fail("The test case is a prototype.");
	}

	/**
	 * Test of getNotificationMessage method, of class NutritionMonitor.
	 */
	@Test(expected = java.lang.AssertionError.class)
	public void testGetNotificationMessage1() {
		System.out.println("getNotificationMessage");
		String MapId = "3";
		String UserId = "31";
		String ConsumedFat = "40";
		NutritionMonitor instance = new NutritionMonitor();
		SituationNotification expResult = null;
		SituationNotification result = instance.getNotificationMessage(MapId,
				UserId, ConsumedFat);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getSituationLog method, of class NutritionMonitor. //
	 */
	/*@Test(expected = java.lang.AssertionError.class)
	public void testGetSituationLog() {
		System.out.println("getSituationLog");
		SituationLog objSituationLog = null;
		String expResult = "";
		String result = NutritionMonitor.getSituationLog(objSituationLog);
		assertEquals(expResult, result);
	}*/

	/**
	 * Test of getNotificationMessage method, of class NutritionMonitor.
	 */
	@Test(expected = java.lang.AssertionError.class)
	public void testGetNotificationMessage() {
		System.out.println("getNotificationMessage");
		String MapId = "3";
		String UserId = "31";
		String ConsumedFat = "40";
		NutritionMonitor instance = new NutritionMonitor();
		SituationNotification expResult = null;
		SituationNotification result = instance.getNotificationMessage(MapId,
				UserId, ConsumedFat);
		assertEquals(expResult, result);
	}

}


