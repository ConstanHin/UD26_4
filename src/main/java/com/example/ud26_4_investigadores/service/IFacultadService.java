package com.example.ud26_4_investigadores.service;

import java.util.List;

import com.example.ud26_4_investigadores.dto.Facultad;

public interface IFacultadService {

	// Listar todo
	public List<Facultad> listarFacultades();
	
	// Get by dni
	public Facultad getById(Long codigo);

	// Get by nombre
//	public List<Facultad> listarPorNombre(String nombre);

	// Add
	public Facultad addFacultad(Facultad facultad);

	// Update
	public Facultad updateFacultad(Facultad facultad);

	// Delete
	public void deleteFacultad(Long codigo);
	
	
}
