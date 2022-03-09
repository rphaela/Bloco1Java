package polimorfismo;

public class CachorroEx2 extends AnimalEx2{

	private String ra�a;
	private String porte;
		
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
		System.out.println("Velocidade: "+getVelocidade()+ "km\tRa�a: "+getRa�a());
		System.out.println("Porte: "+getPorte());

	}
}
