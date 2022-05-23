package com.example.ud26_4_investigadores.service;

import java.util.List;

import com.example.ud26_4_investigadores.dto.Investigador;

public interface IInvestigadorService {
	
	// Listar todo
	public List<Investigador> getAll();
	
	// Get by dni
	public Investigador getByDni(Long dni);

	// Get by nombre
	public List<Investigador> listarPorNombre(String nombre);

	// Add
	public Investigador addInvestigador(Investigador investigador);

	// Update
	public Investigador updateInvestigador(Investigador investigador);

	// Delete
	public void deleteInvestigador(Long dni);


}
