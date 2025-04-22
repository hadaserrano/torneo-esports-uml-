package test;

import java.time.LocalDate;
import control.GestionEquiposYJugadores;
import entidades.Equipo;
import entidades.Jugador;
import negocio.EquipoDao;
import negocio.EquipoDaoImplList;
import negocio.JugadorDao;
import negocio.JugadorDaoImplList;

public class Testing {

    private static JugadorDao jDao = new JugadorDaoImplList();
    private static EquipoDao eDao = new EquipoDaoImplList();
    private static GestionEquiposYJugadores gEJ = new GestionEquiposYJugadores();



    public static void main(String[] args) {

        System.out.println(gEJ.consultarListaDeEquiposYJugadores());
        System.out.println(gEJ.añadirJugadoresEquipo("2222", "BBB", "Lola", "Flores", LocalDate.of(1990, 04, 29), "lola@.com", "C/flamenco", "Lola22"));
        System.out.println(gEJ.registrarEquipos("777", "SevillaFc"));
             System.out.println(gEJ.consultarListaDeEquiposYJugadores());
             System.out.println(gEJ.añadirJugadoresEquipo("2222", "BBB", "Lola", "Flores", LocalDate.of(1990, 04, 29), "lola@.com", "C/flamenco", "Lola22"));
             System.out.println(gEJ.consultarListaDeEquiposYJugadores());
        }





    private static void findAll() {
        System.out.println("Lista de Jugadores: "
                + "**");
        for(Jugador ele: jDao.findAll()) {
            System.out.println(ele);
        }

        System.out.println("Lista de Equipos: "
                + "**");
        for(Equipo ele: eDao.findAll()) {
            System.out.println(ele);
        }
//        List<Jugador> aux1 = jDao.findAll();
//        List<Equipo> aux2 = eDao.findAll();
//        System.out.println("\nLista de jugadores: \n" + aux1);
//        System.out.println("\nLista de equipos: \n" + aux2);
    }
}