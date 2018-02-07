/**
 */
package gemoc;

import org.eclipse.emf.ecore.EObject;
import gemoc.FSM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gemoc.State#getName <em>Name</em>}</li>
 *   <li>{@link gemoc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link gemoc.State#getOutcoming <em>Outcoming</em>}</li>
 * </ul>
 *
 * @see gemoc.GemocPackage#getState()
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
	 * @see gemoc.GemocPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gemoc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemoc.Transition#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(Transition)
	 * @see gemoc.GemocPackage#getState_Incoming()
	 * @see gemoc.Transition#getState
	 * @model opposite="state"
	 * @generated
	 */
	Transition getIncoming();

	/**
	 * Sets the value of the '{@link gemoc.State#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(Transition value);

	/**
	 * Returns the value of the '<em><b>Outcoming</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemoc.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcoming</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcoming</em>' reference.
	 * @see #setOutcoming(Transition)
	 * @see gemoc.GemocPackage#getState_Outcoming()
	 * @see gemoc.Transition#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	Transition getOutcoming();

	/**
	 * Sets the value of the '{@link gemoc.State#getOutcoming <em>Outcoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcoming</em>' reference.
	 * @see #getOutcoming()
	 * @generated
	 */
	void setOutcoming(Transition value);
	
	void setFSM(FSM fsm);

	FSM getFSM();

	void step(String string);
	
	

} // State
