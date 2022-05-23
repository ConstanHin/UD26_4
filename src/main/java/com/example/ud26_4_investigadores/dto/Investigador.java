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
@Table(name = "investigadores")
public class Investigador {

	// Attributes/Columns

	@Id
	private Long dni;

	@Column(name = "nom_apels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "investigador_dni")
	private List<Reserva> reserva;

	@ManyToOne
	@JoinColumn(name = "facultad_codigo")
	private Facultad facultad;

	/*
	 * Constructors
	 */

	public Investigador() {
	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param facultad
	 */
	public Investigador(Long dni, String nomApels, Facultad facultad) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}

	/**
	 * @return the dni
	 */
	public Long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(Long dni) {
		this.dni = dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @return the facultad
	 */
//	@JsonIgnore
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
