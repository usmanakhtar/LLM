/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.dataaccess;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.uclab.mm.dcl.llm.objectmodel.SituationEvents;

/**
 *
 * @author Rizvi
 */
public class SituationEventDAOImpTest{
  
  public SituationEventDAOImpTest(){
  }
  
  @BeforeClass
  public static void setUpClass(){
  }
  
  @AfterClass
  public static void tearDownClass(){
  }
  
  @Before
  public void setUp(){
  }
  
  @After
  public void tearDown(){
  }

  /**
   * Test of persistentSituation method, of class SituationEventDAOImp.
   */
  @Test
  public void testPersistentSituation(){
    System.out.println("persistentSituation");
    SituationEvents objSituationEvents = null;
    SituationEventDAOImp instance = new SituationEventDAOImp();
    instance.persistentSituation(objSituationEvents);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }
  /**
   * Test of persistentSituation method, of class SituationEventDAOImp.
   */
  @Test
  public void testPersistentSituation1(){
    System.out.println("persistentSituation");
    SituationEvents objSituationEvents = null;
    SituationEventDAOImp instance = new SituationEventDAOImp();
    instance.persistentSituation(objSituationEvents);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }
  
  /**
   * Test of persistentSituation method, of class SituationEventDAOImp.
   */
  @Test
  public void testPersistentSituation2(){
    System.out.println("persistentSituation");
    SituationEvents objSituationEvents = null;
    SituationEventDAOImp instance = new SituationEventDAOImp();
    instance.persistentSituation(objSituationEvents);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }

  /**
   * Test of retriveSituationEvents method, of class SituationEventDAOImp.
   */
  @Test
  public void testRetriveSituationEvents(){
    System.out.println("retriveSituationEvents");
    SituationEventDAOImp instance = new SituationEventDAOImp();
    SituationEvents expResult = null;
    SituationEvents result = instance.retriveSituationEvents();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }
  /**
   * Test of retriveSituationEvents method, of class SituationEventDAOImp.
   */
  @Test
  public void testRetriveSituationEvents1(){
    System.out.println("retriveSituationEvents");
    SituationEventDAOImp instance = new SituationEventDAOImp();
    SituationEvents expResult = null;
    SituationEvents result = instance.retriveSituationEvents();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }

  /**
   * Test of retriveSituationEvents method, of class SituationEventDAOImp.
   */
  @Test
  public void testRetriveSituationEvents2(){
    System.out.println("retriveSituationEvents");
    SituationEventDAOImp instance = new SituationEventDAOImp();
    SituationEvents expResult = null;
    SituationEvents result = instance.retriveSituationEvents();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }
  /**
   * Test of timeCal method, of class SituationEventDAOImp.
   */
  @Test
  public void testTimeCal(){
    System.out.println("timeCal");
    String measuringParameter = "1h:20m";
    SituationEventDAOImp instance = new SituationEventDAOImp();
    String expResult = "80";
    String result = instance.timeCal(measuringParameter);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
   // fail("The test case is a prototype.");
  }
  
}
