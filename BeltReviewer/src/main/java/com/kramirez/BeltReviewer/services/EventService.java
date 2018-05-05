package com.kramirez.BeltReviewer.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;


import com.kramirez.BeltReviewer.models.Event;
import com.kramirez.BeltReviewer.models.User;
import com.kramirez.BeltReviewer.repositories.EventRepo;
import com.kramirez.BeltReviewer.repositories.UserRepo;

@Service
public class EventService {
	private final EventRepo eventRepo;
	Date now = new Date();

	public EventService(EventRepo eventRepo) {
		this.eventRepo = eventRepo;
	}
	
	public List<Event> findAll(){
		return eventRepo.findAll();
		}
	public Event findOne(Long id) {
		return eventRepo.findOne(id);
	}

	public String createEvent(Event event, User user) {
		if(event.geteDate().compareTo(now) <= 0) {
			return "Event needs to be in the future";
		}
		event.setState(event.getState().toUpperCase( ));
		event.setCreatedBy(user);
		eventRepo.save(event);
		return "Event Successfully Created";
	}
	public void destroyEvent(Long id) {
		eventRepo.delete(id);
	}
}
