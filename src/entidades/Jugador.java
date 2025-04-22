package entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Jugador {

	private String id;
	private String nombre;
	private String apellidos;
	private LocalDate fNaci;
	private String email;
	private String direccion;
	private String nomUsuario;
	private String idEquipo;
	
	public Jugador() {
		super();
	}

	public Jugador(String id, String nombre, String apellidos, LocalDate fNaci, String email, String direccion,
			String nomUsuario, String idEquipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNaci = fNaci;
		this.email = email;
		this.direccion = direccion;
		this.nomUsuario = nomUsuario;
		this.idEquipo = idEquipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getfNaci() {
		return fNaci;
	}

	public void setfNaci(LocalDate fNaci) {
		this.fNaci = fNaci;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fNaci=" + fNaci + ", email="
				+ email + ", direccion=" + direccion + ", nomUsuario=" + nomUsuario + ", idEquipo=" + idEquipo + "]";
	}

	

	
	}
