import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField boxResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 1 ");
			}
		});
		btn1.setBounds(69, 89, 57, 23);
		contentPane.add(btn1);
		
		boxResultado = new JTextField();
		boxResultado.setBounds(70, 35, 288, 39);
		contentPane.add(boxResultado);
		boxResultado.setColumns(10);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " . ");
			}
		});
		btnPonto.setBounds(311, 154, 47, 23);
		contentPane.add(btnPonto);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.setBounds(131, 186, 54, 23);
		contentPane.add(btnLimpar);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 3 ");
			}
		});
		btn3.setBounds(189, 89, 53, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 4 ");
			}
		});
		btn4.setBounds(247, 89, 58, 23);
		contentPane.add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 2 ");
			}
		});
		btn2.setBounds(131, 89, 54, 23);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 5 ");
			}
		});
		btn5.setBounds(311, 90, 49, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 6 ");
			}
		});
		btn6.setBounds(69, 120, 57, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 7 ");
			}
		});
		btn7.setBounds(131, 121, 54, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 8 ");
			}
		});
		btn8.setBounds(189, 120, 52, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 9 ");
			}
		});
		btn9.setBounds(247, 119, 57, 23);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " 0 ");
			}
		});
		btn0.setBounds(311, 119, 47, 23);
		contentPane.add(btn0);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " + ");
			}
		});
		btnSoma.setBounds(69, 156, 57, 23);
		contentPane.add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " - ");
			}
		});
		btnSub.setBounds(131, 156, 54, 24);
		contentPane.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " * ");
			}
		});
		btnMult.setBounds(189, 156, 53, 23);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = boxResultado.getText();
				boxResultado.setText(texto + " / ");
			}
		});
		btnDiv.setBounds(247, 155, 57, 23);
		contentPane.add(btnDiv);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(69, 186, 57, 23);
		contentPane.add(btnNewButton);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBounds(189, 186, 169, 23);
		contentPane.add(btnIgual);
	}
}
