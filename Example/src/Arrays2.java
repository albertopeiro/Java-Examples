
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* C�digo en comentario es equivalente al no comentado!!
		
		
		String[] paises=new String[8];
		
		paises[0]="Espa�a";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Per�";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";*/
		
		String [] paises={"Espa�a", "Mexico", "Colombia", "Per�", "Argentina", "Ecuador", "Venezuela"};
		
		/*for(int i=0; i<paises.length; i++){
			
			System.out.println("Pais " + (i+1) +" "+ paises[i]);
		}*/
		
		for(String elemento:paises){ System.out.println("Pa�s: " + elemento);}
	}

}
