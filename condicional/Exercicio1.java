package condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira tr�s n�meros inteiros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1>n2 && n2>n3) {
			
			System.out.println("O maior n�mero inserido �: "+n1);
		}
		
		else if(n2>n1 && n1>n3) {
			
			System.out.println("O maior n�mero inserido �: "+n2);
		}
		
		else {
			
			System.out.println("O maior n�mero inserido �: "+n3);
		}
		
		leia.close();

	}

}
