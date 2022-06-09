package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Camarero extends Persona {

	//Atributos
	
	//Constructor vacío
	public Camarero() {
		super();
	}
	
	//Constructor completo
	public Camarero(String nombre) {
		super(nombre);
	}

	//Metodos
	public void crearPedido(ArrayList<Pedido> listaPedidos) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		Pedido pedido = new Pedido();
		
		System.out.println("Introduce la mesa del pedido: ");
		int mesaPedido = Integer.valueOf(teclado.nextLine());
		pedido.setMesa(mesaPedido);
		
		while(!salir) {
			System.out.println("Introduce el nombre del plato que deseas anadir: ");
			String nombrePlato = teclado.nextLine();
			
			System.out.println("Introduce el precio del plato que deseas anadir: ");
			Float precioPlato = Float.valueOf(teclado.nextLine());
			
			System.out.println("Introduce la cantidad del plato pedido: ");
			int cantidadLinea = Integer.valueOf(teclado.nextLine());
			
			
			Plato plato = new Plato(nombrePlato, precioPlato);
			
			LineaPedido lineaPedido = new LineaPedido(plato, cantidadLinea);
			pedido.getListaLineasP().add(lineaPedido);
			
			
			System.out.println("Si no deseas anadir ninguna linea de pedido más, introduzca 'NO', "
					+ "en caso contrario, enter.");
			String respuesta = teclado.nextLine();
			if (respuesta.equals("NO")) {
				salir = true;
			}
		}
		
		listaPedidos.add(pedido);
		
	}
	
	public void editarPedido(ArrayList<Pedido> listaPedidos) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el ID del pedido al que deseas anadir una nueva linea: ");
		int idPedido = Integer.valueOf(teclado.nextLine());
		
		System.out.println("Introduce el nombre del plato que deseas anadir: ");
		String nombrePlato = teclado.nextLine();
		
		System.out.println("Introduce el precio del plato que deseas anadir: ");
		Float precioPlato = Float.valueOf(teclado.nextLine());
		
		System.out.println("Introduce la cantidad del plato que deseas anadir: ");
		int cantidadLinea = Integer.valueOf(teclado.nextLine());
		
		Plato plato = new Plato(nombrePlato, precioPlato);
		
		LineaPedido lineaPedido = new LineaPedido(plato, cantidadLinea);
		
		for (int i = 0; i < listaPedidos.size(); i++) {
			if (listaPedidos.get(i).getId() == idPedido) {
				listaPedidos.get(i).getListaLineasP().add(lineaPedido);
			}
		}
			
	}
	
	
	
	
	@Override
	void actuarPlato(ArrayList<Pedido> listaPedidos) {
		Scanner teclado = new Scanner(System.in);
		int idLineaPedido = Integer.valueOf(teclado.nextLine());
		
		for (int i = 0; i < listaPedidos.size(); i++) {
			for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
				if (listaPedidos.get(i).getListaLineasP().get(j).getId() == idLineaPedido) {
					if (listaPedidos.get(i).getListaLineasP().get(j).getEstado().equals("listo")) {
						listaPedidos.get(i).getListaLineasP().get(j).setEstado("servido");
					}
				}
			}
		}
		
	}
	
	public float calcularTicket(ArrayList<Pedido> listaPedidos) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el ID del pedido del cuál desees ver el precio total");
		int idPedido = Integer.valueOf(teclado.nextLine());
		float precioPedido = 0;
		
		for (int i = 0; i < listaPedidos.size(); i++) {
			if (listaPedidos.get(i).getId() == idPedido) {
				for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
					precioPedido += (listaPedidos.get(i).getListaLineasP().get(j).getPlato().getPrecio()) * (listaPedidos.get(i).getListaLineasP().get(j).getCantidad());
				}
			}
		}
		
		
		return precioPedido;
	}
}
