import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Produto {
	private String nome;
	private String quantidade;
	private String valorUni;
	private String marca;
	private String validade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValorUni() {
		return valorUni;
	}
	public void setValorUni(String valorUni) {
		this.valorUni = valorUni;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
	@Override
	public String toString() {
		return String.format("Nome: %s%n"
				+ "Valor Unitário: %s%n"
				+ "Quantidade: %s%n"
				+ "Marca: %s%n"
				+ "Validade: %s%n"
				+ "/------------------------------/", nome, valorUni, quantidade, marca, validade);
	}
	
	public void escreverArquivo() {
		try (
			
				FileWriter arquivo = new FileWriter("C:\\Users\\00787779\\Desktop\\Workspace_Araujo\\CadastroProduto\\src\\ArquivoTexto\\produtos.txt",true);
				BufferedWriter buffer = new BufferedWriter(arquivo);
				PrintWriter escritorDeArquivos = new PrintWriter(buffer);
			
				
			){escritorDeArquivos.append(toString());
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
}
