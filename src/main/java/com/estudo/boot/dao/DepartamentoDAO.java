package com.estudo.boot.dao;

import java.util.List;

import com.estudo.boot.entity.Departamento;

public interface DepartamentoDAO {

	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
	
}
