package poointro;

import java.util.Scanner;

public class Aviao {
	
	String modelo, partida, destino;
	int ano, assentos;
	Scanner leia = new Scanner (System.in);
	
		public void viagens() {
		System.out.println("Qual a cidade de partida?" );
		partida=leia.next();
		System.out.println("Qual a cidade destino? ");
		destino=leia.next(); }
		
		public void caracteristicas() {
		System.out.print("\nInsira o modelo do avião: ");
		modelo=leia.next();
		System.out.print("\nInsira o seu ano de fabricação: ");
		ano=leia.nextInt();
		System.out.print("\nQuantos assentos há disponíveis? ");
		assentos=leia.nextInt(); }
	
	public void estado() {
		System.out.println("\nProcedimento concluído! ");
		System.out.println("O avião " +modelo+ " fabricado em " +ano+ " está apto para decolagem!");
		System.out.println("A aeronave conta com " +assentos+ " assentos dispoíveis para a viagem até " +destino+ " saindo de " +partida+ ".");
		System.out.println("Boa viagem! ");
		
	}
	
	
	
	

}
