package com.pmdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmdb.dao.MenuMapper;
import com.pmdb.model.MenuModel;

@Service
public class MenuServiceDatabase implements MenuService {
	
	@Autowired
	MenuMapper menuMapper;

	@Override
	public MenuModel selectMenu(int idmenu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuModel> selectMenuAll() {
		// TODO Auto-generated method stub
		return menuMapper.ambilSemuaModel();
	}

}
