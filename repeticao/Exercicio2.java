package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x, par=0, imp=0;
		Scanner leia = new Scanner (System.in);
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Insira um n�mero: ");
			x= leia.nextInt();
			
			if(x%2==0) {
				par++;
			}
			
			else {
				imp++;
			}
		}
			System.out.println("Dos n�meros inseridos, "+ par+" s�o par e "+ imp+ " s�o �mpares.");
			
		leia.close();
	}

}
