/**
 */
package org.company.fsm.xdsml.fsmlanguagemt.gemoc.impl;

import org.company.fsm.xdsml.fsmlanguagemt.gemoc.FSM;
import org.company.fsm.xdsml.fsmlanguagemt.gemoc.GemocPackage;
import org.company.fsm.xdsml.fsmlanguagemt.gemoc.State;
import org.company.fsm.xdsml.fsmlanguagemt.gemoc.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.impl.StateImpl#getOutcoming <em>Outcoming</em>}</li>
 *   <li>{@link org.company.fsm.xdsml.fsmlanguagemt.gemoc.impl.StateImpl#getFSM <em>FSM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected Transition incoming;

	/**
	 * The cached value of the '{@link #getOutcoming() <em>Outcoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcoming()
	 * @generated
	 * @ordered
	 */
	protected Transition outcoming;

	/**
	 * The cached value of the '{@link #getFSM() <em>FSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFSM()
	 * @generated
	 * @ordered
	 */
	protected FSM fSM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemocPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getIncoming() {
		if (incoming != null && incoming.eIsProxy()) {
			InternalEObject oldIncoming = (InternalEObject)incoming;
			incoming = (Transition)eResolveProxy(oldIncoming);
			if (incoming != oldIncoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemocPackage.STATE__INCOMING, oldIncoming, incoming));
			}
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetIncoming() {
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncoming(Transition newIncoming, NotificationChain msgs) {
		Transition oldIncoming = incoming;
		incoming = newIncoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__INCOMING, oldIncoming, newIncoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncoming(Transition newIncoming) {
		if (newIncoming != incoming) {
			NotificationChain msgs = null;
			if (incoming != null)
				msgs = ((InternalEObject)incoming).eInverseRemove(this, GemocPackage.TRANSITION__STATE, Transition.class, msgs);
			if (newIncoming != null)
				msgs = ((InternalEObject)newIncoming).eInverseAdd(this, GemocPackage.TRANSITION__STATE, Transition.class, msgs);
			msgs = basicSetIncoming(newIncoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__INCOMING, newIncoming, newIncoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getOutcoming() {
		if (outcoming != null && outcoming.eIsProxy()) {
			InternalEObject oldOutcoming = (InternalEObject)outcoming;
			outcoming = (Transition)eResolveProxy(oldOutcoming);
			if (outcoming != oldOutcoming) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemocPackage.STATE__OUTCOMING, oldOutcoming, outcoming));
			}
		}
		return outcoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutcoming() {
		return outcoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcoming(Transition newOutcoming, NotificationChain msgs) {
		Transition oldOutcoming = outcoming;
		outcoming = newOutcoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__OUTCOMING, oldOutcoming, newOutcoming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutcoming(Transition newOutcoming) {
		if (newOutcoming != outcoming) {
			NotificationChain msgs = null;
			if (outcoming != null)
				msgs = ((InternalEObject)outcoming).eInverseRemove(this, GemocPackage.TRANSITION__SRC, Transition.class, msgs);
			if (newOutcoming != null)
				msgs = ((InternalEObject)newOutcoming).eInverseAdd(this, GemocPackage.TRANSITION__SRC, Transition.class, msgs);
			msgs = basicSetOutcoming(newOutcoming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__OUTCOMING, newOutcoming, newOutcoming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM getFSM() {
		if (fSM != null && fSM.eIsProxy()) {
			InternalEObject oldFSM = (InternalEObject)fSM;
			fSM = (FSM)eResolveProxy(oldFSM);
			if (fSM != oldFSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemocPackage.STATE__FSM, oldFSM, fSM));
			}
		}
		return fSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSM basicGetFSM() {
		return fSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFSM(FSM newFSM) {
		FSM oldFSM = fSM;
		fSM = newFSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemocPackage.STATE__FSM, oldFSM, fSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void step(String inputString) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemocPackage.STATE__INCOMING:
				if (incoming != null)
					msgs = ((InternalEObject)incoming).eInverseRemove(this, GemocPackage.TRANSITION__STATE, Transition.class, msgs);
				return basicSetIncoming((Transition)otherEnd, msgs);
			case GemocPackage.STATE__OUTCOMING:
				if (outcoming != null)
					msgs = ((InternalEObject)outcoming).eInverseRemove(this, GemocPackage.TRANSITION__SRC, Transition.class, msgs);
				return basicSetOutcoming((Transition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemocPackage.STATE__INCOMING:
				return basicSetIncoming(null, msgs);
			case GemocPackage.STATE__OUTCOMING:
				return basicSetOutcoming(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemocPackage.STATE__NAME:
				return getName();
			case GemocPackage.STATE__INCOMING:
				if (resolve) return getIncoming();
				return basicGetIncoming();
			case GemocPackage.STATE__OUTCOMING:
				if (resolve) return getOutcoming();
				return basicGetOutcoming();
			case GemocPackage.STATE__FSM:
				if (resolve) return getFSM();
				return basicGetFSM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemocPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case GemocPackage.STATE__INCOMING:
				setIncoming((Transition)newValue);
				return;
			case GemocPackage.STATE__OUTCOMING:
				setOutcoming((Transition)newValue);
				return;
			case GemocPackage.STATE__FSM:
				setFSM((FSM)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GemocPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GemocPackage.STATE__INCOMING:
				setIncoming((Transition)null);
				return;
			case GemocPackage.STATE__OUTCOMING:
				setOutcoming((Transition)null);
				return;
			case GemocPackage.STATE__FSM:
				setFSM((FSM)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GemocPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GemocPackage.STATE__INCOMING:
				return incoming != null;
			case GemocPackage.STATE__OUTCOMING:
				return outcoming != null;
			case GemocPackage.STATE__FSM:
				return fSM != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isValidTrigger(String trigger) {
		// TODO Auto-generated method stub
		return false;
	}

} //StateImpl
