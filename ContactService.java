package contact;

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	// contacts with a unique ID
	public boolean addContact(Contact newContact) {
		boolean contains = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			contacts.add(newContact);
			return true;
		} else {
			return false;
		}
	}

	// delete contacts per contact ID.
	public boolean deleteContact(String contactID) {
		boolean deleted = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				contacts.remove(c);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Update First name 
	public boolean updateContactFirstName(String contactID, String newFirstName) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				c.setFirstName(newFirstName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// update last name 
	public boolean updateContactLastName(String contactID, String newLastName) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				c.setLastName(newLastName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update number 
	public boolean updateContactNumber(String contactID, String newNumber) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				c.setPhoneNumber(newNumber);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update Address 
	public boolean updateContactAddress(String contactID, String newAddress) {
		boolean updated = false;
		for (Contact c : contacts) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				c.setAddress(newAddress);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	// print contacts
	public void displayAllContacts() {
		for(Contact c: contacts) {
			System.out.println(c.toString());
		}
	}
}