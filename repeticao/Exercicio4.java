package repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int total=0, idade, gen, pers, cal=0, mulNer=0, homAgr=0, outCal=0, nerMaior=0, calMenor=0;
		Scanner leia = new Scanner (System.in);
		
		while(total<150) {
			total++;
			
			System.out.print("\nQuantos anos você tem? ");
			idade = leia.nextInt();
			
			System.out.println("\nQual gênero você se identifica?");
			System.out.println("1. Feminino \n2. Masculino \n3. Outros");
			System.out.print("\nDigite o número correspondente a opção: ");
			gen = leia.nextInt();
			
			System.out.println("\nComo você se define?");
			System.out.println("1. Uma pessoa calma \n2. Uma pessoa nervosa \n3. Uma pessoa agressiva.");
			System.out.print("\nDigite o número correspondente a opção: ");
			pers = leia.nextInt();
			
			if(pers==1) {
				cal++; }
			
			if(gen==1 && pers==2) {
				mulNer++;	}
			
			if(gen==2 && pers==3) {
				homAgr++;	}
			
			if(gen==3 && pers==1) {
				outCal++;	}
			
			if(idade>40 && gen==2) {
				nerMaior++; 	}
			
			if(idade<18 && gen==1) {
				calMenor++;	}
			
		}
			System.out.println("\nO número de pessoas calmas é: "+cal);
			System.out.println("O número de mulheres nervosas é: "+mulNer);
			System.out.println("O número de homens agressivos é: "+homAgr);
			System.out.println("O número de outros calmos é: "+outCal);
			System.out.println("O número de pessoas nervosas maiores de 40 anos é: "+nerMaior);
			System.out.println("O número de pessoas calmas menores de 18 anos é: "+calMenor);
			System.out.println("\nFIM DO PROGRAMA");
			
			leia.close();
	}

}