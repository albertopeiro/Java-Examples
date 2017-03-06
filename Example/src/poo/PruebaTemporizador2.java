package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Instancia de la clase reloj
		Reloj mireloj=new Reloj();
//Inicio método en marcha
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);
	}

}

class Reloj{
	
	public Reloj (){
		// Estos campos de clase ya no son necesarios, estan en la clase interna local
		//this.intervalo=intervalo;
		//this.sonido=sonido;
		//This para los campos de clase, o sea las variables declaradas dentro de la clase
		//Y los no this son los pertenecientes al método constructo public Reloj
		
	}
	
	public void enMarcha(int intervalo, final boolean sonido){	
			//Clase interna Local. Si necesita parámetros de entrada a los que la clase interna tenga que acceder,
			// hay que poner la palabra reservada final, como es el caso de sonido. La variable intervalo no es
			// necesaria dentro de la clase interna, así que no es necesario poner final
			class DameLaHora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent evento){
				
				Date ahora=new Date();
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora); 
			
					if(sonido==true){
					
					Toolkit.getDefaultToolkit().beep();
					}
				}
			
			}
			//Crea un objeto oyente de ActionListener		
			ActionListener oyente=new DameLaHora2();
			//Nueva clase pero de tipo interfaz ActionListener
			Timer mitemporizador2=new Timer(3000, oyente);
			//Instancia de la clase timer
			mitemporizador2.start();
	}
	
	
	// No hacen falta ahora estos campos de clase
	//private int intervalo;
	//private boolean sonido;

	//Clase interna a la clase reloj
	/*private class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento){
			
			Date ahora=new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora); 
		
			if(sonido==true){
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	} */
	
	
}




