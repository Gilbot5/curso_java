package FabricadePastas;

public class Productos {

	private String nombre, marca;
	private double precio, cantidad;

public Productos(String nombre, String marca, double precio, double cantidad) {
	
	this.nombre=nombre;
	this.marca=marca;
	this.precio=precio;
	this.cantidad=cantidad;
}

public String getNombre() {
	return nombre;
}

public String getMarca() {
	return marca;
}

public double getPrecio() {
	return precio;
}

public double getCantidad() {
	return cantidad;
}

public String toString() {
	return "Nombre: "+this.nombre+" Marca: "+this.marca;
}

}

