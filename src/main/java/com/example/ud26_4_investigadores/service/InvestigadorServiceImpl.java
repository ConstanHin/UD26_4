package com.example.ud26_4_investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26_4_investigadores.dao.IInvestigadorDAO;
import com.example.ud26_4_investigadores.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService {
	
	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	/**
	 * Listar all Investigadores
	 */
	@Override
	public List<Investigador> getAll() {
		return iInvestigadorDAO.findAll();
	}
	
	/**
	 * Get by dni
	 */
	@Override
	public Investigador getByDni(Long dni) {
		return iInvestigadorDAO.findById(dni).get();
	}

	/**
	 * Listar Investigadores por nombre
	 */
	@Override
	public List<Investigador> listarPorNombre(String nombre) {
		return null;
	}

	/**
	 * Add Investigador
	 */
	@Override
	public Investigador addInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	/**
	 * Update Investigador
	 */
	@Override
	public Investigador updateInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	/**
	 * Delete Investigador
	 */
	@Override
	public void deleteInvestigador(Long dni) {
		iInvestigadorDAO.deleteById(dni);

	}



}
