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

import com.example.ud26_4_investigadores.dto.Equipo;
import com.example.ud26_4_investigadores.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	// Get all
	@GetMapping("/equipos")
	public List<Equipo> getAll() {
		return equipoServiceImpl.listarEquipoes();
	}

	// Get equipos by id
	@GetMapping("/equipos/{codigo}")
	public Equipo listarPorDni(@PathVariable(name = "codigo") Long codigo) {
		return equipoServiceImpl.getById(codigo);
	}

	// Add Equipo
	@PostMapping("/equipos")
	public Equipo addEquipo(@RequestBody Equipo equipo) {
		return equipoServiceImpl.addEquipo(equipo);
	}

	// Update Equipo
	@PutMapping("/equipos/{codigo}")
	public Equipo updateEquipo(@PathVariable(name = "codigo") Long codigo, @RequestBody Equipo equipo) {

		Equipo equipo_seleccionada = new Equipo();
		Equipo equipo_actualizada = new Equipo();

		equipo_seleccionada = equipoServiceImpl.getById(codigo);

		equipo_seleccionada.setNumSerie(equipo.getNumSerie());
		equipo_seleccionada.setNombre(equipo.getNombre());
		equipo_seleccionada.setFacultad(equipo.getFacultad());
		equipo_seleccionada.setReserva(equipo.getReserva());

		equipo_actualizada = equipoServiceImpl.updateEquipo(equipo_seleccionada);
		return equipo_actualizada;
	}

	// Delete equipo
	@DeleteMapping("/equipos/{codigo}")
	public void deleteEquipo(@PathVariable(name = "codigo") Long codigo) {
		equipoServiceImpl.deleteEquipo(codigo);
	}

}
