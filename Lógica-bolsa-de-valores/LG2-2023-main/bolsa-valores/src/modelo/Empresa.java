package modelo;

public class Empresa {

	private final String nome;
	
	private int cotas;
	
	public Empresa(String nome, int cotas) {
		this.nome = nome;
		if(cotas <= 0) {
			throw new RuntimeException("O numero de cotas da empresa não pode ser inferior a zero!");
		}
		this.cotas = cotas;
	}
	
	public void comprarCotas(int cotas) {
		if(this.cotas == 0 || this.cotas < cotas) {
			throw new RuntimeException("O numero de cotas da empresa não pode ser inferior a zero!");
		}
		this.cotas -= cotas;
	}
	
	public String getNome() {
		return nome;
	}
}
