package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double n1, n2, n3, media;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Insira sua primeira nota: ");
		n1= leia.nextDouble();
		System.out.print("Insira sua segunda nota: ");
		n2= leia.nextDouble();
		System.out.print("Insira sua terceira nota: ");
		n3= leia.nextDouble();
		
		System.out.println("Calculando sua média... ");
		
		media= (n1*0.2) + (n2*0.3) + (n3*0.5);
		
		System.out.println("Sua média é: "+media);
		
		leia.close();

	}

}
