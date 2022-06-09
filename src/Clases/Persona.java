package Clases;

import java.util.ArrayList;

public abstract class Persona {

	//Atributos
	private int id;
	private static int contador = 1;
	private String nombre;
	
	//Constructor vacío
	public Persona() {
		this.id = contador++;
	}
	
	//Constructor completo
	public Persona(String nombre) {
		this.id = contador++;
		this.nombre = nombre;
	}

	//toString
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos
	public void verPlatos(ArrayList<Pedido> listaPedidos) {
		for (int i = 0; i < listaPedidos.size(); i++) {
			for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
				System.out.println(listaPedidos.get(i).getListaLineasP().get(j));
			}
		}
	}
	
	abstract void actuarPlato(ArrayList<Pedido> listaPedidos);
	
	public static float calcularCaja(ArrayList<Pedido> listaPedidos) {
		
		float total = 0;
		
		for (int i = 0; i < listaPedidos.size(); i++) {
			for (int j = 0; j < listaPedidos.get(i).getListaLineasP().size(); j++) {
				total += (listaPedidos.get(i).getListaLineasP().get(j).getPlato().getPrecio()) * (listaPedidos.get(i).getListaLineasP().get(j).getCantidad());
			}
		}
		
		return total;
	}
	
	
	
	
	
	
}
