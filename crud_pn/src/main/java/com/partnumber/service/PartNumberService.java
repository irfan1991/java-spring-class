package com.partnumber.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.partnumber.model.PartNumberModel;



public interface PartNumberService {
	
	List<PartNumberModel> selectAll();

}
