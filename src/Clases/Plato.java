package Clases;

public class Plato {

	//Atributos
	private int id;
	private static int contador = 1;
	private String nombre;
	private float precio;
	
	//Constructor vacío
	public Plato() {
		this.id = contador++;
	}
	
	//Constructor completo
	public Plato(String nombre, float precio) {
		this.id = contador++;
		this.nombre = nombre;
		this.precio = precio;
	}

	//toString
	@Override
	public String toString() {
		return "Plato [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
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

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
