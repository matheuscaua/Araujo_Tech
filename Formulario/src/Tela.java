import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEndereco;
	private JTextField textCep;
	private JTextField textBairro;
	private JTextField textEstado;
	private JTextField textIdade;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setBounds(10, 11, 46, 14);
		contentPane.add(labelNome);
		
		textNome = new JTextField();
		textNome.setBounds(10, 36, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Endereço");
		lblNewLabel.setBounds(302, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(292, 36, 86, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cep");
		lblNewLabel_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textCep = new JTextField();
		textCep.setBounds(10, 92, 86, 20);
		contentPane.add(textCep);
		textCep.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(164, 11, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textBairro = new JTextField();
		textBairro.setBounds(154, 36, 86, 20);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Estado");
		lblNewLabel_3.setBounds(164, 67, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textEstado = new JTextField();
		textEstado.setBounds(154, 92, 86, 20);
		contentPane.add(textEstado);
		textEstado.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Idade");
		lblNewLabel_4.setBounds(302, 67, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textIdade = new JTextField();
		textIdade.setBounds(292, 92, 86, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textEmail.setText("");
				textEndereco.setText("");
				textCep.setText("");
				textIdade.setText("");
				textBairro.setText("");
				textEstado.setText("");
			}
		});
		btnLimpar.setBounds(85, 191, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnEnviar = new JButton("Gravar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText(), endereco = textEndereco.getText(), cep = textCep.getText(),
				bairro = textBairro.getText(), estado = textEstado.getText(), idade = textIdade.getText(),
				email = textEmail.getText();
				
				if(nome.isEmpty() || email.isEmpty() || idade.isEmpty() ) {
					textNome.setText("Preencha!");
					textEmail.setText("Preencha!");
					textIdade.setText("Preencha!");
				}else {
					BancoAgenda bancoAgenda = new BancoAgenda(nome,endereco,email,cep,idade,bairro,estado);
					
					try {
						bancoAgenda.gravar();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			}
		});
		btnEnviar.setBounds(248, 191, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(10, 126, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textEmail = new JTextField();
		textEmail.setBounds(10, 151, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
	}
}
