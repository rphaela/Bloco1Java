package repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int x, total=0;
		double med= 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Para sair do programa digite '0'. ");
		System.out.print("\nInsira um número inteiro: ");
		x = leia.nextInt();
		
		do {
			if(x%3==0) {
				total++;
				med= med + x; }
			
			System.out.print("\nInsira um número inteiro: ");
			x = leia.nextInt(); 	}
		
		while(x!=0);
		
			System.out.println("A média dos números múltiplos de 3 é: "+med/total);
			
			leia.close();

	}

}