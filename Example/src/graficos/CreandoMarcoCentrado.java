package graficos;

import java.awt.*;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco=new MarcoCentrado();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame{
	// Método contructor de la clase con el mismo nombre de la clase
	public MarcoCentrado(){
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		
		Dimension areaPantalla=mipantalla.getScreenSize();
		int alturaPantalla=areaPantalla.height;
		int anchoPantalla=areaPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("HOOOOOLA :D");
		
		Image miIcono=mipantalla.getImage("src/graficos/mario.png");
		
		setIconImage(miIcono);
	
	}
	
}