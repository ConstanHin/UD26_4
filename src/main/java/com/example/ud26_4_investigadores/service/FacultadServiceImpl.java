package com.example.ud26_4_investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ud26_4_investigadores.dao.IFacultadDAO;
import com.example.ud26_4_investigadores.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService {
	
	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultades() {
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad getById(Long codigo) {
		return iFacultadDAO.findById(codigo).get();
	}

//	@Override
//	public List<Facultad> listarPorNombre(String nombre) {
//		return iFacultadDAO.listarPorNombre(nombre);
//	}

	@Override
	public Facultad addFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad updateFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void deleteFacultad(Long codigo) {
		iFacultadDAO.deleteById(codigo);
		
	}


}
