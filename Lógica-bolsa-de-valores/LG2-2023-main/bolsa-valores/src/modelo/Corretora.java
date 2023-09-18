package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Corretora {

	private static final String HISTORICO_ORDENS_TXT = "HistoricoOrdens.txt";

	// os arquivo de texto pra armazenar
	private BufferedWriter writer;
	
	private BufferedReader reader;

	private static int idBase = 0;

	public Corretora() {
		/*
		 * try { writer = new BufferedWriter(new FileWriter(new
		 * File(HISTORICO_ORDENS_TXT), true));
		 * 
		 * reader = new BufferedReader(new FileReader(HISTORICO_ORDENS_TXT)); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
	}

	public void enviarOrdem(AbstratoAcao a, Investidor i) {
		i.adicionarPapel(a);
		

		try {
			reader = new BufferedReader(new FileReader(HISTORICO_ORDENS_TXT));

			char id;
			
			if(reader.readLine() == null) {
				id = 0;
			} else {
				id = reader.readLine().charAt(0);
			}
			
			String ordem = id + ": Ordem " + ": " + a + " enviada para " + i;
			idBase++;
			
			writer = new BufferedWriter(new FileWriter(new File(HISTORICO_ORDENS_TXT), true));
			
			writer.write(ordem + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exibirOrdens() {
		try {
			reader = new BufferedReader(new FileReader(HISTORICO_ORDENS_TXT));
			
			if(reader.readLine() == null) {
				System.out.println("Nenhuma ordem efetuada");
				return;
			}
			
			String linha;
			
			while((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
