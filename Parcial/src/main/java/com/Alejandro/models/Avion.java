package com.Alejandro.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Avion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long placaAvion;
	
	private int horasDevuelo;
	private String nombrePiloto;
	private String nombreCopiloto;
	private String marcaAvion;
	private String anioFabricacion;
	private String capacidadDeCombustible;
	
	public Avion(long placaAvion, int horasDevuelo, String nombrePiloto, String nombreCopiloto, String marcaAvion,
			String anioFabricacion, String capacidadDeCombustible) {
		super();
		this.placaAvion = placaAvion;
		this.horasDevuelo = horasDevuelo;
		this.nombrePiloto = nombrePiloto;
		this.nombreCopiloto = nombreCopiloto;
		this.marcaAvion = marcaAvion;
		this.anioFabricacion = anioFabricacion;
		this.capacidadDeCombustible = capacidadDeCombustible;
	}
	
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPlacaAvion() {
		return placaAvion;
	}

	public void setPlacaAvion(long placaAvion) {
		this.placaAvion = placaAvion;
	}

	public int getHorasDevuelo() {
		return horasDevuelo;
	}

	public void setHorasDevuelo(int horasDevuelo) {
		this.horasDevuelo = horasDevuelo;
	}

	public String getNombrePiloto() {
		return nombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		this.nombrePiloto = nombrePiloto;
	}

	public String getNombreCopiloto() {
		return nombreCopiloto;
	}

	public void setNombreCopiloto(String nombreCopiloto) {
		this.nombreCopiloto = nombreCopiloto;
	}

	public String getMarcaAvion() {
		return marcaAvion;
	}

	public void setMarcaAvion(String marcaAvion) {
		this.marcaAvion = marcaAvion;
	}

	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getCapacidadDeCombustible() {
		return capacidadDeCombustible;
	}

	public void setCapacidadDeCombustible(String capacidadDeCombustible) {
		this.capacidadDeCombustible = capacidadDeCombustible;
	}
	
	
	
	
	
	
	
	
}
