/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.UserImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 0;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.AdminImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADMIN_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CustomerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CARD_NUMBER = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tickets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TICKETS = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENTS = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DISCOUNTS = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Inv2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___INV2__DIAGNOSTICCHAIN_MAP = USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DiscountImpl <em>Discount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DiscountImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDiscount()
	 * @generated
	 */
	int DISCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Discount ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__DISCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT__IS_ACTIVE = 2;

	/**
	 * The number of structural features of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Discount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PaymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 3;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.TicketImpl <em>Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.TicketImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getTicket()
	 * @generated
	 */
	int TICKET = 4;

	/**
	 * The feature id for the '<em><b>Ticket ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__TICKET_ID = 0;

	/**
	 * The feature id for the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__VENUE_ID = 1;

	/**
	 * The feature id for the '<em><b>Sold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__SOLD = 2;

	/**
	 * The feature id for the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__EVENT_ID = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__PRICE = 4;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET__USER_ID = 5;

	/**
	 * The number of structural features of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Inv1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET___INV1__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICKET_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.EventImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VENUE_ID = 1;

	/**
	 * The feature id for the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Ticketsforevents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TICKETSFOREVENTS = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Inv3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___INV3__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.VenueImpl <em>Venue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.VenueImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getVenue()
	 * @generated
	 */
	int VENUE = 7;

	/**
	 * The feature id for the '<em><b>Venue ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__VENUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see gendev.hw1.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Admin#getAdminID <em>Admin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin ID</em>'.
	 * @see gendev.hw1.Admin#getAdminID()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_AdminID();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see gendev.hw1.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Customer#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see gendev.hw1.Customer#getCardNumber()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_CardNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Customer#getTickets <em>Tickets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tickets</em>'.
	 * @see gendev.hw1.Customer#getTickets()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Tickets();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Customer#getPayments <em>Payments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payments</em>'.
	 * @see gendev.hw1.Customer#getPayments()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Payments();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Customer#getDiscounts <em>Discounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discounts</em>'.
	 * @see gendev.hw1.Customer#getDiscounts()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Discounts();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Customer#inv2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv2</em>' operation.
	 * @see gendev.hw1.Customer#inv2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCustomer__Inv2__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Discount <em>Discount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discount</em>'.
	 * @see gendev.hw1.Discount
	 * @generated
	 */
	EClass getDiscount();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Discount#getDiscountID <em>Discount ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount ID</em>'.
	 * @see gendev.hw1.Discount#getDiscountID()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_DiscountID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Discount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Discount#getName()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Discount#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see gendev.hw1.Discount#isIsActive()
	 * @see #getDiscount()
	 * @generated
	 */
	EAttribute getDiscount_IsActive();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see gendev.hw1.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see gendev.hw1.Payment#getBookingID()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Payment#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see gendev.hw1.Payment#getPaymentType()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentType();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Ticket <em>Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ticket</em>'.
	 * @see gendev.hw1.Ticket
	 * @generated
	 */
	EClass getTicket();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#getTicketID <em>Ticket ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticket ID</em>'.
	 * @see gendev.hw1.Ticket#getTicketID()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_TicketID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#getVenueID <em>Venue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue ID</em>'.
	 * @see gendev.hw1.Ticket#getVenueID()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_VenueID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#isSold <em>Sold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sold</em>'.
	 * @see gendev.hw1.Ticket#isSold()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Sold();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#getEventID <em>Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event ID</em>'.
	 * @see gendev.hw1.Ticket#getEventID()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_EventID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see gendev.hw1.Ticket#getPrice()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_Price();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Ticket#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see gendev.hw1.Ticket#getUserID()
	 * @see #getTicket()
	 * @generated
	 */
	EAttribute getTicket_UserID();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Ticket#inv1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv1</em>' operation.
	 * @see gendev.hw1.Ticket#inv1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTicket__Inv1__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see gendev.hw1.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see gendev.hw1.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see gendev.hw1.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see gendev.hw1.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Event#getVenueID <em>Venue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue ID</em>'.
	 * @see gendev.hw1.Event#getVenueID()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_VenueID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Event#getEventID <em>Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event ID</em>'.
	 * @see gendev.hw1.Event#getEventID()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventID();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Event#getTicketsforevents <em>Ticketsforevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ticketsforevents</em>'.
	 * @see gendev.hw1.Event#getTicketsforevents()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Ticketsforevents();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Event#inv3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv3</em>' operation.
	 * @see gendev.hw1.Event#inv3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEvent__Inv3__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venue</em>'.
	 * @see gendev.hw1.Venue
	 * @generated
	 */
	EClass getVenue();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getVenueID <em>Venue ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Venue ID</em>'.
	 * @see gendev.hw1.Venue#getVenueID()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_VenueID();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Venue#getName()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see gendev.hw1.Venue#getCapacity()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Venue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see gendev.hw1.Venue#getLocation()
	 * @see #getVenue()
	 * @generated
	 */
	EAttribute getVenue_Location();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Venue#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Events</em>'.
	 * @see gendev.hw1.Venue#getEvents()
	 * @see #getVenue()
	 * @generated
	 */
	EReference getVenue_Events();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.AdminImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Admin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ADMIN_ID = eINSTANCE.getAdmin_AdminID();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CustomerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CARD_NUMBER = eINSTANCE.getCustomer_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Tickets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__TICKETS = eINSTANCE.getCustomer_Tickets();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENTS = eINSTANCE.getCustomer_Payments();

		/**
		 * The meta object literal for the '<em><b>Discounts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__DISCOUNTS = eINSTANCE.getCustomer_Discounts();

		/**
		 * The meta object literal for the '<em><b>Inv2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___INV2__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCustomer__Inv2__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DiscountImpl <em>Discount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DiscountImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDiscount()
		 * @generated
		 */
		EClass DISCOUNT = eINSTANCE.getDiscount();

		/**
		 * The meta object literal for the '<em><b>Discount ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__DISCOUNT_ID = eINSTANCE.getDiscount_DiscountID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__NAME = eINSTANCE.getDiscount_Name();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOUNT__IS_ACTIVE = eINSTANCE.getDiscount_IsActive();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PaymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__BOOKING_ID = eINSTANCE.getPayment_BookingID();

		/**
		 * The meta object literal for the '<em><b>Payment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_TYPE = eINSTANCE.getPayment_PaymentType();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.TicketImpl <em>Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.TicketImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getTicket()
		 * @generated
		 */
		EClass TICKET = eINSTANCE.getTicket();

		/**
		 * The meta object literal for the '<em><b>Ticket ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__TICKET_ID = eINSTANCE.getTicket_TicketID();

		/**
		 * The meta object literal for the '<em><b>Venue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__VENUE_ID = eINSTANCE.getTicket_VenueID();

		/**
		 * The meta object literal for the '<em><b>Sold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__SOLD = eINSTANCE.getTicket_Sold();

		/**
		 * The meta object literal for the '<em><b>Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__EVENT_ID = eINSTANCE.getTicket_EventID();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__PRICE = eINSTANCE.getTicket_Price();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TICKET__USER_ID = eINSTANCE.getTicket_UserID();

		/**
		 * The meta object literal for the '<em><b>Inv1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TICKET___INV1__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTicket__Inv1__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.UserImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.EventImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Venue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VENUE_ID = eINSTANCE.getEvent_VenueID();

		/**
		 * The meta object literal for the '<em><b>Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_ID = eINSTANCE.getEvent_EventID();

		/**
		 * The meta object literal for the '<em><b>Ticketsforevents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TICKETSFOREVENTS = eINSTANCE.getEvent_Ticketsforevents();

		/**
		 * The meta object literal for the '<em><b>Inv3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___INV3__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEvent__Inv3__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.VenueImpl <em>Venue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.VenueImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getVenue()
		 * @generated
		 */
		EClass VENUE = eINSTANCE.getVenue();

		/**
		 * The meta object literal for the '<em><b>Venue ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__VENUE_ID = eINSTANCE.getVenue_VenueID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__NAME = eINSTANCE.getVenue_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__CAPACITY = eINSTANCE.getVenue_Capacity();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENUE__LOCATION = eINSTANCE.getVenue_Location();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENUE__EVENTS = eINSTANCE.getVenue_Events();

	}

} //Hw1Package
