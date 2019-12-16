package com.pmdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmdb.model.MenuModel;
import com.pmdb.service.MenuService;

@Controller
public class MenuController {
	
	@Autowired
	MenuService menuService;
	
	
	@RequestMapping("/semua")
	public String lihatSemuaMenu(Model model) {
		List<MenuModel> models = menuService.selectMenuAll();
		model.addAttribute("menus",models);
		return "semua-menu";
		
	}

}
