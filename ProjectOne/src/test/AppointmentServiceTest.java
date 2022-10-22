package test;

import org.junit.jupiter.api.Test;
import main.Appointment;
import main.AppointmentService;

import static org.junit.Assert.assertEquals;

import java.util.Date;

public class AppointmentServiceTest {
	
	@Test
	void testaddAppointmentService() {
		AppointmentService service = new AppointmentService();
		Date date = new Date();
		Appointment appointment = new Appointment("145", date, "date");
		Appointment appointment2 = new Appointment("146", date, "date2");
		Appointment appointment3 = new Appointment("145", date, "date3");
		assertEquals(true, service.addAppointment(appointment));
		assertEquals(true, service.addAppointment(appointment2));
		assertEquals(false, service.addAppointment(appointment3));
	}
	
	@Test
	void testdeleteAppointmentService() {
		AppointmentService service = new AppointmentService();
		Date date = new Date();
		Appointment appointment = new Appointment("145", date, "date");
		assertEquals(true, service.addAppointment(appointment));
		assertEquals(true, service.deleteAppointment("145"));
		
	}

}
