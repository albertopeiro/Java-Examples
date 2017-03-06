package poo;

import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
	
	Coche micoche1=new Coche ();
	micoche1.establece_color("Rojo");
	
	Furgoneta mifurgoneta1=new Furgoneta(7, 580);
	mifurgoneta1.establece_color("Azul");
	mifurgoneta1.asientos("si");
	mifurgoneta1.configura_climatizador("si");
	
	System.out.println (micoche1.dime_color());
	System.out.println(mifurgoneta1.dimeDatosFurgoneta()+ " " + mifurgoneta1.dime_color());
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
		//instanciar una clase, Renault es un ejemplar/instancia de la clase coche
		//con el método constructor new el código salta a la clase coche para hacerla "micoche"
		Coche micoche=new Coche();
		
		//Esto ya no vale porque la variable ruedas esta encapsulada con el método private en la clase Coche
		//System.out.println("Este coche tiene "+ Renault.ruedas+ " ruedas.");
		
		//Hemos instanciado el método dime_larg en la clase Coche y ese sí que podemos 
		//llamarlo para saber el largo del coche desde cualquier clase
		System.out.println(micoche.dime_largo());
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		//Nunca se debe poder manipular la instancia de una clase directamente desde una clase, hay que encapsular 
		//micoche.color="rosa";
		
		System.out.println(micoche.dime_color());
		micoche.asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?(si/no)"));
		System.out.println(micoche.dime_asientos());
	micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?(si/no)"));
	System.out.println(micoche.dime_climatizador());
	System.out.println(micoche.dime_peso_total());
	System.out.println(micoche.precio_coche());
	
	}*/
