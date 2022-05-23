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

import com.example.ud26_4_investigadores.dto.Reserva;
import com.example.ud26_4_investigadores.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	// Get all
	@GetMapping("/reservas")
	public List<Reserva> getAll() {
		return reservaServiceImpl.getAll();
	}

	// Get reservas by id
	@GetMapping("/reservas/{codigo}")
	public Reserva listarPorDni(@PathVariable(name = "codigo") Long codigo) {
		return reservaServiceImpl.getByDni(codigo);
	}

	// Add Reserva
	@PostMapping("/reservas")
	public Reserva addReserva(@RequestBody Reserva reserva) {
		return reservaServiceImpl.addReserva(reserva);
	}

	// Update Reserva
	@PutMapping("/reservas/{codigo}")
	public Reserva updateReserva(@PathVariable(name = "codigo") Long codigo, @RequestBody Reserva reserva) {

		Reserva reserva_seleccionada = new Reserva();
		Reserva reserva_actualizada = new Reserva();

		reserva_seleccionada = reservaServiceImpl.getByDni(codigo);

		reserva_seleccionada.setEquipo(reserva.getEquipo());
		reserva_seleccionada.setInvestigador(reserva.getInvestigador());
		reserva_seleccionada.setComienzo(reserva.getComienzo());
		reserva_seleccionada.setFin(reserva.getFin());

		reserva_actualizada = reservaServiceImpl.updateReserva(reserva_seleccionada);
		return reserva_actualizada;
	}

	// Delete reserva
	@DeleteMapping("/reservas/{codigo}")
	public void deleteReserva(@PathVariable(name = "codigo") Long codigo) {
		reservaServiceImpl.deleteReserva(codigo);
	}
	
}
