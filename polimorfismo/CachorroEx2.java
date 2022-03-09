package polimorfismo;

public class CachorroEx2 extends AnimalEx2{

	private String raça;
	private String porte;
		
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	@Override
	public void emitirSom() {
		System.out.println("Emite som de: Latidos");
		}
		
	public void cachorroPrint() {
		System.out.print("CACHORRO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tRaça: "+getRaça());
		System.out.println("Porte: "+getPorte());

	}
}
