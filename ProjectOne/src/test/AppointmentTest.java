package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Appointment;

public class AppointmentTest {
	
	@Test
	void testAppointment() {
		Date date = new Date();
		Appointment appointment = new Appointment("123", date,"check up");
		assertTrue(appointment.getAppointmentID().equals("123"));
		assertTrue(appointment.getAppointmentDate().equals(date));
		assertTrue(appointment.getAppointmentDescription().equals("check up"));	
	}
	
	@Test
	void testAppointmentToLong() {
		Date date = new Date();
		Appointment appointment = new Appointment("", date , "");
		Assertions.assertThrows (IllegalArgumentException.class, () ->{
			appointment.setAppointmentId("99988877745");
		});
		Assertions.assertThrows (IllegalArgumentException.class, () ->{
			appointment.setAppointmentDescription("Mobile technical errors are the issues I experience ");
		});
	}
	
	@Test
	void testAppointmentNull() {
		@SuppressWarnings("deprecation")
		Date date = new Date(2023, Calendar.OCTOBER, 2);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment ("", date, "");
		});
	}
	
	@Test
	void testAppointmentInPast() {
		@SuppressWarnings("deprecation")
		Date pastdate = new Date(2022, Calendar.OCTOBER, 2);
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Appointment ("", pastdate, "");
		});
	}
}
