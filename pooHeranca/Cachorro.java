package pooHeranca;

public class Cachorro extends Animal {

	private String raça;
	private String adestrado;
	private String porte;
	
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
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void cachorroPrint () {
		System.out.print("CACHORRO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\tPeso: "+getPeso()+"kg\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tSom: "+getSom()+"\tRaça: "+getRaça());
		System.out.println("Porte: "+getPorte()+"\tÉ adestrado? "+getAdestrado());
	}
	
}
