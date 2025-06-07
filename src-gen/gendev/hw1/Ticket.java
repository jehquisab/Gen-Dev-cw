/**
 */
package gendev.hw1;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Ticket#getTicketID <em>Ticket ID</em>}</li>
 *   <li>{@link gendev.hw1.Ticket#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.Ticket#isSold <em>Sold</em>}</li>
 *   <li>{@link gendev.hw1.Ticket#getEventID <em>Event ID</em>}</li>
 *   <li>{@link gendev.hw1.Ticket#getPrice <em>Price</em>}</li>
 *   <li>{@link gendev.hw1.Ticket#getUserID <em>User ID</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getTicket()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv1'"
 * @generated
 */
public interface Ticket extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticket ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticket ID</em>' attribute.
	 * @see #setTicketID(int)
	 * @see gendev.hw1.Hw1Package#getTicket_TicketID()
	 * @model required="true"
	 * @generated
	 */
	int getTicketID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#getTicketID <em>Ticket ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ticket ID</em>' attribute.
	 * @see #getTicketID()
	 * @generated
	 */
	void setTicketID(int value);

	/**
	 * Returns the value of the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue ID</em>' attribute.
	 * @see #setVenueID(int)
	 * @see gendev.hw1.Hw1Package#getTicket_VenueID()
	 * @model required="true"
	 * @generated
	 */
	int getVenueID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#getVenueID <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue ID</em>' attribute.
	 * @see #getVenueID()
	 * @generated
	 */
	void setVenueID(int value);

	/**
	 * Returns the value of the '<em><b>Sold</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold</em>' attribute.
	 * @see #setSold(boolean)
	 * @see gendev.hw1.Hw1Package#getTicket_Sold()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSold();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#isSold <em>Sold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sold</em>' attribute.
	 * @see #isSold()
	 * @generated
	 */
	void setSold(boolean value);

	/**
	 * Returns the value of the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event ID</em>' attribute.
	 * @see #setEventID(int)
	 * @see gendev.hw1.Hw1Package#getTicket_EventID()
	 * @model required="true"
	 * @generated
	 */
	int getEventID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#getEventID <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event ID</em>' attribute.
	 * @see #getEventID()
	 * @generated
	 */
	void setEventID(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * The default value is <code>"0.00"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see gendev.hw1.Hw1Package#getTicket_Price()
	 * @model default="0.00" required="true"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(int)
	 * @see gendev.hw1.Hw1Package#getTicket_UserID()
	 * @model required="true"
	 * @generated
	 */
	int getUserID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Ticket#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif self.price&gt;0 then\n\t\t\t\ttrue\n\t\t\telse\n\t\t\t\tfalse\n\t\t\tendif'"
	 * @generated
	 */
	boolean inv1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ticket
