package polimorfismo;

public class CavaloEx2 extends AnimalEx2 {

	private String raça;
	private double altura;
	
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
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
		System.out.println("Velocidade: "+getVelocidade()+ "km\tRaça: "+getRaça());
		System.out.println("Altura: "+getAltura());

	}

}
