package condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double x, p= 0, r;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira um num�ro: ");
		x = leia.nextDouble();
		
		if(x%2==0) {
			
			r= Math.sqrt(x);
			
			System.out.println(x+" � um n�mero par e a sua raiz quadrada � "+r+" !");
		}
		
		else if(x%2!=0) {
			
			p= Math.pow(x, 2);
			
			System.out.println(x+" � um n�mero �mpar e elevado ao quadrado � "+p+" !");
			
		}
		
		leia.close();
	}

}
