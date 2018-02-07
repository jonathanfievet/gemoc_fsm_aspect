/**
 */
package org.company.fsm.xdsml.fsmlanguagemt.gemoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getName <em>Name</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getState <em>State</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
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
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getTransition_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getTransition_State()
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getOutcoming <em>Outcoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(State)
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage#getTransition_Src()
	 * @see org.company.fsm.xdsml.fsmlanguagemt.gemoc.State#getOutcoming
	 * @model opposite="outcoming"
	 * @generated
	 */
	State getSrc();

	/**
	 * Sets the value of the '{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

} // Transition
