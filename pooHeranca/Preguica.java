package pooHeranca;

public class Preguica extends Animal {
	
	private String habitat;
	private String especie;
	private double altura;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void preguicaPrint () {
		System.out.print("PREGUI�A\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\tPeso: "+getPeso()+"kg\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tSom: "+getSom()+"\tEsp�cie: "+getEspecie());
		System.out.println("Altura: "+getAltura()+" metros\tHabitat Natural: "+getHabitat());
	}

}
