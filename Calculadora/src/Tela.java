import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField textValor1;
	private JTextField textValor2;
	private JTextField textResultado;

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

		Operacoes operacao = new Operacoes();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Valor1");

		lblNewLabel.setBounds(25, 11, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Valor2");

		lblNewLabel_1.setBounds(188, 11, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(328, 11, 69, 14);
		contentPane.add(lblNewLabel_2);

		JButton somaBtn = new JButton("Soma");
		somaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String valor1 = textValor1.getText();
				String valor2 = textValor2.getText();

				String soma = operacao.soma(valor1, valor2);
				textResultado.setText(soma);
			}
		});
		somaBtn.setBounds(10, 104, 80, 23);
		contentPane.add(somaBtn);

		JButton subBtn = new JButton("Subtração");
		subBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textValor1.getText();
				String valor2 = textValor2.getText();

				String sub = operacao.sub(valor1, valor2);
				textResultado.setText(sub);
			}
		});
		subBtn.setBounds(100, 104, 89, 23);
		contentPane.add(subBtn);

		JButton multBtn = new JButton("Multiplicação");
		multBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textValor1.getText();
				String valor2 = textValor2.getText();

				String mult = operacao.mult(valor1, valor2);
				textResultado.setText(mult);
			}
		});
		multBtn.setBounds(199, 104, 117, 23);
		contentPane.add(multBtn);

		JButton divBtn = new JButton("Divisão");
		divBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1 = textValor1.getText();
				String valor2 = textValor2.getText();

				String div = operacao.div(valor1, valor2);
				textResultado.setText(div);
			}
		});
		divBtn.setBounds(326, 104, 89, 23);
		contentPane.add(divBtn);

		textValor1 = new JTextField();
		textValor1.setBounds(4, 36, 86, 20);
		contentPane.add(textValor1);
		textValor1.setColumns(10);

		textValor2 = new JTextField();
		textValor2.setBounds(170, 36, 86, 20);
		contentPane.add(textValor2);
		textValor2.setColumns(10);

		textResultado = new JTextField();
		textResultado.setBounds(329, 36, 86, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);

		JButton limparBtn = new JButton("Limpar");
		limparBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValor1.setText("");
				textValor2.setText("");
				textResultado.setText("");
			}
		});
		limparBtn.setBounds(100, 149, 89, 23);
		contentPane.add(limparBtn);

		JButton sairBtn = new JButton("Sair");
		sairBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		sairBtn.setBounds(207, 149, 89, 23);
		contentPane.add(sairBtn);
	}

}
