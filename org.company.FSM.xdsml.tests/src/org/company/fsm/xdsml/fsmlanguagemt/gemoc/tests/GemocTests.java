/**
 */
package org.company.fsm.xdsml.fsmlanguagemt.gemoc.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>gemoc</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GemocTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GemocTests("gemoc Tests");
		suite.addTestSuite(FSMTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(TransitionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemocTests(String name) {
		super(name);
	}

} //GemocTests
