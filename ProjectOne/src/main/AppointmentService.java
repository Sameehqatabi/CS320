package main;

import java.util.ArrayList;




public class AppointmentService {
	ArrayList<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	// add Appointment with a unique ID
	public boolean addAppointment(Appointment newAppointment) {
		boolean contains = false;
		for (Appointment c : appointments) {
			if (c.getAppointmentID().equalsIgnoreCase(newAppointment.getAppointmentID())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			appointments.add(newAppointment);
			return true;
		} else {
			return false;
		}
	}
		
		// delete Appointment per Appointment ID.
	public boolean deleteAppointment(String appointmentID) {
		boolean deleted = false;
		for (Appointment c : appointments) {
			if (c.getAppointmentID().equalsIgnoreCase(appointmentID)) {
				appointments.remove(c);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

}
