package negocio;

import entidades.Jugador;

public interface JugadorDao extends CrudGenerico<Jugador, String>{

	public Jugador findByNombreUsuario(String nombreUsuario);
	
}
