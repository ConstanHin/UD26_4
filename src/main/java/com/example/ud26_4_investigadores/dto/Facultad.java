package com.example.ud26_4_investigadores.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultades")
public class Facultad {
	
	// Attributes/Columns
	
	@Id
	private Long codigo;
	
	@Column
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="facultad_codigo")
	private List<Investigador> investigador;
	
	@OneToMany
	@JoinColumn(name="facultad_codigo")
	private List<Equipo> equipo;
	
	
	// Constructors
	
	public Facultad() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Facultad(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	 * @return the investigador
	 */
	@JsonIgnore
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	@JsonIgnore
	public List<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}
	

}
