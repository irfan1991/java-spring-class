package com.pmdb.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.pmdb.model.MenuModel;



@Mapper
public interface MenuMapper {
	
	
	@Select("SELECT id, nama_menu,sub_menu FROM t_menu")
	List<MenuModel> ambilSemuaModel();

}
