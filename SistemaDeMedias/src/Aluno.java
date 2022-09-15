import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {
	private String nome;
	private double nota01;
	private double nota02;
	double soma = 0;
	double media = 0;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota01() {
		return nota01;
	}
	public void setNota01(double nota01) {
		this.nota01 = nota01;
	}
	public double getNota02() {
		return nota02;
	}
	public void setNota02(double nota02) {
		this.nota02 = nota02;
	}
	
	

	public boolean verificaNota() {
		if((nota01 >= 0 && nota01 <= 10) && (nota02 >= 0 && nota02 <= 10)) {
			return true;
		}
			return false;
		
	}
	
	public double media() {
		media = (this.nota01 + this.nota02) / 2;
		return media;
	}

	public String situacao() {
		if(media() < 4) {
			return "Reprovado!";
		}else if(media() >= 4 && media() < 5) {
			return "Recuperação!";
		}else {
			return "Aprovado!";
		}
	}
	

	public void gravar() throws IOException {
		File arquivo = new File("C:\\Users\\00787779\\Desktop\\Workspace_Araujo\\SistemaDeMedias\\src\\notas.txt");
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter grava = new FileWriter(arquivo);
		
		String aluno = String.format(
		"Nome: %s%n"+
		"Média: %.2f%n" +
		"Situação: %s%n" +
		"----------------",
		nome, media, situacao());
				
		grava.write(aluno);
		grava.flush();
		grava.close();
			
	}
	
	
	
}
