/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Hw1Validator INSTANCE = new Hw1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gendev.hw1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv2' of 'Customer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTOMER__INV2 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv1' of 'Ticket'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TICKET__INV1 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv3' of 'Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EVENT__INV3 = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Hw1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Hw1Package.ADMIN:
			return validateAdmin((Admin) value, diagnostics, context);
		case Hw1Package.CUSTOMER:
			return validateCustomer((Customer) value, diagnostics, context);
		case Hw1Package.DISCOUNT:
			return validateDiscount((Discount) value, diagnostics, context);
		case Hw1Package.PAYMENT:
			return validatePayment((Payment) value, diagnostics, context);
		case Hw1Package.TICKET:
			return validateTicket((Ticket) value, diagnostics, context);
		case Hw1Package.USER:
			return validateUser((User) value, diagnostics, context);
		case Hw1Package.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case Hw1Package.VENUE:
			return validateVenue((Venue) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmin(Admin admin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(admin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCustomer_inv2(customer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv2 constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_inv2(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return customer.inv2(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscount(Discount discount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discount, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicket(Ticket ticket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ticket, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ticket, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTicket_inv1(ticket, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv1 constraint of '<em>Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTicket_inv1(Ticket ticket, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ticket.inv1(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEvent_inv3(event, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv3 constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_inv3(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return event.inv3(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVenue(Venue venue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(venue, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Hw1Validator
