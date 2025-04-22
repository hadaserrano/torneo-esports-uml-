package control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Equipo;
import entidades.Jugador;
import negocio.EquipoDao;
import negocio.EquipoDaoImplList;
import negocio.JugadorDao;
import negocio.JugadorDaoImplList;

public class GestionEquiposYJugadores {

	private EquipoDao eDao;
	private JugadorDao jDao;

	public GestionEquiposYJugadores() {
		super();
		eDao = new EquipoDaoImplList();
		jDao = new JugadorDaoImplList();
	}

	public String registrarEquipos(String id, String nombre) {
		Equipo equipo = new Equipo();
		equipo.setId(id);
		equipo.setNombre(nombre);
		equipo.setFCreacion(LocalDate.now());

		if (eDao.insertOne(equipo) == 1)
			return "Equipo " + nombre + " registrado correctamente";
		return "No se ha podido registrar el equipo, ya existe un equipo con ese id";
	}

	public String añadirJugadoresEquipo(String id, String idEquipo, String nombre, String apellidos, LocalDate fNaci,
			String email, String direccion, String nombreUsuario) {

		Jugador jugador = new Jugador();
		jugador.setId(id);
		jugador.setIdEquipo(idEquipo);
		jugador.setNombre(nombre);
		jugador.setApellidos(apellidos);
		jugador.setfNaci(fNaci);
		jugador.setEmail(email);
		jugador.setDireccion(direccion);
		jugador.setNomUsuario(nombreUsuario);

		if(eDao.findbyId(idEquipo)==null)
			return "Ese equipo no existe";
		
		int response = jDao.insertOne(jugador);
		
		if (response == 0)
			return "Jugador ya existe";
		return "Ha sido insertado con éxito";
		
	}

	public String consultarListaDeEquiposYJugadores() {
		String response = "\nLista de equipos y jugadores\n";
		List<Equipo> aux = eDao.findAll();
		if (aux.isEmpty())
			return "Actualmente no hay equipos";
		for (Equipo ele : aux) {
			response += ele.toString() + "\n";
			List<Jugador> auxj = buscarJugadoresDeEquipo(ele.getId());
			if (auxj.isEmpty())
				response += "Actualmente no hay jugadores en este equipo\n";
			else {
				for (Jugador ele1 : auxj) {
					response += " - " + ele1.toString() + "\n";

				}

			}

		}

		return response;

	}

	private List<Jugador> buscarJugadoresDeEquipo(String idEquipo) {
		List<Jugador> aux = new ArrayList<>();
		for (Jugador ele : jDao.findAll()) {
			if (ele.getIdEquipo().equals(idEquipo))
				aux.add(ele);
		}
		return aux;
	}

}