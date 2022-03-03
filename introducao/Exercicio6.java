package introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
		Scanner leia = new Scanner (System.in);
		
			System.out.print("Insira as coordenadas do ponto de partida: ");
			x1= leia.nextDouble();
			y1= leia.nextDouble();
			System.out.print("Insira as coordenadas do ponto de destino: ");
			x2= leia.nextDouble();
			y2= leia.nextDouble();
			
			d= Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
			
			System.out.println("A distância entre eles é: "+d);
			
			leia.close();	

	}

}
