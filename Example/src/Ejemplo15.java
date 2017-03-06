import javax.swing.JOptionPane;

public class Ejemplo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//double x=1000.0;
//System.out.printf("%1.2f",x/3); 

//printf es print format, no println
//el mensaje da instrucciiones sobre el formato
//mirar inputs del método

String num1=JOptionPane.showInputDialog("Introduce un número");
double num2=Double.parseDouble(num1);
System.out.print("La raíz de " + num2 + " es ");
System.out.printf("%1.2f", Math.sqrt(num2));


	}

}
