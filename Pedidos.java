package FabricadePastas;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

public class Pedidos {

	private Productos[] productos;
	private double suma;
	private int comprar;	

	public Pedidos() {
		this.productos = new Productos [15];
		suma = 0;
		comprar = 0;
	}
	
	public Productos getProductos() {
		return productos [comprar];
	}

	public double getSuma() {
		return suma;
	}

	public void resetearSumar () {
		int dato = comprar;
		for(int i=0; dato > i ;i++) {
			productos[comprar] = null;
			comprar--;
		}
	}

	public double sumarPrecios () {
		int dato=0;	
		for(int i=0;dato<productos.length;i++) {
			if(productos[i] != null) {
				suma=suma+productos[i].getPrecio();	
			}
			dato++;
		}
		return suma;

	}
	public void agregarProducto(Productos pr){
		if(comprar < productos.length){
			productos [comprar] = pr;
			comprar++;
		}
	}

	public void borrarProducto (){
		comprar--;
		productos [comprar] = null;
	}

	public void imprimirPedido (String correo, String usuario, int ID){
		System.out.println("FABRICA DE PASTAS LA GOLOSINA");
		System.out.println("Direccion: Av. 9 de Julio");
		System.out.println("Telefonos: 4318965");
		System.out.println("-----------------------------------");
		System.out.println("Número de Orden: " + ID);
		System.out.println("Cliente: " + usuario);
		System.out.println("Correo: " + correo);
		System.out.println("-----------------------------------");
		System.out.println("Productos Comprados: ");
		System.out.println();

		for(int i=0; i<productos.length; i++) {
			if(productos[i] != null) {
				System.out.println(productos [i]);
				System.out.println();
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Total a Pagar: $" + suma);
		System.out.println("-----------------------------------");
	}	
}
