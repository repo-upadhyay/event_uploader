package com.webcrafters.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcrafters.event.model.Events;
import com.webcrafters.event.repository.EventsRepository;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	EventsRepository eventsRepository;

	@Override
	public void save(Events events) {
		eventsRepository.save(events);
	}

	@Override
	public Events getById(Long id) {
		return eventsRepository.findOne(id);
	}

}