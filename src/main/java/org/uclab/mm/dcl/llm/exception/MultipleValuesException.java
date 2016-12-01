/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uclab.mm.dcl.llm.exception;

/**
 *
 * @author Rizvi
 */
public class MultipleValuesException extends Exception {
	MultipleValuesException(String s) {
		super(s);
	}

	public String toString() {
		return "Database is notreachable, kindly try little later";
	}
}
