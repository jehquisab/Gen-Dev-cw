/**
 */
package gendev.hw1.impl;

import gendev.hw1.Event;
import gendev.hw1.Hw1Package;
import gendev.hw1.Venue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gendev.hw1.impl.VenueImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VenueImpl extends MinimalEObjectImpl.Container implements Venue {
	/**
	 * The default value of the '{@link #getVenueID() <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenueID()
	 * @generated
	 * @ordered
	 */
	protected static final int VENUE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVenueID() <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenueID()
	 * @generated
	 * @ordered
	 */
	protected int venueID = VENUE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected Event events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VenueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.VENUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVenueID() {
		return venueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVenueID(int newVenueID) {
		int oldVenueID = venueID;
		venueID = newVenueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__VENUE_ID, oldVenueID, venueID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvents() {
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvents(Event newEvents, NotificationChain msgs) {
		Event oldEvents = events;
		events = newEvents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__EVENTS,
					oldEvents, newEvents);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvents(Event newEvents) {
		if (newEvents != events) {
			NotificationChain msgs = null;
			if (events != null)
				msgs = ((InternalEObject) events).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.VENUE__EVENTS, null, msgs);
			if (newEvents != null)
				msgs = ((InternalEObject) newEvents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.VENUE__EVENTS, null, msgs);
			msgs = basicSetEvents(newEvents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.VENUE__EVENTS, newEvents, newEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.VENUE__EVENTS:
			return basicSetEvents(null, msgs);
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
		case Hw1Package.VENUE__VENUE_ID:
			return getVenueID();
		case Hw1Package.VENUE__NAME:
			return getName();
		case Hw1Package.VENUE__CAPACITY:
			return getCapacity();
		case Hw1Package.VENUE__LOCATION:
			return getLocation();
		case Hw1Package.VENUE__EVENTS:
			return getEvents();
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
		case Hw1Package.VENUE__VENUE_ID:
			setVenueID((Integer) newValue);
			return;
		case Hw1Package.VENUE__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.VENUE__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case Hw1Package.VENUE__LOCATION:
			setLocation((String) newValue);
			return;
		case Hw1Package.VENUE__EVENTS:
			setEvents((Event) newValue);
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
		case Hw1Package.VENUE__VENUE_ID:
			setVenueID(VENUE_ID_EDEFAULT);
			return;
		case Hw1Package.VENUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.VENUE__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case Hw1Package.VENUE__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case Hw1Package.VENUE__EVENTS:
			setEvents((Event) null);
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
		case Hw1Package.VENUE__VENUE_ID:
			return venueID != VENUE_ID_EDEFAULT;
		case Hw1Package.VENUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.VENUE__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case Hw1Package.VENUE__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case Hw1Package.VENUE__EVENTS:
			return events != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (venueID: ");
		result.append(venueID);
		result.append(", name: ");
		result.append(name);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //VenueImpl
