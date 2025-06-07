/**
 */
package gendev.hw1;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Customer#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getTickets <em>Tickets</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getPayments <em>Payments</em>}</li>
 *   <li>{@link gendev.hw1.Customer#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getCustomer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv2'"
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(long)
	 * @see gendev.hw1.Hw1Package#getCustomer_CardNumber()
	 * @model required="true"
	 * @generated
	 */
	long getCardNumber();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(long value);

	/**
	 * Returns the value of the '<em><b>Tickets</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Ticket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tickets</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getCustomer_Tickets()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<Ticket> getTickets();

	/**
	 * Returns the value of the '<em><b>Payments</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Payment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payments</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getCustomer_Payments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Payment> getPayments();

	/**
	 * Returns the value of the '<em><b>Discounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discounts</em>' containment reference.
	 * @see #setDiscounts(Discount)
	 * @see gendev.hw1.Hw1Package#getCustomer_Discounts()
	 * @model containment="true"
	 * @generated
	 */
	Discount getDiscounts();

	/**
	 * Sets the value of the '{@link gendev.hw1.Customer#getDiscounts <em>Discounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discounts</em>' containment reference.
	 * @see #getDiscounts()
	 * @generated
	 */
	void setDiscounts(Discount value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.tickets.ticketID-&gt;asSet()-&gt;size() = self.tickets-&gt;size()'"
	 * @generated
	 */
	boolean inv2(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Customer
