package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1=new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class miMarco extends JFrame{
	
	public miMarco(){
		//El tama�o quedar� mejor o peor dependiendo de la resoluci�n
		// del monitor, para ajustar el tama�o a la resoluci�n, hay que
		// hacerlo con la clase Toolkit, y es mas complejo
		/* Ambas se pueden hacer desde SetBounds
		setSize(250,250);
		setLocation(500,300);
		*/
		setBounds(500,300,550,250);
		//NON resizable
		//setResizable(false);
		//FULL screen
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("HOOOOLA :)");
	}
}