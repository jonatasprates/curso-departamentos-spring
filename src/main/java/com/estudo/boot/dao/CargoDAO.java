package com.estudo.boot.dao;

import java.util.List;

import com.estudo.boot.entity.Cargo;


public interface CargoDAO {

	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
}
