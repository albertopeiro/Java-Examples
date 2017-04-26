package graficos;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoE marco1=new MarcoE();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoE extends JFrame{
	
	public MarcoE(){
		setBounds(700,300,500,300);
		setTitle("Eventos I");
		LaminaE milamina=new LaminaE();
		add(milamina);
	}
}

class LaminaE extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	}
}