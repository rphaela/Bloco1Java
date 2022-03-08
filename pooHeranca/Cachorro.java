package pooHeranca;

public class Cachorro extends Animal {

	private String ra�a;
	private String adestrado;
	private String porte;
	
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
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void cachorroPrint () {
		System.out.print("CACHORRO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\tPeso: "+getPeso()+"kg\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tSom: "+getSom()+"\tRa�a: "+getRa�a());
		System.out.println("Porte: "+getPorte()+"\t� adestrado? "+getAdestrado());
	}
	
}
