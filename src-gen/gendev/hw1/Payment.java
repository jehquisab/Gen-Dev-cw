/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Payment#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link gendev.hw1.Payment#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see gendev.hw1.Hw1Package#getPayment_BookingID()
	 * @model required="true"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' attribute.
	 * @see #setPaymentType(String)
	 * @see gendev.hw1.Hw1Package#getPayment_PaymentType()
	 * @model
	 * @generated
	 */
	String getPaymentType();

	/**
	 * Sets the value of the '{@link gendev.hw1.Payment#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' attribute.
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(String value);

} // Payment
