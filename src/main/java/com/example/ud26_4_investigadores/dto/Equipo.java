package com.example.ud26_4_investigadores.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {

	/*
	 * Attributes/Columns 
	 */
	
	@Id
	@Column(name="num_serie")
	private String numSerie;
	
	@Column
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "facultad_codigo")
	private Facultad facultad;
	
}
