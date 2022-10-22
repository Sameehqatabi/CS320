package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import main.Contact;
import main.ContactService;


class ContactServiceTest {

	@Test
	void testaddContactService() {
		ContactService service = new ContactService();
		Contact contact = new Contact("123", "sameeh", "alqatabi", "8007975566", "254 magnolia st");
		Contact contact2 = new Contact("12344", "sameehgf", "alqjbn", "8004551213", "266 magnoli444 stt");
		Contact contact3 = new Contact("123", "sameeh", "alqatabi", "8007975566", "254 magnolia st");
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(false, service.addContact(contact3));
	}
	
	@Test
	void testdeleteContactService() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12344", "sameehgf", "alqjbn", "8004551213", "266 magnoli444 stt");
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.deleteContact("12344"));
	}
	
	@Test
	void testupdateContactService() {
		ContactService service = new ContactService();
		Contact contact = new Contact("123", "sameeh", "alqatabi", "8007975566", "254 magnolia st");
		Contact contact2 = new Contact("12344", "sameehgf", "alqjbn", "8004551213", "266 magnoli444 stt");
		assertEquals(true, service.addContact(contact));
		assertEquals(true, service.addContact(contact2));
		assertEquals(true, service.updateContactFirstName("12344", "alex"));
		assertEquals(true, service.updateContactLastName("12344", "rodriguez"));
		assertEquals(true, service.updateContactNumber("12344", "4642348880"));
		assertEquals(true, service.updateContactAddress("12344", "100 mead st"));
		
	}
}
