package Clases;

public class LineaPedido {

	//Atributos
	private int id;
	private static int contador = 1;
	private Plato plato;
	private String estado;
	private int cantidad;
	
	//Constructor vacío
	public LineaPedido() {
		this.id = contador++;
	}
	
	//Constructor completo
	public LineaPedido(Plato plato, int cantidad) {
		this.id = contador++;
		this.plato = plato;
		this.estado = "pedido";
		this.cantidad = cantidad;
	}

	//toString
	@Override
	public String toString() {
		return "LineaPedido [id=" + id + ", plato=" + plato + ", estado=" + estado + ", cantidad=" + cantidad + "]";
	}

	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
