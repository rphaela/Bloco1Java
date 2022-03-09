package polimorfismo;

public class CavaloEx2 extends AnimalEx2 {

	private String ra�a;
	private double altura;
	
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void emitirSom() {
		System.out.println("Emite som de: Relinchos!");
	}
	
	public void cavaloPrint() {
		System.out.print("CAVALO\nNome: "+getNome()+"\tIdade: "+getIdade()+" anos\n");
		System.out.println("Velocidade: "+getVelocidade()+ "km\tRa�a: "+getRa�a());
		System.out.println("Altura: "+getAltura());

	}

}
