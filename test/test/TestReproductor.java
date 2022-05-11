package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import src.Cancion;
import src.Escuchante;
import src.ListaReproduccion;
import src.Reproductor;

public class TestReproductor {

	@Test
	public void queSePuedaCrearUnUsuarioYAgregarlo() {
		String login = "jpuigbelloli";
		String contraseña = "123456789";
		Escuchante escuchante = new Escuchante(login, contraseña);
		Reproductor nuevo = new Reproductor();
		nuevo.agregarUsuario(escuchante);
		assertNotNull(escuchante);

		assertEquals(1, nuevo.getUsuarios().size());
	}

	@Test
	public void queSePuedaCrearUnaListaDeReproduccion() {
		String login = "jpuigbelloli";
		String contraseña = "123456789";
		Escuchante escuchante = new Escuchante(login, contraseña);
		Reproductor nuevo = new Reproductor();
		nuevo.agregarUsuario(escuchante);
		String nombreLista = "Trap";
		ListaReproduccion lista = new ListaReproduccion(nombreLista);

		nuevo.agregarListaDeReproduccion(lista);
	}

	@Test
	public void queSePuedaAgregarUnaCancionAListaDeReproduccion() {
		Reproductor nuevo = new Reproductor();
		String nombreLista = "Trap";
		ListaReproduccion lista = new ListaReproduccion(nombreLista);
		String nombre = "Sin Frenos";
		String genero = "Trap";
		String duracion = "4:10";
		Cancion cancion = new Cancion(nombre, genero, duracion);
		nuevo.agregarListaDeReproduccion(lista);
		lista.agregarCancion(cancion);

		assertNotNull(lista);
	}

	@Test
	void queSePuedaReproducirUnaLista() {
		Reproductor nuevo = new Reproductor();
		String nombreLista = "Trap";
		ListaReproduccion lista = new ListaReproduccion(nombreLista);
		String nombre = "Sin Frenos";
		String genero = "Trap";
		String duracion = "4:10";
		String nombre1 = "Gasolina";
		String genero1 = "Reggaeton";
		String duracion1 = "20:00";

		Cancion cancion = new Cancion(nombre, genero, duracion);
		Cancion cancion2 = new Cancion(nombre1, genero1, duracion1);
		nuevo.agregarListaDeReproduccion(lista);
		lista.agregarCancion(cancion);
		lista.agregarCancion(cancion2);
		int numeroLista = 0;
		System.out.println(nuevo.reproducirLista(numeroLista));
	}
}
