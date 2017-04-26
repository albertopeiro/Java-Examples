package graficos;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlantillaMarco {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco marco1=new Marco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco extends JFrame{
	
	public Marco(){
		setBounds(700,300,500,300);
		setTitle("Eventos I");
		Lamina milamina=new Lamina();
		add(milamina);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
}