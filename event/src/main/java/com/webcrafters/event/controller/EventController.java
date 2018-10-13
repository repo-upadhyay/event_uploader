package com.webcrafters.event.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.webcrafters.event.model.Events;
import com.webcrafters.event.service.EventService;

@RestController
public class EventController {
	@Autowired
	EventService eventService;

	@PostMapping("/events")
	ResponseEntity<Void> postEvents(@RequestBody Events events) {
		if (events == null)
			return ResponseEntity.noContent().build();
		eventService.save(events);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(events.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/events/{id}")
	public Events retrieveEventetails(@PathVariable Long id) {

		return eventService.getById(id);
	}

}
