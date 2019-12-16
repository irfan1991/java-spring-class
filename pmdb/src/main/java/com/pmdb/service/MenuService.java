package com.pmdb.service;

import java.util.List;

import com.pmdb.model.MenuModel;

public interface MenuService {
	
	MenuModel selectMenu(int idmenu);
	List<MenuModel> selectMenuAll();
	

}
