/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.objectmodel;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maqbool
 */
@XmlRootElement()
public class SituationConditions implements Serializable {

	private String conditionKey;
	private String ConditionValueOperator;
	private String ConditionValue;
	private String ConditionType;

	public SituationConditions() {

	}

	/**
	 * @return the conditionKey
	 */
	public String getConditionKey() {
		return conditionKey;
	}

	/**
	 * @param conditionKey
	 *            the conditionKey to set
	 */
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

	/**
	 * @return the ConditionValueOperator
	 */
	public String getConditionValueOperator() {
		return ConditionValueOperator;
	}

	/**
	 * @param ConditionValueOperator
	 *            the ConditionValueOperator to set
	 */
	public void setConditionValueOperator(String ConditionValueOperator) {
		this.ConditionValueOperator = ConditionValueOperator;
	}

	/**
	 * @return the ConditionValue
	 */
	public String getConditionValue() {
		return ConditionValue;
	}

	/**
	 * @param ConditionValue
	 *            the ConditionValue to set
	 */
	public void setConditionValue(String ConditionValue) {
		this.ConditionValue = ConditionValue;
	}

	/**
	 * @return the ConditionType
	 */
	public String getConditionType() {
		return ConditionType;
	}

	/**
	 * @param ConditionType
	 *            the ConditionType to set
	 */
	public void setConditionType(String ConditionType) {
		this.ConditionType = ConditionType;
	}

}
