package com.test.demo.service;

import java.util.List;

import com.test.demo.model.Mahasiswa;

public interface MahasiswaService {

	List <Mahasiswa> listMahasiswa();
	Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
	Mahasiswa getIdMahasiswa(Integer id);
	void hapus(Integer id);
}
