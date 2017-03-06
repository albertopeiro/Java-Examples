
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int [][] matrix=new int[4][5];
		
		for (int i=0;i<4;i++){
			System.out.println();
			for (int j=0;j<5;j++){
				
				matrix[i][j]=i+j;
				System.out.print(matrix[i][j]+" ");
			}
		}
 Abajo la forma simplificada con for each*/
		int[][] matriz={
				{10,15,18,19,21},
				{5,25,37,48,90}, 
				{1,2,3,4,5}, 
				{5,7,9,11,13}};
		for(int[]fila:matriz){
			
			System.out.println();
			
			for(int z: fila){
				
			System.out.print(z + " ");	
			}
		}
		
		
	}

}
