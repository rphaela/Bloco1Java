package poointro;

import java.util.Scanner;

public class Cliente {
	
	String nome, email, pag, feedback;
	int nEnd, contato, assinante;
	
	Scanner leia = new Scanner (System.in);
	
	public void assinar() {
		System.out.println("\nEsta p�gina � apenas para assinantes. ");
		System.out.println("Gostaria de ter acesso a este conte�do?");
		System.out.println("Digite 1 para SIM ou 2 para N�O: ");
		assinante=leia.nextInt();
	}
	
	public void cadastrar() {
		if(this.assinante==1) {
		System.out.println("\nInsira suas informa��es para concluirmos sua assinatura! ");
		System.out.print("\nNome: ");
		this.nome=leia.next();
		System.out.print("\nE-mail: ");
		this.email=leia.next();
		System.out.print("\nTelefone para contato: ");
		this.contato=leia.nextInt();
		System.out.print("\nQual a forma de pagamento? ");
		this.pag=leia.next();
		
		System.out.println("\nResumo da transa��o:");
		System.out.println("Parab�ns, "+nome+ ", voc� adquiriu sua assinatura!");
		System.out.println("A confirma��o foi mandada para " +email+ "!"); }
		
		else
		System.out.println("\nEstamos te redirecionando para nosso conte�do gratuito!");
		}
	
		public void feedback() {
			
			if(this.assinante==2) {
				System.out.println("\nEnvie o seu feedback e ganhe 2 horas de acesso ilimitado!");
				System.out.println("O que te impede de se tornar nosso assinante? ");
				feedback=leia.next();
				System.out.println("Agradecemos pela sua opini�o!"); }
			
				else {
				System.out.println("Avalie sua satisfa��o conosco! ");
				feedback=leia.next();
				System.out.println("Agradecemos pela sua opini�o!"); } }
		
		public void estado( ) {
			if (this.assinante==1) {
				System.out.println(email+ " j� � um assinante. "); }
			
			else 
				System.out.println("N�o h� dados cadastrados. "); }
}
