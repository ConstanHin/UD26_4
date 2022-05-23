package com.example.ud26_4_investigadores.service;

import java.util.List;

import com.example.ud26_4_investigadores.dto.Equipo;

public interface IEquipoService {

	// Listar todo
	public List<Equipo> listarEquipoes();
	
	// Get by id
	public Equipo getById(Long codigo);

	// Add
	public Equipo addEquipo(Equipo equipo);

	// Update
	public Equipo updateEquipo(Equipo equipo);

	// Delete
	public void deleteEquipo(Long codigo);
}
