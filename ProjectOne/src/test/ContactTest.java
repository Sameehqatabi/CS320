package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;

public class ContactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("123", "sameeh", "alqatabi", "8007975566", "254 magnolia st");
		assertTrue(contact.getContactID().equals("123"));
		assertTrue(contact.getFirstName().equals("sameeh"));
		assertTrue(contact.getLastName().equals("alqatabi"));
		assertTrue(contact.getPhoneNumber().equals("8007975566"));
		assertTrue(contact.getAddress().equals("254 magnolia st"));	
	}
	
	@Test
	void testContactToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1231000021250", "sameehalqatabi", "sameehalqatabi", "8007975", "254 magnolia st newengland newyork newyork 0001211111212");
		});

	}
	
	@Test
	void testContactNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("", "", "", "", "");
		});

	}
}