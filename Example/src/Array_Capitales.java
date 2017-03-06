
public class Array_Capitales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado;
		double interes=0.10;
		final double capital=10000;		
		double [][] saldo=new double[6][5];
		
		System.out.print(capital);
		for (int i=0; i<saldo.length; i++){
			
			saldo[i][0]=capital	;
			acumulado=10000;
			System.out.println();
			for (int j=1;j<5; j++){
				acumulado=acumulado*(1+interes);
				saldo [i][j]=acumulado;
				System.out.printf("%1.2f", saldo [i] [j]);
				System.out.print(" ");
			}
			interes=interes+0.01;
		}
		
	}

}
