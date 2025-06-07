/**
 */
package gendev.hw1.impl;

import gendev.hw1.Event;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.Ticket;
import gendev.hw1.Venue;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.EventImpl#getVenueID <em>Venue ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.EventImpl#getEventID <em>Event ID</em>}</li>
 *   <li>{@link gendev.hw1.impl.EventImpl#getTicketsforevents <em>Ticketsforevents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The cached value of the '{@link #getTicketsforevents() <em>Ticketsforevents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicketsforevents()
	 * @generated
	 * @ordered
	 */
	protected EList<Ticket> ticketsforevents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT__VENUE_ID, oldVenueID, venueID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.EVENT__EVENT_ID, oldEventID, eventID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ticket> getTicketsforevents() {
		if (ticketsforevents == null) {
			ticketsforevents = new EObjectContainmentEList<Ticket>(Ticket.class, this,
					Hw1Package.EVENT__TICKETSFOREVENTS);
		}
		return ticketsforevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv3(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Event::inv3";
		try {
			/**
			 *
			 * inv inv3:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Venue.allInstances()
			 *         ->exists(v | v.venueID = self.venueID) and
			 *         Venue.allInstances()
			 *         ->forAll(v1, v2 | (v1 <> v2 implies v1.venueID <> v2.venueID))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.EVENT___INV3__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_hw1_c_c_Venue = idResolver
							.getClass(Hw1Tables.CLSSid_Venue, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
							.evaluate(executor, Hw1Tables.SET_CLSSid_Venue, TYP_hw1_c_c_Venue);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_v = allInstances.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_v.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Venue v = (Venue) ITERATOR_v.next();
						/**
						 * v.venueID = self.venueID
						 */
						final /*@NonInvalid*/ int venueID = v.getVenueID();
						final /*@NonInvalid*/ int venueID_0 = this.getVenueID();
						final /*@NonInvalid*/ boolean eq = venueID == venueID_0;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean result;
					if (exists == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final org.eclipse.ocl.pivot.Class TYPE_forAll_0 = executor.getStaticTypeOfValue(null,
									allInstances);
							final LibraryIterationExtension IMPL_forAll_0 = (LibraryIterationExtension) TYPE_forAll_0
									.lookupImplementation(standardLibrary,
											OCLstdlibTables.Operations._Collection__1_forAll);
							final /*@NonNull*/ Object ACC_forAll_0 = IMPL_forAll_0.createAccumulatorValue(executor,
									TypeId.BOOLEAN, TypeId.BOOLEAN);
							/**
							 * Implementation of the iterator body.
							 */
							final AbstractSimpleOperation BODY_forAll_0 = new AbstractSimpleOperation() {
								/**
								 * v1 <> v2 implies v1.venueID <> v2.venueID
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
										final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
									final /*@NonInvalid*/ SetValue allInstances = (SetValue) sourceAndArgumentValues[0];
									final /*@NonInvalid*/ Object v1 = sourceAndArgumentValues[1];
									final /*@NonInvalid*/ Object v2 = sourceAndArgumentValues[2];
									/*@Caught*/ Object CAUGHT_implies;
									try {
										final /*@NonInvalid*/ Venue CAST_null = (Venue) v1;
										final /*@NonInvalid*/ Venue CAST_null_0 = (Venue) v2;
										final /*@NonInvalid*/ boolean ne = (CAST_null != null)
												? !CAST_null.equals(CAST_null_0)
												: (CAST_null_0 != null);
										final /*@Thrown*/ Boolean implies;
										if (!ne) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_ne_0;
											try {
												if (CAST_null == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://www.example.org/hw1\'::Venue::venueID\'");
												}
												final /*@Thrown*/ int venueID_1 = CAST_null.getVenueID();
												if (CAST_null_0 == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://www.example.org/hw1\'::Venue::venueID\'");
												}
												final /*@Thrown*/ int venueID_2 = CAST_null_0.getVenueID();
												final /*@Thrown*/ boolean ne_0 = venueID_1 != venueID_2;
												CAUGHT_ne_0 = ne_0;
											} catch (Exception e) {
												CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
												implies = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_ne_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_ne_0;
												}
												implies = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_implies = implies;
									} catch (Exception e) {
										CAUGHT_implies = ValueUtil.createInvalidValue(e);
									}
									return CAUGHT_implies;
								}
							};
							final ExecutorMultipleIterationManager MGR_forAll_0 = new ExecutorMultipleIterationManager(
									executor, 2, false, TypeId.BOOLEAN, BODY_forAll_0, allInstances, ACC_forAll_0);
							final /*@Thrown*/ Boolean forAll = (Boolean) IMPL_forAll_0.evaluateIteration(MGR_forAll_0);
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if ((exists == null) || (CAUGHT_forAll == null)) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Hw1Tables.INT_0)
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
		case Hw1Package.EVENT__TICKETSFOREVENTS:
			return ((InternalEList<?>) getTicketsforevents()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.EVENT__NAME:
			return getName();
		case Hw1Package.EVENT__VENUE_ID:
			return getVenueID();
		case Hw1Package.EVENT__EVENT_ID:
			return getEventID();
		case Hw1Package.EVENT__TICKETSFOREVENTS:
			return getTicketsforevents();
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
		case Hw1Package.EVENT__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.EVENT__VENUE_ID:
			setVenueID((Integer) newValue);
			return;
		case Hw1Package.EVENT__EVENT_ID:
			setEventID((Integer) newValue);
			return;
		case Hw1Package.EVENT__TICKETSFOREVENTS:
			getTicketsforevents().clear();
			getTicketsforevents().addAll((Collection<? extends Ticket>) newValue);
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
		case Hw1Package.EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.EVENT__VENUE_ID:
			setVenueID(VENUE_ID_EDEFAULT);
			return;
		case Hw1Package.EVENT__EVENT_ID:
			setEventID(EVENT_ID_EDEFAULT);
			return;
		case Hw1Package.EVENT__TICKETSFOREVENTS:
			getTicketsforevents().clear();
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
		case Hw1Package.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.EVENT__VENUE_ID:
			return venueID != VENUE_ID_EDEFAULT;
		case Hw1Package.EVENT__EVENT_ID:
			return eventID != EVENT_ID_EDEFAULT;
		case Hw1Package.EVENT__TICKETSFOREVENTS:
			return ticketsforevents != null && !ticketsforevents.isEmpty();
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
		case Hw1Package.EVENT___INV3__DIAGNOSTICCHAIN_MAP:
			return inv3((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", venueID: ");
		result.append(venueID);
		result.append(", eventID: ");
		result.append(eventID);
		result.append(')');
		return result.toString();
	}

} //EventImpl
