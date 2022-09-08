import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form frame = new Form();
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
	public Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(212, 17, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(212, 73, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(212, 123, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textNome = new JTextField();
		textNome.setBounds(156, 42, 152, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(156, 92, 152, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(156, 148, 152, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textNome.setText("");
				textEmail.setText("");
				textIdade.setText("");
			}
		});
		btnNewButton.setBounds(156, 190, 72, 20);
		contentPane.add(btnNewButton);
		
		JButton verificarBtn = new JButton("Verificar");
		verificarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String email = textEmail.getText();
				String idade = textIdade.getText();
				if(nome.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "O campo nome é obrigatório");
					textNome.requestFocus();
				}else if(email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo email é obrigatório");
					textEmail.requestFocus();
				}else if(idade.isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo idade é obrigatório");
					textEmail.requestFocus();
				}
			}
		});
		verificarBtn.setBounds(232, 189, 89, 23);
		contentPane.add(verificarBtn);
	}
}
