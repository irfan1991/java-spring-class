package com.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.dao.EventMapper;
import com.testapp.model.EventModel;

@Service
public class EventServiceDatabase implements EventService {

	@Autowired
	EventMapper eventMapper;
	
	@Override
	public EventModel selectEvent(int idevent) {
		// TODO Auto-generated method stub
		return eventMapper.ambilEvent(idevent);
	}

	@Override
	public List<EventModel> selectAllEvent() {
		// TODO Auto-generated method stub
		return eventMapper.ambilSemuaEvent();
	}

	@Override
	public void addEvent(EventModel event) {
		// TODO Auto-generated method stub
		eventMapper.tambahEvent(event);
	}

	@Override
	public void editEvent(EventModel event) {
		// TODO Auto-generated method stub
		eventMapper.ubahEvent(event);
		
	}

	@Override
	public void deleteEvent(int idevent) {
		// TODO Auto-generated method stub
		 eventMapper.hapusEvent(idevent);;
	}

}
