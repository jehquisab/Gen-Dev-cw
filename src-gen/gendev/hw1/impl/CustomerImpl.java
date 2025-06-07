/**
 */
package gendev.hw1.impl;

import gendev.hw1.Customer;
import gendev.hw1.Discount;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Payment;
import gendev.hw1.Ticket;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getTickets <em>Tickets</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getPayments <em>Payments</em>}</li>
 *   <li>{@link gendev.hw1.impl.CustomerImpl#getDiscounts <em>Discounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long CARD_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected long cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTickets() <em>Tickets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickets()
	 * @generated
	 * @ordered
	 */
	protected EList<Ticket> tickets;

	/**
	 * The cached value of the '{@link #getPayments() <em>Payments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayments()
	 * @generated
	 * @ordered
	 */
	protected EList<Payment> payments;

	/**
	 * The cached value of the '{@link #getDiscounts() <em>Discounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscounts()
	 * @generated
	 * @ordered
	 */
	protected Discount discounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCardNumber() {
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardNumber(long newCardNumber) {
		long oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__CARD_NUMBER, oldCardNumber,
					cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ticket> getTickets() {
		if (tickets == null) {
			tickets = new EObjectContainmentEList<Ticket>(Ticket.class, this, Hw1Package.CUSTOMER__TICKETS);
		}
		return tickets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Payment> getPayments() {
		if (payments == null) {
			payments = new EObjectContainmentEList<Payment>(Payment.class, this, Hw1Package.CUSTOMER__PAYMENTS);
		}
		return payments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discount getDiscounts() {
		return discounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscounts(Discount newDiscounts, NotificationChain msgs) {
		Discount oldDiscounts = discounts;
		discounts = newDiscounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.CUSTOMER__DISCOUNTS, oldDiscounts, newDiscounts);
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
	public void setDiscounts(Discount newDiscounts) {
		if (newDiscounts != discounts) {
			NotificationChain msgs = null;
			if (discounts != null)
				msgs = ((InternalEObject) discounts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__DISCOUNTS, null, msgs);
			if (newDiscounts != null)
				msgs = ((InternalEObject) newDiscounts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.CUSTOMER__DISCOUNTS, null, msgs);
			msgs = basicSetDiscounts(newDiscounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CUSTOMER__DISCOUNTS, newDiscounts,
					newDiscounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Customer::inv2";
		try {
			/**
			 *
			 * inv inv2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.tickets.ticketID->asSet()
			 *         ->size() =
			 *         self.tickets->size()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.CUSTOMER___INV2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Ticket> tickets_0 = this.getTickets();
				final /*@NonInvalid*/ OrderedSetValue BOXED_tickets_0 = idResolver
						.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_Ticket, tickets_0);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(Hw1Tables.SEQ_DATAid_EInt);
				Iterator<Object> ITERATOR__1 = BOXED_tickets_0.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Ticket _1 = (Ticket) ITERATOR__1.next();
					/**
					 * ticketID
					 */
					final /*@NonInvalid*/ int ticketID = _1.getTicketID();
					final /*@NonInvalid*/ IntegerValue BOXED_ticketID = ValueUtil.integerValueOf(ticketID);
					//
					accumulator.add(BOXED_ticketID);
				}
				final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(asSet);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_tickets_0);
				final /*@NonInvalid*/ boolean result = size.equals(size_0);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.CUSTOMER__TICKETS:
			return ((InternalEList<?>) getTickets()).basicRemove(otherEnd, msgs);
		case Hw1Package.CUSTOMER__PAYMENTS:
			return ((InternalEList<?>) getPayments()).basicRemove(otherEnd, msgs);
		case Hw1Package.CUSTOMER__DISCOUNTS:
			return basicSetDiscounts(null, msgs);
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
		case Hw1Package.CUSTOMER__CARD_NUMBER:
			return getCardNumber();
		case Hw1Package.CUSTOMER__TICKETS:
			return getTickets();
		case Hw1Package.CUSTOMER__PAYMENTS:
			return getPayments();
		case Hw1Package.CUSTOMER__DISCOUNTS:
			return getDiscounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.CUSTOMER__CARD_NUMBER:
			setCardNumber((Long) newValue);
			return;
		case Hw1Package.CUSTOMER__TICKETS:
			getTickets().clear();
			getTickets().addAll((Collection<? extends Ticket>) newValue);
			return;
		case Hw1Package.CUSTOMER__PAYMENTS:
			getPayments().clear();
			getPayments().addAll((Collection<? extends Payment>) newValue);
			return;
		case Hw1Package.CUSTOMER__DISCOUNTS:
			setDiscounts((Discount) newValue);
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
		case Hw1Package.CUSTOMER__CARD_NUMBER:
			setCardNumber(CARD_NUMBER_EDEFAULT);
			return;
		case Hw1Package.CUSTOMER__TICKETS:
			getTickets().clear();
			return;
		case Hw1Package.CUSTOMER__PAYMENTS:
			getPayments().clear();
			return;
		case Hw1Package.CUSTOMER__DISCOUNTS:
			setDiscounts((Discount) null);
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
		case Hw1Package.CUSTOMER__CARD_NUMBER:
			return cardNumber != CARD_NUMBER_EDEFAULT;
		case Hw1Package.CUSTOMER__TICKETS:
			return tickets != null && !tickets.isEmpty();
		case Hw1Package.CUSTOMER__PAYMENTS:
			return payments != null && !payments.isEmpty();
		case Hw1Package.CUSTOMER__DISCOUNTS:
			return discounts != null;
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
		case Hw1Package.CUSTOMER___INV2__DIAGNOSTICCHAIN_MAP:
			return inv2((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (cardNumber: ");
		result.append(cardNumber);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
