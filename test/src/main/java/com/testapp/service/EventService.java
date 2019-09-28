package com.testapp.service;

import java.util.List;

import com.testapp.model.EventModel;

public interface EventService {
	EventModel selectEvent(int idevent);
	List<EventModel> selectAllEvent();
	void addEvent(EventModel event);
	void editEvent(EventModel event);
	void deleteEvent(int idevent);
}
