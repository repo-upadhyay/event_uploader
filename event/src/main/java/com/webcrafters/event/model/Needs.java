package com.webcrafters.event.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "needs")
public class Needs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long needs_id;

	private String catering;
	private String parking;
	private String conference_rooms;
	private String av_equipment;
	private String early_checkin;
	private String late_checkout;
	private String transportation;
	private String type;
	private String comments;

	public Long getNeeds_id() {
		return needs_id;
	}

	public void setNeeds_id(Long needs_id) {
		this.needs_id = needs_id;
	}

	public String getCatering() {
		return catering;
	}

	public void setCatering(String catering) {
		this.catering = catering;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getConference_rooms() {
		return conference_rooms;
	}

	public void setConference_rooms(String conference_rooms) {
		this.conference_rooms = conference_rooms;
	}

	public String getAv_equipment() {
		return av_equipment;
	}

	public void setAv_equipment(String av_equipment) {
		this.av_equipment = av_equipment;
	}

	public String getEarly_checkin() {
		return early_checkin;
	}

	public void setEarly_checkin(String early_checkin) {
		this.early_checkin = early_checkin;
	}

	public String getLate_checkout() {
		return late_checkout;
	}

	public void setLate_checkout(String late_checkout) {
		this.late_checkout = late_checkout;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
