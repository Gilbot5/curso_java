package FabricadePastas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	Label lbl = new Label();
	@FXML
	TextField user = new TextField();
	@FXML
	TextField mail = new TextField();

	String pr, usuario, correo;
	int ID = 1, cuenta = 1;

	Pedidos Orden = new Pedidos ();
	

	private Productos prod1= new Productos ("Fideos", "Matarazzo" ,124.65, 100);
	private Productos prod2= new Productos ("Fideos rellenos", "Popis",150.33, 100);
	private Productos prod3= new Productos ("Ñoquis", "Ciudad del Lago", 130.24, 100);
	private Productos prod4= new Productos ("Ravioles", "La salteña", 165.55, 100);
	private Productos prod5= new Productos ("Sorrentina", "Luccetti", 170.16, 100);
	private Productos prod6= new Productos ("Canelones", "Acme", 172.78, 3);
	private Productos prod7= new Productos ("Queso", "Ralladito", 50, 200);
	private Productos prod8= new Productos ("Pan", "Bimbo Artesanal", 45.98, 2);
	private Productos prod9= new Productos ("Salsa", "Artesanal", 78.05, 200);
	private Productos prod10= new Productos ("Bebida", "Coca Cola", 76, 1.5);

	public void agregarProductos (ActionEvent Event) {
		pr = ((Button)Event.getSource()).getId();
		if (cuenta < 15)
			switch (pr.toLowerCase()) {

			case "fideos":
				lbl.setText(prod1.getNombre());
				Orden.agregarProducto(prod1);


				break;
			case "frellenos":
				lbl.setText(prod2.getNombre());
				Orden.agregarProducto(prod2);

				break;

			case "ñoquis":
				lbl.setText(prod3.getNombre());
				Orden.agregarProducto(prod3);

				break;

			case "ravioles":
				lbl.setText(prod4.getNombre());
				Orden.agregarProducto(prod4);

				break;

			case "sorretina":
				lbl.setText(prod5.getNombre());
				Orden.agregarProducto(prod5);

				break;

			case "canelones":
				lbl.setText(prod6.getNombre());
				Orden.agregarProducto(prod6);

				break;

			case "queso":
				lbl.setText(prod7.getNombre());
				Orden.agregarProducto(prod7);

				break;

			case "pan":
				lbl.setText(prod8.getNombre());
				Orden.agregarProducto(prod8);

				break;

			case "salsa":
				lbl.setText(prod9.getNombre());
				Orden.agregarProducto(prod9);

				break;

			case "bebidas":
				lbl.setText(prod10.getNombre());
				Orden.agregarProducto(prod10);

				break;
			}else {
				lbl.setText("Maximo de productos alcanzados");
			}
		cuenta++;
	}

	public void realizarPedido (ActionEvent Event){
		cuenta = 1;
		usuario = user.getText();
		correo = mail.getText();

		if (usuario.equals("") || correo.equals("")) {
			lbl.setText("Completar campos de Nombre y Correo");
			Orden.resetearSumar();
		}
		else {
			Orden.sumarPrecios();
			lbl.setText("Total a Pagar: " + Double.toString(Orden.getSuma()));
			Orden.imprimirPedido(correo, usuario, ID);
			ID++;
		}

		Orden.resetearSumar();
		user.setText("");
		mail.setText("");
	}

	public void quitarProducto (ActionEvent Event) {
		Orden.borrarProducto();
	}

}
