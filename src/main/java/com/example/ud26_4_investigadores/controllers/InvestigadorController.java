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

import com.example.ud26_4_investigadores.dto.Investigador;
import com.example.ud26_4_investigadores.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;

	// Get all
	@GetMapping("/investigadores")
	public List<Investigador> getAll() {
		return investigadorServiceImpl.getAll();
	}

	// Get investigadores by dni
	@GetMapping("/investigadores/{dni}")
	public Investigador listarPorDni(@PathVariable(name = "dni") Long dni) {
		return investigadorServiceImpl.getByDni(dni);
	}

	// Get investigadores by nombre
	@GetMapping("/investigadores/nombre/{nombre}")
	public List<Investigador> listarPorNombre(@PathVariable(name = "nombre") String nombre) {
		return investigadorServiceImpl.listarPorNombre(nombre);
	}

	// Add Investigador
	@PostMapping("/investigadores")
	public Investigador addInvestigador(@RequestBody Investigador investigador) {
		return investigadorServiceImpl.addInvestigador(investigador);
	}

	// Update investigador
	@PutMapping("/investigadores/{dni}")
	public Investigador updateInvestigador(@PathVariable(name = "dni") Long dni,
			@RequestBody Investigador investigador) {

		Investigador investigador_seleccionada = new Investigador();
		Investigador investigador_actualizada = new Investigador();

		investigador_seleccionada = investigadorServiceImpl.getByDni(dni);

		investigador_seleccionada.setNomApels(investigador.getNomApels());
		investigador_seleccionada.setFacultad(investigador.getFacultad());

		investigador_actualizada = investigadorServiceImpl.updateInvestigador(investigador_seleccionada);
		return investigador_actualizada;
	}

	// Delete investigador
	@DeleteMapping("/investigadores/{dni}")
	public void deleteInvestigador(@PathVariable(name = "dni") Long dni) {
		investigadorServiceImpl.deleteInvestigador(dni);
	}

}
