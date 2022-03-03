package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Insira os valores dos coeficientes: ");
		a= leia.nextInt();
		b= leia.nextInt();
		c= leia.nextInt();
		d= leia.nextInt();
		e= leia.nextInt();
		f= leia.nextInt();
		
		x= (c*e)-(b*f) / (a*e)-(b*d);
		y= (a*f)-(c*a) / (a*e)-(b*d);
		
		System.out.print("O valor de X é: "+x+" e de Y é: "+y);
		
		leia.close();


	}

}
