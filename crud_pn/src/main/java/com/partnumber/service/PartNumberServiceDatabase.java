package com.partnumber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partnumber.dao.PartNumberMapper;
import com.partnumber.model.PartNumberModel;


@Service
public class PartNumberServiceDatabase implements PartNumberService {

	@Autowired
	PartNumberMapper partNumberMapper;
	
	@Override
	public List<PartNumberModel> selectAll() {
		// TODO Auto-generated method stub
		return partNumberMapper.ambilSemua();
	}

}
