package com.partnumber.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.partnumber.model.PartNumberModel;

@Mapper
public interface PartNumberMapper {

	@Select("SELECT id,part_number,part_name,part_stock,part_uom,DATE_FORMAT( part_date , '%D %M %Y')  AS part_date FROM t_pn")
	List<PartNumberModel> ambilSemua();
}
