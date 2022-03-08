package pooHeranca;

public class Cavalo extends Animal {
	
	private String ra�a;
	private String adestrado;
	private double altura;
	
	public String getRa�a() {
		return ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		System.out.println("Velocidade: "+getVelocidade()+ "km\tSom: "+getSom()+"\tRa�a: "+getRa�a());
		System.out.println("Altura: "+getAltura()+" metros\t� adestrado? "+getAdestrado());
	}

}
