package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int a, m, d;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Quantos anos você tem? ");
		a = leia.nextInt();
		System.out.print(a+" anos e quantos meses? ");
		m = leia.nextInt();
		System.out.print(a+" anos "+m+" meses e quantos dias? ");
		d = leia.nextInt();
		
		a = a*365;
		m = m*30;
		d = d+a+m;
		
		System.out.println("Você tem "+d+" dias de vida!");
		
		leia.close();

	}

}
