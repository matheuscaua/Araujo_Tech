import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BancoAgenda {
	
	String nome, endereco, email, cep, idade, bairro, estado;
	
	
	public BancoAgenda(String nome,
			String endereco,
			String email,
			String cep,
			String idade,
			String bairro,
			String estado) {
			
			this.nome = nome;
			this.endereco = endereco;
			this.email = email;
			this.cep = cep;
			this.idade = idade;
			this.bairro = bairro;
			this.estado = estado;
	}
	
	public void gravar() throws IOException {
		File arquivo = new File("C:\\Users\\00787779\\Desktop\\Workspace_Araujo\\Formulario\\src\\bancoagenda.txt");
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter grava = new FileWriter(arquivo);
		
		String contato = String.format("Nome: %s%n"
				+ "Idade: %s%n"
				+ "Bairro: %s%n"
				+ "Endereco: %s%n"
				+ "Cep: %s%n"
				+ "Estado %s%n"
				+ "Email: %s%n",nome,idade,bairro,endereco,cep,estado,email );
		grava.write(contato);
		grava.flush();
		grava.close();
			
	}

}