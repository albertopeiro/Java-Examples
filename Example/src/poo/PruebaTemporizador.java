package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DameLaHora oyente=new DameLaHora();  //La clase DameLaHora no tiene constructor. Esto usar� el constructor por defecto, que no recibe parametros
		//Creamos instancia de la clase dame la hora para implementar la interfaz ActionListener
		Timer mi_temporizador=new Timer(5000, oyente);
		//Usamos la clase timer para crear un objeto perteneciente a la clase. 
		//El objeto oyente no es de tipo timer, es de tipo DameLaHora que implementa (e instancia) la interfaz ActionListener
		//Tambien se podr�a hacer: ActionListener oyente=new DameLaHora(); en vez del DameLaHora oyente=new DameLaHora();
		mi_temporizador.start();
		//Aqu� empieza el temporizador gracias al m�todo start, perteneciente a la clase timer
		//Esto nos llevar� al m�todo constructor de DameLaHora, que es el actionPerformed (invocado siempre que ocurre un evento)
		//As�, una vez comienza la ejecuci�n, se ir� a este m�todo.
		JOptionPane.showMessageDialog(null, "pulsa Aceptar para detener");
		//
		System.exit(0);
		//
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		
		Date ahora= new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}