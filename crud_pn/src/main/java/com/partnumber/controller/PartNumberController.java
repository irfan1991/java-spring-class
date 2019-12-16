package com.partnumber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.partnumber.model.PartNumberModel;
import com.partnumber.service.PartNumberService;

@Controller
public class PartNumberController {
	
	@Autowired
	PartNumberService partNumberService;
	int number =0;
	
	@RequestMapping("/all")
	public String partNumberSemua(Model model) {
		List<PartNumberModel>  partNumbers = partNumberService.selectAll();
		model.addAttribute("parts",partNumbers);
		model.addAttribute("no",number);
		return "semua-partnumber";
		
	}
	

}
