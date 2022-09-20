import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textIdade;
	private JTextField textEndereco;
	private JTextField textBairro;
	private JTextField textCep;
	private JTextField textEstado;
	private JTextField textDataAdm;
	private JTextField textEmail;
	private JTextField textCelular;

	DefaultTableModel model;
	Conexao conexao = new Conexao();
	Funcionario funcionario = new Funcionario();
	List<Funcionario> funcionarios = new ArrayList<>();

	private JTable table;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNome = new JTextField();
		textNome.setBounds(78, 34, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 37, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 75, 46, 14);
		contentPane.add(lblNewLabel_1);

		textCpf = new JTextField();
		textCpf.setBounds(78, 72, 86, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Idade:");
		lblNewLabel_2.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_2);

		textIdade = new JTextField();
		textIdade.setBounds(78, 108, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Endereço: ");
		lblNewLabel_3.setBounds(10, 149, 56, 14);
		contentPane.add(lblNewLabel_3);

		textEndereco = new JTextField();
		textEndereco.setBounds(78, 146, 86, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Bairro:");
		lblNewLabel_4.setBounds(10, 180, 46, 14);
		contentPane.add(lblNewLabel_4);

		textBairro = new JTextField();
		textBairro.setBounds(78, 177, 86, 20);
		contentPane.add(textBairro);
		textBairro.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("CEP:");
		lblNewLabel_5.setBounds(10, 211, 46, 14);
		contentPane.add(lblNewLabel_5);

		textCep = new JTextField();
		textCep.setBounds(78, 208, 86, 20);
		contentPane.add(textCep);
		textCep.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Estado:");
		lblNewLabel_6.setBounds(203, 37, 46, 14);
		contentPane.add(lblNewLabel_6);

		textEstado = new JTextField();
		textEstado.setBounds(306, 34, 123, 20);
		contentPane.add(textEstado);
		textEstado.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Data de admissão: ");
		lblNewLabel_7.setBounds(203, 75, 101, 14);
		contentPane.add(lblNewLabel_7);

		textDataAdm = new JTextField();
		textDataAdm.setBounds(306, 72, 86, 20);
		contentPane.add(textDataAdm);
		textDataAdm.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Email:");
		lblNewLabel_8.setBounds(203, 111, 46, 14);
		contentPane.add(lblNewLabel_8);

		textEmail = new JTextField();
		textEmail.setBounds(306, 108, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("Celular:");
		lblNewLabel_9.setBounds(203, 149, 46, 14);
		contentPane.add(lblNewLabel_9);

		textCelular = new JTextField();
		textCelular.setBounds(306, 146, 86, 20);
		contentPane.add(textCelular);
		textCelular.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 241, 751, 196);
		contentPane.add(scrollPane);

		JTable tabela = new JTable();
		scrollPane.setViewportView(tabela);
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = tabela.getSelectedRow();
				textNome.setText(model.getValueAt(contador, 0).toString());
				textIdade.setText(model.getValueAt(contador, 1).toString());
				textCpf.setText(model.getValueAt(contador, 2).toString());
				textEndereco.setText(model.getValueAt(contador, 3).toString());
				textBairro.setText(model.getValueAt(contador, 4).toString());
				textCep.setText(model.getValueAt(contador, 5).toString());
				textEstado.setText(model.getValueAt(contador, 6).toString());
				textDataAdm.setText(model.getValueAt(contador, 7).toString());
				textEmail.setText(model.getValueAt(contador, 8).toString());
				textCelular.setText(model.getValueAt(contador, 9).toString());
			}

		});
		model = new DefaultTableModel();
		Object[] colunn = { "Nome", "Idade", "Cpf", "Endereço", "Bairro", "CEP", "UF", "Data de Admissão", "Email",
				"Celular" };
		Object[] row = new Object[10];
		model.setColumnIdentifiers(colunn);
		tabela.setModel(model);
		model.setColumnIdentifiers(colunn);
		tabela.setModel(model);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String idade = textIdade.getText();
				String cpf = textCpf.getText();
				String endereco = textEndereco.getText();
				String bairro = textBairro.getText();
				String cep = textCep.getText();
				String estado = textEstado.getText();
				String dataAdmissao = textDataAdm.getText();
				String celular = textCelular.getText();
				String email = textEmail.getText();

				funcionario.setNome(nome);
				funcionario.setIdade(idade);
				funcionario.setCpf(cpf);
				funcionario.setEndereco(endereco);
				funcionario.setBairro(bairro);
				funcionario.setCep(cep);
				funcionario.setEstado(estado);
				funcionario.setDataAdm(dataAdmissao);
				funcionario.setCelular(celular);
				funcionario.setEmail(email);

				if (!Regex.matchesOnlyText(nome) || !Regex.matchesOnlyText(estado)) {
					JOptionPane.showMessageDialog(null, "Nome ou Estado inválidos");
				} else if (!Regex.matchesOnlyNumbers(idade) || !Regex.matchesOnlyNumbersAndDot(cep)
						|| !Regex.matchesOnlyNumbers(celular)) {
					JOptionPane.showMessageDialog(null, "Idade, Cep ou Celular inválidos!");
				} else {
					if (conexao.estaConectado()) {
						conexao.inserirFuncionario(funcionario);
						for (int i = 0; i < funcionarios.size(); i++) {
							funcionarios.add(funcionario);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o funcionário!");
					}
				}
			}
		});
		btnSalvar.setBounds(303, 207, 89, 23);
		contentPane.add(btnSalvar);

		JButton listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					List<Funcionario> funcionarios = conexao.listarFuncionario();
					for (Funcionario funcionario : funcionarios) {
						row[0] = funcionario.getNome();
						row[1] = funcionario.getIdade();
						row[2] = funcionario.getCpf();
						row[3] = funcionario.getEndereco();
						row[4] = funcionario.getBairro();
						row[5] = funcionario.getCep();
						row[6] = funcionario.getEstado();
						row[7] = funcionario.getDataAdm();
						row[8] = funcionario.getEmail();
						row[9] = funcionario.getCelular();
						model.addRow(row);
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		listar.setBounds(203, 207, 89, 23);
		contentPane.add(listar);
		
		JButton atualizar = new JButton("Atualizar");
		atualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String idade = textIdade.getText();
				String cpf = textCpf.getText();
				String endereco = textEndereco.getText();
				String bairro = textBairro.getText();
				String cep = textCep.getText();
				String estado = textEstado.getText();
				String dataAdmissao = textDataAdm.getText();
				String email = textEmail.getText();
				String celular = textCelular.getText();
				

				funcionario.setNome(nome);
				funcionario.setIdade(idade);
				funcionario.setCpf(cpf);
				funcionario.setEndereco(endereco);
				funcionario.setBairro(bairro);
				funcionario.setCep(cep);
				funcionario.setEstado(estado);
				funcionario.setDataAdm(dataAdmissao);
				funcionario.setEmail(email);
				funcionario.setCelular(celular);
				
				conexao.atualizarFuncionario(funcionario);
			}
		});
		atualizar.setBounds(402, 207, 89, 23);
		contentPane.add(atualizar);

	}
}
