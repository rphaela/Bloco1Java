package repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int x, total=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("\nInsira um número: ");
		x = leia.nextInt();
		
		do {
			total = total + x;
			
			System.out.print("\nInsira um número: ");
			x = leia.nextInt(); }
		
		while (x!=0);
		
		System.out.println("A soma dos números inseridos é: "+total);
		System.out.println("Fim do programa.");
		
		leia.close();

	}

}
