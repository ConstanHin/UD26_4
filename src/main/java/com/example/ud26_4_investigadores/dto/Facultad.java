package com.example.ud26_4_investigadores.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facultades")
public class Facultad {
	
	// Attributes/Columns
	
	@Id
	private Long codigo;
	
	@Column
	private String nombre;
	
	
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
	

}
