package com.example.ud26_4_investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ud26_4_investigadores.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Long> {
	

}
