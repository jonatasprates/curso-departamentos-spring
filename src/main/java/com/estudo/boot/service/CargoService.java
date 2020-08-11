package com.estudo.boot.service;

import java.util.List;

import com.estudo.boot.entity.Cargo;

public interface CargoService {
	
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionario(Long id);

}
