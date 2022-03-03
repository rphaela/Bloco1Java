package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
	int a, b, c, d, r, s;
	Scanner leia = new Scanner (System.in);
	
	System.out.print("Digite o primeiro número inteiro e positivo: ");
	a = leia.nextInt();
	System.out.print("Digite o segundo número inteiro e positivo: ");
	b = leia.nextInt();
	System.out.print("Por fim, dgite o último número inteiro e positivo: ");
	c = leia.nextInt();
	
	r= (a+b)*(a+b);
	s= (b+c)*(b+c);
	d= (r+s)/2;
	
	System.out.print("O resultado da equação é: "+d);
	
	leia.close();


	}
}