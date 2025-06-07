/**
 */
package gendev.hw1;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Event#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Event#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.Event#getEventID <em>Event ID</em>}</li>
 *   <li>{@link gendev.hw1.Event#getTicketsforevents <em>Ticketsforevents</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv3'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Venue ID</em>' attribute.
	 * @see #setVenueID(int)
	 * @see gendev.hw1.Hw1Package#getEvent_VenueID()
	 * @model required="true"
	 * @generated
	 */
	int getVenueID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Event#getVenueID <em>Venue ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Venue ID</em>' attribute.
	 * @see #getVenueID()
	 * @generated
	 */
	void setVenueID(int value);

	/**
	 * Returns the value of the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event ID</em>' attribute.
	 * @see #setEventID(int)
	 * @see gendev.hw1.Hw1Package#getEvent_EventID()
	 * @model required="true"
	 * @generated
	 */
	int getEventID();

	/**
	 * Sets the value of the '{@link gendev.hw1.Event#getEventID <em>Event ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event ID</em>' attribute.
	 * @see #getEventID()
	 * @generated
	 */
	void setEventID(int value);

	/**
	 * Returns the value of the '<em><b>Ticketsforevents</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Ticket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticketsforevents</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getEvent_Ticketsforevents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ticket> getTicketsforevents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Venue.allInstances()-&gt;exists(v | v.venueID = self.venueID) and Venue.allInstances()-&gt;forAll(v1, v2 | v1 &lt;&gt; v2 implies v1.venueID &lt;&gt; v2.venueID)'"
	 * @generated
	 */
	boolean inv3(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Event
