package graficos;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.io.File;
import java.io.IOException;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoI marco1=new MarcoI();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoI extends JFrame{
	
	public MarcoI(){
		
		setBounds(350,100,1000,800);
		setTitle("Imagenes");
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
}
}

class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g){
	
		super.paintComponent(g);
	
		try{
			imagen=ImageIO.read(new File("C:/Users/ac5915/Desktop/Farm.png"));
		}
		catch(IOException e){
		
			System.out.println("No se encuentra la imagen");
		}
	
		g.drawImage(imagen, 50, 50, null);

	}
	
	private Image imagen; 
}

