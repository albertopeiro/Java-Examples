package poo;
import javax.swing.JOptionPane;

public class Array_preguntas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n=JOptionPane.showInputDialog("Introduce el número de preguntas");
		int m=Integer.parseInt(n);
		String [] paises=new String[m];
		
		for(int i=0; i<paises.length; i++){
		paises[i]=JOptionPane.showInputDialog("Introduce la pregunta " + (i+1));
		}
		
	String seguimos ="";
		while (seguimos.equalsIgnoreCase("no")==false){
		int j=(int) Math.round(Math.random()*(paises.length-1));
		seguimos=JOptionPane.showInputDialog(j+1 +" " + paises[j] + ". Seguimos? Introduce 'no' para salir");
		}
	
	}

}
