package repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade, me=0, ma=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		while(idade<99) {
			
			if(idade<21) {
				me++; }
			
			else if(idade>50) {
				ma++; }
			
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println(me+" pessoas s�o menores de 21 anos e "+ ma+" s�o maiores de 50.");
		System.out.println("FIM DO PROGRAMA");
		
		leia.close();
	}

}