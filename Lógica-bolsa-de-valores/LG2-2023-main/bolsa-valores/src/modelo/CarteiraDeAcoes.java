package modelo;

import util.FilaDinamica;

public class CarteiraDeAcoes {

	private FilaDinamica<AbstratoAcao> acoes;
	
	public CarteiraDeAcoes() {
		acoes = new FilaDinamica<AbstratoAcao>();
	}
	
	public void adicionarAcao(AbstratoAcao a) {
		acoes.adicionar(a);
	}
	
	@Override
	public String toString() {
		return acoes.toString();
	}
}
