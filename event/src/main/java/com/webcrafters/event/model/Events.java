package com.webcrafters.event.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "event_id")
	private Event event;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "location_id")
	private Location location;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "needs_id")
	private Needs needs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Needs getNeeds() {
		return needs;
	}

	public void setNeeds(Needs needs) {
		this.needs = needs;
	}

}
