package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {

	// Atributos
	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	// toString
	@Override
	public String toString() {
		return "MyTask [listaPedidos=" + listaPedidos + ", listaPersonas=" + listaPersonas + "]";
	}

	// Getters & Setters
	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	// Metodos

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		MyTask principal = new MyTask();
		
		Camarero camarero1 = new Camarero("Toni");
		Cocinero cocinero1 = new Cocinero("Dani");
		principal.getListaPersonas().add(camarero1);
		principal.getListaPersonas().add(cocinero1);
		
		boolean salir = false;
		
		
		while (!salir) {
			System.out.println("Introduce tu ID: ");
			int id = Integer.valueOf(teclado.nextLine());
			for (int i = 0; i < principal.getListaPersonas().size(); i++) {
				if (principal.getListaPersonas().get(i).getId() == id) {
					if (principal.getListaPersonas().get(i) instanceof Camarero) {
						Camarero camarero = (Camarero) principal.getListaPersonas().get(i);

						System.out.println("CAMARERO");
						System.out.println("1-Crear pedido");
						System.out.println("2-Editar pedido");
						System.out.println("3-Actuar plato");
						System.out.println("4-Calcular ticket");
						System.out.println("5-Salir");

						String choice = teclado.nextLine();

						switch (choice) {
						case "1":
							camarero.crearPedido(principal.getListaPedidos());
							break;
						case "2":
							camarero.editarPedido(principal.getListaPedidos());
							break;
						case "3":
							camarero.actuarPlato(principal.getListaPedidos());
							break;
						case "4":
							System.out.println(camarero.calcularTicket(principal.getListaPedidos()));
							break;
						case "5":
							salir = true;
							break;
						}

					} else if (principal.getListaPersonas().get(i) instanceof Cocinero) {
						Cocinero cocinero = (Cocinero) principal.getListaPersonas().get(i);

						System.out.println("COCINERO");
						System.out.println("1-Ver platos");
						System.out.println("2-Actuar plato");
						System.out.println("3-Salir");

						String choice = teclado.nextLine();

						switch (choice) {
						case "1":
							cocinero.verPlatos(principal.getListaPedidos());
							break;
						case "2":
							cocinero.actuarPlato(principal.getListaPedidos());
							break;
						case "3":
							salir = true;
							break;
						}
					}
				}

			} 
		}

	}
}