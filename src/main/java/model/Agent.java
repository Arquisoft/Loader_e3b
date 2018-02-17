package model;

import java.io.Serializable;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Agents")
public class Agent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;	
	private Localizacion localizacion;
	private String email;
	private String identificador;
	private String tipo;
	private String clave;

	Agent() {
	}

	public Agent(String nombre, Localizacion localizacion, String email, String identificador, String tipo) {
		super();
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.email = email;
		this.identificador = identificador;
		this.tipo = tipo;
		generateClave();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Localizacion getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(Localizacion localizacion) {
		this.localizacion = localizacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}	
	
	@Override
	public String toString() {
		return "Agent [nombre=" + nombre + ", localizacion=" + localizacion + ", email=" + email + ", identificador=" + identificador + ", tipo=" + tipo + "]";
	}

	public String getClave() {
		return clave;
	}

	public void generateClave() {
		Random r = new Random();
		this.clave = r.nextInt(99999)+"";
		
	}

	



}
