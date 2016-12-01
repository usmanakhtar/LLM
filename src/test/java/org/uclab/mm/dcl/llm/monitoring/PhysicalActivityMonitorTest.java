/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 * http://oopbook.com/junit-testing/junit-testing-in-netbeans/
 */
package org.uclab.mm.dcl.llm.monitoring;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.uclab.mm.dcl.llm.objectmodel.FoodLog;
import org.uclab.mm.dcl.llm.objectmodel.SituationLog;

/**
 *
 * @author Rizvi
 */
public class PhysicalActivityMonitorTest {

	public PhysicalActivityMonitorTest() {
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
	 * Test of doMonitor method, of class PhysicalActivityMonitor.
	 */
	@Test
	// (expected=RuntimeException.class)
	public void testDoMonitor_Connection_String() throws Exception {
		try {
			System.out.println("doMonitor");
			Connection conn = null;
			String a = "";
			PhysicalActivityMonitor instance = new PhysicalActivityMonitor();
			instance.doMonitor(conn, a);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * Test of doMonitor method, of class PhysicalActivityMonitor.
	 */
	@Test
	// (expected=RuntimeException.class)
	public void testDoMonitor_Connection_String1() throws Exception {
		try {
			System.out.println("doMonitor");
			Connection conn = null;
			String a = "";
			PhysicalActivityMonitor instance = new PhysicalActivityMonitor();
			instance.doMonitor(conn, a);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test of getSituationLog method, of class PhysicalActivityMonitor.
	 */
	// @Rule
	// public ExpectedException thrown= ExpectedException.none();
	/*@Test(expected = java.lang.AssertionError.class)
	public void testGetSituationLog() {

		// try
		// {
		System.out.println("getSituationLog");
		SituationLog objSituationLog = null;
		String expResult = "";
		String result = PhysicalActivityMonitor
				.getSituationLog(objSituationLog);
		assertEquals(expResult, result);

	}*/
	/**
	 * Test of getSituationLog method, of class PhysicalActivityMonitor.
	 */
	// @Rule
	// public ExpectedException thrown= ExpectedException.none();
	/*@Test(expected = java.lang.AssertionError.class)
	public void testGetSituationLog1() {

		// try
		// {
		System.out.println("getSituationLog");
		SituationLog objSituationLog = null;
		String expResult = "";
		String result = PhysicalActivityMonitor
				.getSituationLog(objSituationLog);
		assertEquals(expResult, result);

	}*/

}
