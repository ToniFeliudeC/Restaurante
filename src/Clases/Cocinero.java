package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocinero extends Persona {
	
	//Constructor vacío
	public Cocinero() {
		super();
	}
	
	//Constructor completo
	public Cocinero(String nombre) {
		super(nombre);
	}
	
	//Metodos
	public void verPlatos(ArrayList<Pedido> listaPedidos) {
		for (int i = 0; i < listaPedidos.size(); i++) {
			for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
				if (listaPedidos.get(i).getListaLineasP().get(j).getEstado().equals("pedido") || listaPedidos.get(i).getListaLineasP().get(j).getEstado().equals("cocina")) {
					System.out.println(listaPedidos.get(i).getListaLineasP().get(j));
				}
			}
		}
	}
		
	@Override
	public void actuarPlato(ArrayList<Pedido> listaPedidos) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el ID del pedido que deseas avanzar su estado");
		int id = Integer.valueOf(teclado.nextLine());
		
		for (int i = 0; i < listaPedidos.size(); i++) {
			for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
				if ((listaPedidos.get(i).getListaLineasP().get(j).getEstado().equals("pedido")) && (listaPedidos.get(i).getListaLineasP().get(j).getId() == id)) {
					listaPedidos.get(i).getListaLineasP().get(j).setEstado("cocina");
					System.out.println("El pedido ha sido actualizado a 'cocina'");
				}
				else if ((listaPedidos.get(i).getListaLineasP().get(j).getEstado().equals("cocina")) && (listaPedidos.get(i).getListaLineasP().get(j).getId() == id)) {
					listaPedidos.get(i).getListaLineasP().get(j).setEstado("listo");
					System.out.println("El pedido ha sido actualizado a 'listo'");
				}
			}
		}
		
	}
}
