package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Jugador;

public class JugadorDaoImplList implements JugadorDao {

	private List<Jugador> list;

	public JugadorDaoImplList() {
		super();
		list = new ArrayList<>();
		cargarDatos();
	}

	private void cargarDatos() {
		list.add(new Jugador("66555656", "Jose Luis", "Garcia", LocalDate.of(1986, 03, 19), "jose@hotmail.com",
				"Oviedo, Asturias", "joselitoMiMadre", "13353655"));
		list.add(new Jugador("5566556", "Cris", "Salazar", LocalDate.of(1994, 07, 11), "cri@hotmail.com",
				"Madrid, Madrid", "crisCristinita", "222255"));
		list.add(new Jugador("8555452", "Hada", "Serrano", LocalDate.of(1990, 04, 29), "hada@hotmail.com",
				"Madrid, Madrid", "crisCristinita", "244777"));
	}

	@Override
	public int insertOne(Jugador obj) {
		if (!list.contains(obj)) {
			if (list.add(obj))
				;
			return 1;
		}
		return 0;

	}

	@Override
	public int update(Jugador obj) {
		int index = list.indexOf(obj);
		if (index != -1) {
			list.set(index, obj);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteOne(String ObjId) {
		for (Jugador ele : list) {
			if (ele.getId().equals(ObjId)) {
				list.remove(ele);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public List<Jugador> findAll() {
		return list;
	}

	@Override
	public Jugador findbyId(String ObjId) {
		for (Jugador ele : list)
			if (ele.getId().equals(ObjId)) {
				return ele;
			}
		return null;
	}

	@Override
	public Jugador findByNombreUsuario(String nombreUsuario) {
		for (Jugador ele : list)
			if (ele.getNombre().equals(nombreUsuario))
				return ele;
		return null;
	}

}
