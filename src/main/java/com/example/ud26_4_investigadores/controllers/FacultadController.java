package com.example.ud26_4_investigadores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ud26_4_investigadores.dto.Facultad;
import com.example.ud26_4_investigadores.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;

	// Get all
	@GetMapping("/facultades")
	public List<Facultad> getAll() {
		return facultadServiceImpl.listarFacultades();
	}

	// Get facultades by id
	@GetMapping("/facultades/{codigo}")
	public Facultad listarPorDni(@PathVariable(name = "codigo") Long codigo) {
		return facultadServiceImpl.getById(codigo);
	}

//	// Get Facultades by nombre
//	@GetMapping("/facultades/nombre/{nombre}")
//	public List<Facultad> listarPorNombre(@PathVariable(name = "nombre") String nombre) {
//		return facultadServiceImpl.listarPorNombre(nombre);
//	}

	// Add Facultad
	@PostMapping("/facultades")
	public Facultad addFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.addFacultad(facultad);
	}

	// Update Facultad
	@PutMapping("/facultades/{codigo}")
	public Facultad updateFacultad(@PathVariable(name = "codigo") Long codigo, @RequestBody Facultad facultad) {

		Facultad facultad_seleccionada = new Facultad();
		Facultad facultad_actualizada = new Facultad();

		facultad_seleccionada = facultadServiceImpl.getById(codigo);

		facultad_seleccionada.setNombre(facultad.getNombre());
		facultad_seleccionada.setInvestigador(facultad.getInvestigador());
		facultad_seleccionada.setEquipo(facultad.getEquipo());

		facultad_actualizada = facultadServiceImpl.updateFacultad(facultad_seleccionada);
		return facultad_actualizada;
	}

	// Delete facultad
	@DeleteMapping("/facultades/{codigo}")
	public void deleteFacultad(@PathVariable(name = "codigo") Long codigo) {
		facultadServiceImpl.deleteFacultad(codigo);
	}

}
