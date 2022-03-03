package introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double cf, pd, im, cc;
		Scanner leia = new Scanner (System.in);
		
			System.out.print("Insira o valor do custo de fábrica: ");
			cf= leia.nextDouble();
			
			pd = cf*0.28;
			im = cf*0.45;
			cc = cf+pd+im;
			
			System.out.print("O custo ao consumidor é de "+cc+" reais.");
			
			leia.close();

	}

}
