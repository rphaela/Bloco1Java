package pooHeranca;

public class Cavalo extends Animal {
	
	private String raça;
	private String adestrado;
	private double altura;
	
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	public String getAdestrado() {
		return adestrado;
	}
	public void setAdestrado(String adestrado) {
		this.adestrado = adestrado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void cavaloPrint () {
		System.out.print("CAVALO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\tPeso: "+getPeso()+"kg\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tSom: "+getSom()+"\tRaça: "+getRaça());
		System.out.println("Altura: "+getAltura()+" metros\tÉ adestrado? "+getAdestrado());
	}

}
