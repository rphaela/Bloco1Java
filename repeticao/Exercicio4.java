package repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int total=0, idade, gen, pers, cal=0, mul_ner=0, hom_agr=0, out_cal=0, ner_maior=0, cal_menor=0;
		Scanner leia = new Scanner (System.in);
		
		while(total<150) {
			total++;
			
			System.out.print("\nQuantos anos voc� tem? ");
			idade = leia.nextInt();
			
			System.out.println("\nQual g�nero voc� se identifica?");
			System.out.println("1. Feminino \n2. Masculino \n3. Outros");
			System.out.print("\nDigite o n�mero correspondente a op��o: ");
			gen = leia.nextInt();
			
			System.out.println("\nComo voc� se define?");
			System.out.println("1. Uma pessoa calma \n2. Uma pessoa nervosa \n3. Uma pessoa agressiva.");
			System.out.print("\nDigite o n�mero correspondente a op��o: ");
			pers = leia.nextInt();
			
			if(pers==1) {
				cal++; }
			
			if(gen==1 && pers==2) {
				mul_ner++;	}
			
			if(gen==2 && pers==3) {
				hom_agr++;	}
			
			if(gen==3 && pers==1) {
				out_cal++;	}
			
			if(idade>40 && gen==2) {
				ner_maior++; 	}
			
			if(idade<18 && gen==1) {
				cal_menor++;	}
			
		}
			System.out.println("\nO n�mero de pessoas calmas �: "+cal);
			System.out.println("O n�mero de mulheres nervosas �: "+mul_ner);
			System.out.println("O n�mero de homens agressivos �: "+hom_agr);
			System.out.println("O n�mero de outros calmos �: "+out_cal);
			System.out.println("O n�mero de pessoas nervosas maiores de 40 anos �: "+ner_maior);
			System.out.println("O n�mero de pessoas calmas menores de 18 anos �: "+cal_menor);
			System.out.println("\nFIM DO PROGRAMA");
			
			leia.close();
	}

}