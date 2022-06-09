package Clases;

import java.util.ArrayList;

public class Pedido {

	//Atributos
	private int id;
	private static int contador = 1;
	private int mesa;
	private ArrayList<LineaPedido> listaLineasP;
	
	//Constructor vacío
	public Pedido() {
		this.id = contador++;
		this.listaLineasP = new ArrayList<LineaPedido>();
	}
	
	//Constructor completo
	public Pedido(int mesa, ArrayList<LineaPedido> listaLineasP) {
		this.id = contador++;
		this.mesa = mesa;
		this.listaLineasP = listaLineasP;
	}

	//toString
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", mesa=" + mesa + ", listaLineasP=" + listaLineasP + "]";
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public ArrayList<LineaPedido> getListaLineasP() {
		return listaLineasP;
	}

	public void setListaLineasP(ArrayList<LineaPedido> listaLineasP) {
		this.listaLineasP = listaLineasP;
	}
	
}
