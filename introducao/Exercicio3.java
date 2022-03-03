package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int s, min, h;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Informe a duração do seu evento em segundos: ");
		s = leia.nextInt();
				
		h = s/3600;
		min = (s%3600)/60;
		s = (s%3600)%60;
		
		System.out.print("Seu evento tem a duração de "+h+" hora(s), "+min+" minuto(s) e "+s+" segundo(s)!");
		
		leia.close();

	}

}
