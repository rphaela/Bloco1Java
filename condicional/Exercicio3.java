package condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			
			System.out.println("Voc� est� na categoria Infantil!" );
		}
		
		else if(idade>=15 && idade<=17) {
			System.out.println("Voc� est� na categoria Juvenil! ");
		}
		
		else if(idade>=18 && idade<=25) {
			System.out.println("Voc� est� na categoria Adulto!");
		}
		
		else
			System.out.println("N�o se enquadra em nenhuma de nossas categorias. ");
		
		leia.close();

	}

}
