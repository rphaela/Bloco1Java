package condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira três números inteiros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1<n2 && n2<n3) {
			System.out.print("Em ordem crescente: "+n1+ ", "+n2+" e "+n3);
		}
		
		else if(n1<n3 && n3<n2) {
			System.out.print("Em ordem crescente: "+n1+ ", "+n3+" e "+n2);
		}
		
		else if(n2<n1 && n1<n3) {
			System.out.print("Em ordem crescente: "+n2+ ", "+n1+" e "+n3);
		}
		
		else if(n2<n3 && n3<n1) {
			System.out.print("Em ordem crescente: "+n2+ ", "+n3+" e "+n1);
		}
		
		else if(n3<n2 && n2<n1) {
			System.out.print("Em ordem crescente: "+n3+ ", "+n2+" e "+n1);
		}
		
		else
			System.out.print("Em ordem crescente: "+n3+ ", "+n1+" e "+n2);
		
		leia.close();
		
	}

}
