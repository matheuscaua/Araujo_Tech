import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeraArquivo {
	//Estamos criando um método que irá permitir fazer a inserção de vários registros em um arquivo
	public static void escreveTexto(String caminhoArquivo, String textoDigitado) {
		try (
			FileWriter criarArquivos = new FileWriter(caminhoArquivo,true);
			BufferedWriter buffer = new BufferedWriter(criarArquivos);
			PrintWriter escritorDeArquivos = new PrintWriter(buffer);
		
				// Inserindo a linha que irá escrever no nosso arquivo
		){escritorDeArquivos.append(textoDigitado);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}

