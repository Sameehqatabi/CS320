package main;

import java.util.Date;

public class Appointment {
	private String appointmentID;
	private Date appointmentDate;
	private String appointmentDescription;
	
	public Appointment(String appointmentId, Date appDate, String appDescription) {
		Date date = new Date();
		
		if(appDate != null) {
			this.appointmentDate = appDate;
		}
		if (date.before(appDate) || appDate == null ) {
			throw new IllegalArgumentException("Invalid Date");
		}
		
		this.appointmentID = appointmentId;
		this.appointmentDate = appDate;
		this.setAppointmentDescription(appDescription);
	}
	
	public void setAppointmentId(String appointmentId) {
		if (appointmentId.length() <= 10 && appointmentId != null ) {
			this.appointmentID = appointmentId;
		}
		if (appointmentId.length() >= 10 || appointmentId == null ) {
			throw new IllegalArgumentException("Appointment ID cannot be longer than 10 characters or empty");
		}
	}
	
	public void setAppointmentDescription(String appDescription) {
		if(appDescription.length() <= 50 && appDescription != null) {
			this.appointmentDescription = appDescription;
		}
		if(appDescription.length() >= 50 || appDescription == null) {
			throw new IllegalArgumentException("Description cannot be longer than 50 characters or empty");
		}
	}
	public String getAppointmentID() {
		return appointmentID;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public String getAppointmentDescription() {
		return appointmentDescription;
	}

}
