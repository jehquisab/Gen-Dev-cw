/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Ticket;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.TicketImpl#getTicketID <em>Ticket ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.TicketImpl#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.TicketImpl#isSold <em>Sold</em>}</li>
 *   <li>{@link gendev.hw1.impl.TicketImpl#getEventID <em>Event ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.TicketImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link gendev.hw1.impl.TicketImpl#getUserID <em>User ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TicketImpl extends MinimalEObjectImpl.Container implements Ticket {
	/**
	 * The default value of the '{@link #getTicketID() <em>Ticket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketID()
	 * @generated
	 * @ordered
	 */
	protected static final int TICKET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTicketID() <em>Ticket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketID()
	 * @generated
	 * @ordered
	 */
	protected int ticketID = TICKET_ID_EDEFAULT;

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
	 * The default value of the '{@link #isSold() <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSold() <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSold()
	 * @generated
	 * @ordered
	 */
	protected boolean sold = SOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEventID() <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventID()
	 * @generated
	 * @ordered
	 */
	protected int eventID = EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected int userID = USER_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.TICKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTicketID() {
		return ticketID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTicketID(int newTicketID) {
		int oldTicketID = ticketID;
		ticketID = newTicketID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__TICKET_ID, oldTicketID, ticketID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__VENUE_ID, oldVenueID, venueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSold() {
		return sold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSold(boolean newSold) {
		boolean oldSold = sold;
		sold = newSold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__SOLD, oldSold, sold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEventID() {
		return eventID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventID(int newEventID) {
		int oldEventID = eventID;
		eventID = newEventID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__EVENT_ID, oldEventID, eventID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(int newUserID) {
		int oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.TICKET__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Ticket::inv1";
		try {
			/**
			 *
			 * inv inv1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if self.price > 0
			 *         then true
			 *         else false
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.TICKET___INV1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ double price = this.getPrice();
				final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_price, Hw1Tables.INT_0).booleanValue();
				/*@NonInvalid*/ boolean result;
				if (gt) {
					result = true;
				} else {
					result = false;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Hw1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.TICKET__TICKET_ID:
			return getTicketID();
		case Hw1Package.TICKET__VENUE_ID:
			return getVenueID();
		case Hw1Package.TICKET__SOLD:
			return isSold();
		case Hw1Package.TICKET__EVENT_ID:
			return getEventID();
		case Hw1Package.TICKET__PRICE:
			return getPrice();
		case Hw1Package.TICKET__USER_ID:
			return getUserID();
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
		case Hw1Package.TICKET__TICKET_ID:
			setTicketID((Integer) newValue);
			return;
		case Hw1Package.TICKET__VENUE_ID:
			setVenueID((Integer) newValue);
			return;
		case Hw1Package.TICKET__SOLD:
			setSold((Boolean) newValue);
			return;
		case Hw1Package.TICKET__EVENT_ID:
			setEventID((Integer) newValue);
			return;
		case Hw1Package.TICKET__PRICE:
			setPrice((Double) newValue);
			return;
		case Hw1Package.TICKET__USER_ID:
			setUserID((Integer) newValue);
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
		case Hw1Package.TICKET__TICKET_ID:
			setTicketID(TICKET_ID_EDEFAULT);
			return;
		case Hw1Package.TICKET__VENUE_ID:
			setVenueID(VENUE_ID_EDEFAULT);
			return;
		case Hw1Package.TICKET__SOLD:
			setSold(SOLD_EDEFAULT);
			return;
		case Hw1Package.TICKET__EVENT_ID:
			setEventID(EVENT_ID_EDEFAULT);
			return;
		case Hw1Package.TICKET__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case Hw1Package.TICKET__USER_ID:
			setUserID(USER_ID_EDEFAULT);
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
		case Hw1Package.TICKET__TICKET_ID:
			return ticketID != TICKET_ID_EDEFAULT;
		case Hw1Package.TICKET__VENUE_ID:
			return venueID != VENUE_ID_EDEFAULT;
		case Hw1Package.TICKET__SOLD:
			return sold != SOLD_EDEFAULT;
		case Hw1Package.TICKET__EVENT_ID:
			return eventID != EVENT_ID_EDEFAULT;
		case Hw1Package.TICKET__PRICE:
			return price != PRICE_EDEFAULT;
		case Hw1Package.TICKET__USER_ID:
			return userID != USER_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.TICKET___INV1__DIAGNOSTICCHAIN_MAP:
			return inv1((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ticketID: ");
		result.append(ticketID);
		result.append(", venueID: ");
		result.append(venueID);
		result.append(", sold: ");
		result.append(sold);
		result.append(", eventID: ");
		result.append(eventID);
		result.append(", price: ");
		result.append(price);
		result.append(", userID: ");
		result.append(userID);
		result.append(')');
		return result.toString();
	}

} //TicketImpl
