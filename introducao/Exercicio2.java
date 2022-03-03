package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int d, m, a;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Qual a sua idade em dias? ");
		d = leia.nextInt();
				
		a = d/360;
		m = (d%365)/30;
		d = (d%365)%30;
		
		System.out.print("Você tem "+a+" anos, "+m+" meses e "+d+" dias!");
		
		leia.close();

	}

}
