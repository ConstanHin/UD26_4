package com.example.ud26_4_investigadores.service;

import java.util.List;

import com.example.ud26_4_investigadores.dto.Reserva;

public interface IReservaService {

	// Listar todo
	public List<Reserva> getAll();

	// Get by id
	public Reserva getByDni(Long id);

	// Get by nombre
	public List<Reserva> listarPorNombre(String nombre);

	// Add
	public Reserva addReserva(Reserva reserva);

	// Update
	public Reserva updateReserva(Reserva reserva);

	// Delete
	public void deleteReserva(Long id);

}
