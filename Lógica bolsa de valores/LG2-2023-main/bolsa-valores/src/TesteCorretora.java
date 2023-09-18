import modelo.AcaoFII;
import modelo.Corretora;
import modelo.Investidor;

public class TesteCorretora {

	public static void main(String[] args) {
		
		Corretora c = new Corretora();
		
		AcaoFII a1 = new AcaoFII("Nome tal", 19.9, 0.0, 30.0, 100);
		AcaoFII a2 = new AcaoFII("Nome qualquer", 29.9, 1.0, 20.0, 30);
		
		Investidor i1 = new Investidor(1240125, "Davi Gomes", 10000.0);
		Investidor i2 = new Investidor(1295862, "Mr. Rocha", 10000.0);
		
		c.enviarOrdem(a1, i1);
		c.enviarOrdem(a2, i2);
		
		c.exibirOrdens();
	}
}
