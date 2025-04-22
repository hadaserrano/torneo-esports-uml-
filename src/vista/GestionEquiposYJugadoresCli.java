package vista;

import java.time.LocalDate;
import java.util.Scanner;

import control.GestionEquiposYJugadores;

public class GestionEquiposYJugadoresCli {

	private GestionEquiposYJugadores gestionEYJ;

	public static Scanner sc;

	public GestionEquiposYJugadoresCli() {

		gestionEYJ = new GestionEquiposYJugadores();
		sc = new Scanner(System.in);
	}

	public void menu() {
		int opcion = 0;

		do {
			opcion = pintarMenu();

			switch (opcion) {
			case 1:
				registrarEquipo();
				break;
			case 2:
				anadirJugadoresAEquipo();
				break;
			case 3:
				consultarListaEquiposYJugadores();
				break;

			}

		} while (opcion != 4);

		System.out.println("Fin del programa");

		sc.close();
	}

	public static int pintarMenu() {
		int opcion;

		System.out.println(" 1.- Registrar un equipo");
		System.out.println(" 2.- Anadir jugadores a un equipo");
		System.out.println(" 3.- Consultar lista de equipos y jugadores");
		System.out.println(" 4.- Salir");

		System.out.print("Introduce una opción, 4 para salir: ");
		opcion = sc.nextInt();

		while (opcion < 1 || opcion > 4) {
			System.out.println("Opción incorrecta, validos valores de 1 a 4");
			System.out.print("Introduce una opción: ");
			opcion = sc.nextInt();
		}

		return opcion;
	}
	 public void registrarEquipo() {
		 System.out.println("Introduce el id del equipo");
		 String id = sc.next();
		 System.out.println("Introduce el nombre del equipo");
		 String nombre = sc.next();
		 System.out.println(gestionEYJ.registrarEquipos(id, nombre));
		 sc.nextLine();
	 }
	 public void anadirJugadoresAEquipo() {
		 System.out.println("Introduce el id del jugador");
		 String id = sc.next();
		 System.out.println("Introduce el id del equipo");
		 String idEquipo = sc.next();
		 System.out.println("Introduce el nombre del jugador");
		 String nombre = sc.next();
		 System.out.println("Introduce los apellidos del jugador");
		 String apellidos = sc.next();
		 System.out.println("Introduce el dia de nacimiento del jugador");
		 int dia = sc.nextInt();
		 System.out.println("Introduce el mes de nacimiento del jugador");
		 int mes = sc.nextInt();
		 System.out.println("Introduce el ano de nacimiento del jugador");
		 int ano = sc.nextInt();
		 LocalDate fNaci = LocalDate.of(ano, mes, dia);
		 System.out.println("Introduce el email del jugador");
		 String email = sc.next();
		 System.out.println("Introduce la direccion del jugador");
		 String direccion = sc.next();
		 System.out.println("Introduce el nombre de usuario del jugador");
		 String usuario = sc.next();
		 
		 System.out.println(gestionEYJ.añadirJugadoresEquipo(id, idEquipo, nombre, apellidos, fNaci, email, direccion, usuario));
		 sc.nextLine();
	 }
	public void consultarListaEquiposYJugadores() {
		System.out.println(gestionEYJ.consultarListaDeEquiposYJugadores()); 
	}
}
