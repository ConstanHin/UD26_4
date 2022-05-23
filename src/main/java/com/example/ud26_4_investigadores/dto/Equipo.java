package com.example.ud26_4_investigadores.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {

	/*
	 * Attributes/Columns 
	 */
	
	@Id
	@Column(name="num_serie")
	private Long numSerie;
	
	@Column
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "equipo_num_serie")
	private List<Reserva> reserva;
	
	@ManyToOne
	@JoinColumn(name = "facultad_codigo")
	private Facultad facultad;

	/**
	 * 
	 */
	public Equipo() {
	}
	
	/**
	 * @param numSerie
	 * @param nombre
	 * @param reserva
	 * @param facultad
	 */
	public Equipo(Long numSerie, String nombre, List<Reserva> reserva, Facultad facultad) {
		super();
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}

	/**
	 * @return the numSerie
	 */
	public Long getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(Long numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the reserva
	 */
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	
	
	
	
}
