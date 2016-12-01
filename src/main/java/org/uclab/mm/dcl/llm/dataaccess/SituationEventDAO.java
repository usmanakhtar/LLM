/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.dataaccess;

import org.uclab.mm.dcl.llm.objectmodel.SituationEvents;

/**
 *
 * @author Rizvi
 */
public interface SituationEventDAO {

	public void persistentSituation(SituationEvents objSituationEvents);

	public SituationEvents retriveSituationEvents();

}
