/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /gendev.hw1/model/hw1.ecore
 * using:
 *   /gendev.hw1/model/hw1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package gendev.hw1;

// import gendev.hw1.Hw1Package;
// import gendev.hw1.Hw1Tables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Hw1Tables provides the dispatch tables for the hw1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Hw1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Hw1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_hw1 = IdManager.getNsURIPackageId("http://www.example.org/hw1", null, Hw1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Hw1Tables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Customer = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Discount = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Discount", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Event = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Event", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ticket = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Ticket", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Venue = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Venue", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_ELong = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("ELong", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Payment = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Payment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ticket = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Ticket, true, ValueUtil.ZERO_VALUE, ValueUtil.integerValueOf(10));
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ticket_0 = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Ticket, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(Hw1Tables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Venue = TypeId.SET.getSpecializedId(Hw1Tables.CLSSid_Venue, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_DATAid_EInt = TypeId.SET.getSpecializedId(Hw1Tables.DATAid_EInt, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Hw1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Admin = new EcoreExecutorType(Hw1Package.Literals.ADMIN, PACKAGE, 0);
		public static final EcoreExecutorType _Customer = new EcoreExecutorType(Hw1Package.Literals.CUSTOMER, PACKAGE, 0);
		public static final EcoreExecutorType _Discount = new EcoreExecutorType(Hw1Package.Literals.DISCOUNT, PACKAGE, 0);
		public static final EcoreExecutorType _Event = new EcoreExecutorType(Hw1Package.Literals.EVENT, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(Hw1Package.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Ticket = new EcoreExecutorType(Hw1Package.Literals.TICKET, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(Hw1Package.Literals.USER, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Venue = new EcoreExecutorType(Hw1Package.Literals.VENUE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Admin,
			_Customer,
			_Discount,
			_Event,
			_Payment,
			_Ticket,
			_User,
			_Venue
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Admin__Admin = new ExecutorFragment(Types._Admin, Hw1Tables.Types._Admin);
		private static final ExecutorFragment _Admin__OclAny = new ExecutorFragment(Types._Admin, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Admin__OclElement = new ExecutorFragment(Types._Admin, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Admin__User = new ExecutorFragment(Types._Admin, Hw1Tables.Types._User);

		private static final ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, Hw1Tables.Types._Customer);
		private static final ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Customer__User = new ExecutorFragment(Types._Customer, Hw1Tables.Types._User);

		private static final ExecutorFragment _Discount__Discount = new ExecutorFragment(Types._Discount, Hw1Tables.Types._Discount);
		private static final ExecutorFragment _Discount__OclAny = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Discount__OclElement = new ExecutorFragment(Types._Discount, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Event__Event = new ExecutorFragment(Types._Event, Hw1Tables.Types._Event);
		private static final ExecutorFragment _Event__OclAny = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Event__OclElement = new ExecutorFragment(Types._Event, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, Hw1Tables.Types._Payment);

		private static final ExecutorFragment _Ticket__OclAny = new ExecutorFragment(Types._Ticket, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ticket__OclElement = new ExecutorFragment(Types._Ticket, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ticket__Ticket = new ExecutorFragment(Types._Ticket, Hw1Tables.Types._Ticket);

		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, Hw1Tables.Types._User);

		private static final ExecutorFragment _Venue__OclAny = new ExecutorFragment(Types._Venue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Venue__OclElement = new ExecutorFragment(Types._Venue, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Venue__Venue = new ExecutorFragment(Types._Venue, Hw1Tables.Types._Venue);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Admin__AdminID = new EcoreExecutorProperty(Hw1Package.Literals.ADMIN__ADMIN_ID, Types._Admin, 0);

		public static final ExecutorProperty _Customer__cardNumber = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__CARD_NUMBER, Types._Customer, 0);
		public static final ExecutorProperty _Customer__discounts = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__DISCOUNTS, Types._Customer, 1);
		public static final ExecutorProperty _Customer__payments = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__PAYMENTS, Types._Customer, 2);
		public static final ExecutorProperty _Customer__tickets = new EcoreExecutorProperty(Hw1Package.Literals.CUSTOMER__TICKETS, Types._Customer, 3);

		public static final ExecutorProperty _Discount__discountID = new EcoreExecutorProperty(Hw1Package.Literals.DISCOUNT__DISCOUNT_ID, Types._Discount, 0);
		public static final ExecutorProperty _Discount__isActive = new EcoreExecutorProperty(Hw1Package.Literals.DISCOUNT__IS_ACTIVE, Types._Discount, 1);
		public static final ExecutorProperty _Discount__name = new EcoreExecutorProperty(Hw1Package.Literals.DISCOUNT__NAME, Types._Discount, 2);
		public static final ExecutorProperty _Discount__Customer__discounts = new ExecutorPropertyWithImplementation("Customer", Types._Discount, 3, new EcoreLibraryOppositeProperty(Hw1Package.Literals.CUSTOMER__DISCOUNTS));

		public static final ExecutorProperty _Event__eventID = new EcoreExecutorProperty(Hw1Package.Literals.EVENT__EVENT_ID, Types._Event, 0);
		public static final ExecutorProperty _Event__name = new EcoreExecutorProperty(Hw1Package.Literals.EVENT__NAME, Types._Event, 1);
		public static final ExecutorProperty _Event__ticketsforevents = new EcoreExecutorProperty(Hw1Package.Literals.EVENT__TICKETSFOREVENTS, Types._Event, 2);
		public static final ExecutorProperty _Event__venueID = new EcoreExecutorProperty(Hw1Package.Literals.EVENT__VENUE_ID, Types._Event, 3);
		public static final ExecutorProperty _Event__Venue__events = new ExecutorPropertyWithImplementation("Venue", Types._Event, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.VENUE__EVENTS));

		public static final ExecutorProperty _Payment__bookingID = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__BOOKING_ID, Types._Payment, 0);
		public static final ExecutorProperty _Payment__paymentType = new EcoreExecutorProperty(Hw1Package.Literals.PAYMENT__PAYMENT_TYPE, Types._Payment, 1);
		public static final ExecutorProperty _Payment__Customer__payments = new ExecutorPropertyWithImplementation("Customer", Types._Payment, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.CUSTOMER__PAYMENTS));

		public static final ExecutorProperty _Ticket__eventID = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__EVENT_ID, Types._Ticket, 0);
		public static final ExecutorProperty _Ticket__price = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__PRICE, Types._Ticket, 1);
		public static final ExecutorProperty _Ticket__sold = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__SOLD, Types._Ticket, 2);
		public static final ExecutorProperty _Ticket__ticketID = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__TICKET_ID, Types._Ticket, 3);
		public static final ExecutorProperty _Ticket__userID = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__USER_ID, Types._Ticket, 4);
		public static final ExecutorProperty _Ticket__venueID = new EcoreExecutorProperty(Hw1Package.Literals.TICKET__VENUE_ID, Types._Ticket, 5);
		public static final ExecutorProperty _Ticket__Customer__tickets = new ExecutorPropertyWithImplementation("Customer", Types._Ticket, 6, new EcoreLibraryOppositeProperty(Hw1Package.Literals.CUSTOMER__TICKETS));
		public static final ExecutorProperty _Ticket__Event__ticketsforevents = new ExecutorPropertyWithImplementation("Event", Types._Ticket, 7, new EcoreLibraryOppositeProperty(Hw1Package.Literals.EVENT__TICKETSFOREVENTS));

		public static final ExecutorProperty _User__userID = new EcoreExecutorProperty(Hw1Package.Literals.USER__USER_ID, Types._User, 0);
		public static final ExecutorProperty _User__userName = new EcoreExecutorProperty(Hw1Package.Literals.USER__USER_NAME, Types._User, 1);

		public static final ExecutorProperty _Venue__capacity = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__CAPACITY, Types._Venue, 0);
		public static final ExecutorProperty _Venue__events = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__EVENTS, Types._Venue, 1);
		public static final ExecutorProperty _Venue__location = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__LOCATION, Types._Venue, 2);
		public static final ExecutorProperty _Venue__name = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__NAME, Types._Venue, 3);
		public static final ExecutorProperty _Venue__venueID = new EcoreExecutorProperty(Hw1Package.Literals.VENUE__VENUE_ID, Types._Venue, 4);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Admin =
			{
				Fragments._Admin__OclAny /* 0 */,
				Fragments._Admin__OclElement /* 1 */,
				Fragments._Admin__User /* 2 */,
				Fragments._Admin__Admin /* 3 */
			};
		private static final int /*@NonNull*/ [] __Admin = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Customer =
			{
				Fragments._Customer__OclAny /* 0 */,
				Fragments._Customer__OclElement /* 1 */,
				Fragments._Customer__User /* 2 */,
				Fragments._Customer__Customer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Discount =
			{
				Fragments._Discount__OclAny /* 0 */,
				Fragments._Discount__OclElement /* 1 */,
				Fragments._Discount__Discount /* 2 */
			};
		private static final int /*@NonNull*/ [] __Discount = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Event =
			{
				Fragments._Event__OclAny /* 0 */,
				Fragments._Event__OclElement /* 1 */,
				Fragments._Event__Event /* 2 */
			};
		private static final int /*@NonNull*/ [] __Event = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__Payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ticket =
			{
				Fragments._Ticket__OclAny /* 0 */,
				Fragments._Ticket__OclElement /* 1 */,
				Fragments._Ticket__Ticket /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ticket = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__User /* 2 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Venue =
			{
				Fragments._Venue__OclAny /* 0 */,
				Fragments._Venue__OclElement /* 1 */,
				Fragments._Venue__Venue /* 2 */
			};
		private static final int /*@NonNull*/ [] __Venue = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Admin.initFragments(_Admin, __Admin);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._Discount.initFragments(_Discount, __Discount);
			Types._Event.initFragments(_Event, __Event);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._Ticket.initFragments(_Ticket, __Ticket);
			Types._User.initFragments(_User, __User);
			Types._Venue.initFragments(_Venue, __Venue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Admin__Admin = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Admin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Admin__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Admin__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Discount__Discount = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Discount__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Event__Event = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Event__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__Ticket = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ticket__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Venue__Venue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Venue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Venue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Admin__Admin.initOperations(_Admin__Admin);
			Fragments._Admin__OclAny.initOperations(_Admin__OclAny);
			Fragments._Admin__OclElement.initOperations(_Admin__OclElement);
			Fragments._Admin__User.initOperations(_Admin__User);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);
			Fragments._Customer__User.initOperations(_Customer__User);

			Fragments._Discount__Discount.initOperations(_Discount__Discount);
			Fragments._Discount__OclAny.initOperations(_Discount__OclAny);
			Fragments._Discount__OclElement.initOperations(_Discount__OclElement);

			Fragments._Event__Event.initOperations(_Event__Event);
			Fragments._Event__OclAny.initOperations(_Event__OclAny);
			Fragments._Event__OclElement.initOperations(_Event__OclElement);

			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._Ticket__OclAny.initOperations(_Ticket__OclAny);
			Fragments._Ticket__OclElement.initOperations(_Ticket__OclElement);
			Fragments._Ticket__Ticket.initOperations(_Ticket__Ticket);

			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Fragments._Venue__OclAny.initOperations(_Venue__OclAny);
			Fragments._Venue__OclElement.initOperations(_Venue__OclElement);
			Fragments._Venue__Venue.initOperations(_Venue__Venue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Admin = {
			Hw1Tables.Properties._Admin__AdminID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._User__userID,
			Hw1Tables.Properties._User__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Customer = {
			Hw1Tables.Properties._Customer__cardNumber,
			Hw1Tables.Properties._Customer__discounts,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Customer__payments,
			Hw1Tables.Properties._Customer__tickets,
			Hw1Tables.Properties._User__userID,
			Hw1Tables.Properties._User__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Discount = {
			Hw1Tables.Properties._Discount__discountID,
			Hw1Tables.Properties._Discount__isActive,
			Hw1Tables.Properties._Discount__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Event = {
			Hw1Tables.Properties._Event__eventID,
			Hw1Tables.Properties._Event__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Event__ticketsforevents,
			Hw1Tables.Properties._Event__venueID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			Hw1Tables.Properties._Payment__bookingID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Payment__paymentType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ticket = {
			Hw1Tables.Properties._Ticket__eventID,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Ticket__price,
			Hw1Tables.Properties._Ticket__sold,
			Hw1Tables.Properties._Ticket__ticketID,
			Hw1Tables.Properties._Ticket__userID,
			Hw1Tables.Properties._Ticket__venueID
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._User__userID,
			Hw1Tables.Properties._User__userName
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Venue = {
			Hw1Tables.Properties._Venue__capacity,
			Hw1Tables.Properties._Venue__events,
			Hw1Tables.Properties._Venue__location,
			Hw1Tables.Properties._Venue__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Venue__venueID
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Admin__Admin.initProperties(_Admin);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._Discount__Discount.initProperties(_Discount);
			Fragments._Event__Event.initProperties(_Event);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._Ticket__Ticket.initProperties(_Ticket);
			Fragments._User__User.initProperties(_User);
			Fragments._Venue__Venue.initProperties(_Venue);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Hw1Tables();
	}

	private Hw1Tables() {
		super(Hw1Package.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Hw1Package.Literals.VENUE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
