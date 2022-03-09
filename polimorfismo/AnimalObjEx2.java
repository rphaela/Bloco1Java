package polimorfismo;


public class AnimalObjEx2 {

	public static void main(String[] args) {
		
		CachorroEx2 c1 = new CachorroEx2 ();
		CavaloEx2 ca1 = new CavaloEx2 ();
		PreguicaEx2 p1 = new PreguicaEx2 ();
		
		c1.setNome("Bob");
		ca1.setNome("Mercury");
		p1.setNome("Sid");
				
		c1.setIdade(2);
		ca1.setIdade(7);
		p1.setIdade(12);
		
		c1.setVelocidade(30);
		ca1.setVelocidade(88);
		p1.setVelocidade(0.20);
		
		c1.setRaça("Caramelo");
		ca1.setRaça("Mustang");
		
		p1.setEspecie("Bradypus variegatus");
		
		c1.setPorte("Médio");
		ca1.setAltura(1.5);
		p1.setHabitat("Florestas tropicais");
		
		
		System.out.println("----------BANCO DE DADOS DE ANIMAIS-------------------------\n");
		c1.cachorroPrint();
		c1.emitirSom();
		c1.movimento();
		System.out.println("\n----------------------------------------------------------\n");
		ca1.cavaloPrint();
		ca1.emitirSom();
		ca1.movimento();
		System.out.println("\n----------------------------------------------------------\n");
		p1.preguicaPrint();
		p1.emitirSom();
		p1.movimento();
		System.out.println("\n----------------------------------------------------------\n");

	}

}
