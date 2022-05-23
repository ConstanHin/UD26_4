package com.example.ud26_4_investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26_4_investigadores.dao.IEquipoDAO;
import com.example.ud26_4_investigadores.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{
	
	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipoes() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo getById(Long codigo) {
		return iEquipoDAO.findById(codigo).get();
	}

	@Override
	public Equipo addEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo updateEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void deleteEquipo(Long codigo) {
		iEquipoDAO.deleteById(codigo);
	}

}
