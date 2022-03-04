package repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int x, par=0, imp=0;
		Scanner leia = new Scanner (System.in);
		
		for(int i=1; i<=10; i++) {
			
			System.out.println("Insira um número: ");
			x= leia.nextInt();
			
			if(x%2==0) {
				par++;
			}
			
			else {
				imp++;
			}
		}
			System.out.println("Dos números inseridos, "+ par+" são par e "+ imp+ " são ímpares.");
			
		leia.close();
	}

}
