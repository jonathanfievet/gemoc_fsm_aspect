/**
 */
package org.company.fsm.xdsml.fsmlanguagemt.gemoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getName <em>Name</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getOutcoming <em>Outcoming</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getFSM <em>FSM</em>}</li>
 * </ul>
 *
 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getState_Incoming()
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getState
	 * @model opposite="state"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Outcoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming</em>' reference.
	 * @see #setOutcoming(Transition)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getState_Outcoming()
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Transition getOutcoming();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getOutcoming <em>Outcoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcoming</em>' reference.
	 * @see #getOutcoming()
	 * @generated
	 */
	void setOutcoming(Transition value);

	/**
	 * Returns the value of the '<em><b>FSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FSM</em>' reference.
	 * @see #setFSM(FSM)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getState_FSM()
	 * @model
	 * @generated
	 */
	FSM getFSM();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getFSM <em>FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FSM</em>' reference.
	 * @see #getFSM()
	 * @generated
	 */
	void setFSM(FSM value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void step(String inputString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isValidTrigger(String trigger);

} // State
