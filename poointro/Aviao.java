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
		System.out.print("\nInsira o modelo do avi�o: ");
		modelo=leia.next();
		System.out.print("\nInsira o seu ano de fabrica��o: ");
		ano=leia.nextInt();
		System.out.print("\nQuantos assentos h� dispon�veis? ");
		assentos=leia.nextInt(); }
	
	public void estado() {
		System.out.println("\nProcedimento conclu�do! ");
		System.out.println("O avi�o " +modelo+ " fabricado em " +ano+ " est� apto para decolagem!");
		System.out.println("A aeronave conta com " +assentos+ " assentos dispo�veis para a viagem at� " +destino+ " saindo de " +partida+ ".");
		System.out.println("Boa viagem! ");
		
	}
	
	
	
	

}
