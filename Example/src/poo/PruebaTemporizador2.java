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

		Reloj mireloj=new Reloj(3000,true);
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
		
		System.exit(0);
	}

}

class Reloj{
	
	public Reloj (int intervalo, boolean sonido){
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		//This para los campos de clase, o sea las variables declaradas dentro de la clase
		//Y los no this son los pertenecientes al método constructo public Reloj
		
	}
	
	public void enMarcha(){
		
		ActionListener oyente=new DameLaHora2();
		//Nueva clase pero de tipo interfaz ActionListener
		Timer mitemporizador2=new Timer(3000, oyente);
		//Instancia de la clase timer
		mitemporizador2.start();
	}
	
	private int intervalo;
	private boolean sonido;

	private class DameLaHora2 implements ActionListener{
		
		public void actionPerformed(ActionEvent evento){
			
			Date ahora=new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora); 
		
			if(sonido==true){
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
	
	
}




