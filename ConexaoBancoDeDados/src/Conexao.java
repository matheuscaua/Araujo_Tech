import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Conexao {

	private Connection connection = null;
	private java.sql.Statement statement = null;
	private ResultSet resultset = null;

	public Conexao() {
		super();
		conectar();
	}

	public void conectar() {

		String servidor = "jdbc:mysql://localhost/crudgama";
		String usuario = "root";
		String senha = "mysql";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
			System.out.println("Conectou!");
		} catch (Exception e) {
			System.out.println("ERRO:" + e.getMessage());
		}
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {
			return false;
		}
	}

	public void listarFuncionarios() {

		try {

			String query = "select * from tb_funcionarios";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();

			while (this.resultset.next()) {
				String meuId = resultset.getString("idFuncionario");
				String meuNome = resultset.getString("nome");

				System.out.println(meuId);
				System.out.println(meuNome);

			}
		} catch (Exception e) {
			System.out.println("ERRO:" + e.getMessage());
		}
	}

	public void inserirFuncionario(Funcionario funcionario) {
		try {
			String query = "INSERT INTO tb_funcionarios(nome, idade, cpf, endereco, bairro, cep, estado, dataAdmissao, email , celular)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?) ;";
			PreparedStatement stmt;
			stmt = connection.prepareStatement(query);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getIdade());
			stmt.setString(3, funcionario.getCpf());
			stmt.setString(4, funcionario.getEndereco());
			stmt.setString(5, funcionario.getBairro());
			stmt.setString(6, funcionario.getCep());
			stmt.setString(7, funcionario.getEstado());
			stmt.setString(8, funcionario.getDataAdm());
			stmt.setString(9, funcionario.getEmail());
			stmt.setString(10, funcionario.getCelular());
			stmt.execute();
			System.out.println("Salvou no banco de dados!");
		} catch (Exception e) {
			System.out.println("Erro ao inserir!" + e.getMessage());
		}
	}

	List<Funcionario> funcionarios = new ArrayList<>();

	public List<Funcionario> listarFuncionario() throws Exception {
		try {
			String query = "SELECT * FROM tb_funcionarios";
			this.resultset = this.statement.executeQuery(query);
			statement = connection.createStatement();

			while (resultset.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setNome(resultset.getString("nome"));
				funcionario.setIdade(resultset.getString("idade"));
				funcionario.setCpf(resultset.getString("cpf"));
				funcionario.setEndereco(resultset.getString("endereco"));
				funcionario.setBairro(resultset.getString("bairro"));
				funcionario.setEstado(resultset.getString("estado"));
				funcionario.setCep(resultset.getString("cep"));
				funcionario.setDataAdm(resultset.getString("dataAdmissao"));
				funcionario.setEmail(resultset.getString("email"));
				funcionario.setCelular(resultset.getString("celular"));
				funcionarios.add(funcionario);

			}

		} catch (Exception e) {
			System.out.println("ERRO!");
		}
		return funcionarios;
	}

	public void atualizarFuncionario(Funcionario funcionario) {
		try {
			String query = "UPDATE tb_funcionarios SET nome = ?, idade = ?, cpf = ?, endereco = ?, bairro = ?,"
					+ " cep = ?, estado = ?, dataAdmissao = ?, email = ?, celular = ? WHERE cpf = '"+funcionario.getCpf()+"'";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2 , funcionario.getIdade());
			stmt.setString(3, funcionario.getCpf());
			stmt.setString(4, funcionario.getEndereco());
			stmt.setString(5, funcionario.getBairro());
			stmt.setString(6, funcionario.getCep());
			stmt.setString(7, funcionario.getEstado());
			stmt.setString(8, funcionario.getDataAdm());
			stmt.setString(9, funcionario.getEmail());
			stmt.setString(10, funcionario.getCelular());
			stmt.execute();
			
		} catch (Exception e) {
			System.out.println("Nao atualizou" + e.getMessage());
			e.printStackTrace();
		}
	}
}