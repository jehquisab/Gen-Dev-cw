package gendev.hw1;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import gendev.hw1.*;

public class Task4 {
	public static String instance = "task4-Instances/instance.xmi";

	public static void main(String[] args) 
	{
		saveInstance();
		Object[] loadedData = loadInstance();
		if (loadedData != null) {
			Customer myCustomer = (Customer) loadedData[0];
			Venue venue1 = (Venue) loadedData[1];
			Venue venue2 = (Venue) loadedData[2];
			
			printInstance (myCustomer, venue1, venue2);
		}
		
	}

	public static void saveInstance() 
	{
		// Initialise the model  
		Hw1Package.eINSTANCE.eClass();

		// Retrieve the default factory singleton  
		Hw1Factory factory = Hw1Factory.eINSTANCE;

		// Create the content of the model via this program 
		Customer myCustomer = factory.createCustomer();
		myCustomer.setCardNumber(122223432);
		myCustomer.setUserID(1);
		myCustomer.setUserName("testuser1");


		Admin admin = factory.createAdmin();
		admin.setAdminID(10);
		admin.setUserID(2);
		admin.setUserName("testadmin1");

		Ticket ticket1 = factory.createTicket();
		ticket1.setEventID(100);
		ticket1.setPrice(150.00);
		ticket1.setSold(true);
		ticket1.setTicketID(1000);
		ticket1.setUserID(1);
		ticket1.setVenueID(2000);

		Ticket ticket2 = factory.createTicket();
		ticket2.setEventID(101);
		ticket2.setPrice(120.00);
		ticket2.setSold(false);
		ticket2.setTicketID(1001);
		ticket2.setUserID(0);
		ticket2.setVenueID(2001);

		Event event1 = factory.createEvent();
		event1.setName("bob marley resurrected");
		event1.setEventID(100);
		event1.setVenueID(2000);

		Event event2 = factory.createEvent();
		event2.setName("justin bieber europe");
		event2.setEventID(101);
		event2.setVenueID(2000);

		Venue venue1 = factory.createVenue();
		venue1.setCapacity(300);
		venue1.setName("O2 London");
		venue1.setLocation("London");
		venue1.setVenueID(2000);

		Venue venue2 = factory.createVenue();
		venue2.setCapacity(300);
		venue2.setName("Birms Arena");
		venue2.setLocation("Birmingham");
		venue2.setVenueID(2001);

		Discount discount1 = factory.createDiscount();
		discount1.setDiscountID(9000);
		discount1.setIsActive(true);
		discount1.setName("15OFF");

		Payment payment1 = factory.createPayment();
		payment1.setBookingID(700);
		payment1.setPaymentType("Mastercard Debit");

		myCustomer.getTickets().add(ticket1);
		myCustomer.getPayments().add(payment1);
		myCustomer.setDiscounts(discount1);

		venue1.setEvents(event1);
		venue2.setEvents(event2);

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		URI fileURI = URI.createFileURI(new File(instance).getAbsolutePath());
		Resource resource = resSet.createResource(fileURI);
		resource.getContents().add(myCustomer);
		resource.getContents().add(venue1);
		resource.getContents().add(venue2);
		// Save the instance
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Instance saved successfully in: " + instance);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Object[] loadInstance() 
	{
		// Initialise the model
		Hw1Package.eINSTANCE.eClass();

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Load the resource
		Resource resource = resSet.getResource(URI.createURI(instance), true);
		Customer myCustomer = (Customer) resource.getContents().get(0);
		Venue venue1 = (Venue) resource.getContents().get(1);
		Venue venue2 = (Venue) resource.getContents().get(2);

		return new Object[] {myCustomer, venue1, venue2};

	}

	public static void printInstance(Customer myCustomer, Venue venue1, Venue venue2) 
	{
		if (myCustomer != null) {
			System.out.println("Loaded customer: " + myCustomer.getUserName());
			System.out.println("Tickets loaded: " + myCustomer.getTickets().size());
			System.out.println("Payments loaded: " + myCustomer.getPayments().size());

			// Print ticket details
			for (Ticket ticket : myCustomer.getTickets()) {
				System.out.println("  Ticket ID: " + ticket.getTicketID() + ", Price: " + ticket.getPrice());
			}

			// Print payment details
			for (Payment payment : myCustomer.getPayments()) {
				System.out.println("  Payment Type: " + payment.getPaymentType());
			}

			// Print discount if available
			if (myCustomer.getDiscounts() != null) {
				System.out.println("Discount Applied: " + myCustomer.getDiscounts().getName());
			} else {
				System.out.println("No discount applied.");
			}

			//Print venue-event links
			for (Venue venue : new Venue[]{venue1, venue2}) {
				if (venue != null) {
					System.out.println("\nVenue: " + venue.getName() + " (" + venue.getLocation() + ")");
					if (venue.getEvents() != null) {
						System.out.println(" Hosted Event: " + venue.getEvents().getName());
					} else {
						System.out.println("  No event linked to this venue.");
					}
				}
			}
		} else {
			System.out.println("Failed to load instance.");
		}
	}





}
