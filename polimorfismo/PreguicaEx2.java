package polimorfismo;

public class PreguicaEx2 extends AnimalEx2 {
	
	private String habitat;
	private String especie;
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public void emitirSom() {
		System.out.println("Emite som de: Vocaliza��es");
	}
	
	@Override
	public void movimento()
	{
		System.out.println("Deve subir em �rvores!");
	}
	
	public void preguicaPrint() {
		System.out.print("CAVALO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tEsp�cie: "+getEspecie());
		System.out.println("Habitat Natural: "+getHabitat());
	}

}
