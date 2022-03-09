package polimorfismo;

public abstract class AnimalEx2 {
	
	private String nome;
	private int idade;
	private double velocidade;
	
	public abstract void emitirSom();
	
	public void movimento()
	{
		System.out.println("Deve correr!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
