package pooHeranca;

public class AnimalObj {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro ();
		Cavalo ca1 = new Cavalo ();
		Preguica p1 = new Preguica ();
		
		c1.setNome("Bob");
		ca1.setNome("Mercury");
		p1.setNome("Sid");
				
		c1.setIdade(2);
		ca1.setIdade(7);
		p1.setIdade(12);
		
		c1.setPeso(4.5);
		ca1.setPeso(300);
		p1.setPeso(3);
		
		c1.setVelocidade(30);
		ca1.setVelocidade(88);
		p1.setVelocidade(0.20);
		
		c1.setSom("Latidos");
		ca1.setSom("Relinchos");
		p1.setSom("Vocalizações");
		
		c1.setRaça("Caramelo");
		ca1.setRaça("Mustang");
		
		p1.setEspecie("Bradypus variegatus");
		
		c1.setPorte("Médio");
		
		ca1.setAltura(1.5);
		p1.setAltura(0.60);
		
		c1.setAdestrado("Não");
		ca1.setAdestrado("Sim");
		
		p1.setHabitat("Florestas tropicais");
		
		System.out.println("----------BANCO DE DADOS DE ANIMAIS-------------------------\n");
		c1.cachorroPrint();
		System.out.println("\n----------------------------------------------------------\n");
		ca1.cavaloPrint();
		System.out.println("\n----------------------------------------------------------\n");
		p1.preguicaPrint();
		System.out.println("\n----------------------------------------------------------\n");

	}

}
