package com.webcrafters.event.service;

import com.webcrafters.event.model.Events;

public interface EventService {
	public void save(Events event);

	public Events getById(Long id);

}
