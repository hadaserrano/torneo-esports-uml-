package entidades;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private String id;
	private String nombre;
	private LocalDate fCreacion;

	public Equipo() {
		super();
	}

	public Equipo(String id, String nombre, LocalDate fCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fCreacion = fCreacion;
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

	public LocalDate getFCreacion() {
		return fCreacion;
	}

	public void setFCreacion(LocalDate fCreacion) {
		this.fCreacion = fCreacion;
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
		Equipo other = (Equipo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", fCreacion=" + fCreacion + "]";
	}

	

}
