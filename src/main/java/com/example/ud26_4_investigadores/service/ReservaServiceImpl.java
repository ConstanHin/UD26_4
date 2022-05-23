package com.example.ud26_4_investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26_4_investigadores.dao.IReservaDAO;
import com.example.ud26_4_investigadores.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{
	
	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> getAll() {
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva getByDni(Long id) {
		return iReservaDAO.findById(id).get();
	}

	@Override
	public List<Reserva> listarPorNombre(String nombre) {
		return null;
	}

	@Override
	public Reserva addReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva updateReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public void deleteReserva(Long id) {
		iReservaDAO.deleteById(id);
	}

}
