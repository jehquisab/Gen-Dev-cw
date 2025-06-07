/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Payment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.PaymentImpl#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected String paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__BOOKING_ID, oldBookingID,
					bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(String newPaymentType) {
		String oldPaymentType = paymentType;
		paymentType = newPaymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PAYMENT__PAYMENT_TYPE, oldPaymentType,
					paymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PAYMENT__BOOKING_ID:
			return getBookingID();
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			return getPaymentType();
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
		case Hw1Package.PAYMENT__BOOKING_ID:
			setBookingID((Integer) newValue);
			return;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			setPaymentType((String) newValue);
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
		case Hw1Package.PAYMENT__BOOKING_ID:
			setBookingID(BOOKING_ID_EDEFAULT);
			return;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			setPaymentType(PAYMENT_TYPE_EDEFAULT);
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
		case Hw1Package.PAYMENT__BOOKING_ID:
			return bookingID != BOOKING_ID_EDEFAULT;
		case Hw1Package.PAYMENT__PAYMENT_TYPE:
			return PAYMENT_TYPE_EDEFAULT == null ? paymentType != null : !PAYMENT_TYPE_EDEFAULT.equals(paymentType);
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
		result.append(" (bookingID: ");
		result.append(bookingID);
		result.append(", paymentType: ");
		result.append(paymentType);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
