import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

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

public class Aplicacao extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField nota01;
	private JTextField nota02;
	private JTextField media;

	String nomeInput;
	String nota01I;
	String nota02I;
	private JTextField situacao;
	private JButton limpar;
	private JTable tabela;
	DefaultTableModel model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacao frame = new Aplicacao();
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
	public Aplicacao() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		nome = new JTextField();
		nome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nome.setBounds(45, 29, 192, 20);
		contentPane.add(nome);
		nome.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(45, 11, 159, 20);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Primeira Nota");
		lblNewLabel_1.setBounds(45, 52, 159, 14);
		contentPane.add(lblNewLabel_1);

		nota01 = new JTextField();
		nota01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		nota01.setBounds(45, 71, 192, 20);
		contentPane.add(nota01);
		nota01.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Segunda Nota");
		lblNewLabel_2.setBounds(45, 93, 159, 14);
		contentPane.add(lblNewLabel_2);

		nota02 = new JTextField();
		nota02.setBounds(45, 110, 192, 20);
		contentPane.add(nota02);
		nota02.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Média");
		lblNewLabel_3.setBounds(45, 141, 46, 14);
		contentPane.add(lblNewLabel_3);

		media = new JTextField();
		media.setForeground(new Color(0, 0, 0));
		media.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		media.setBounds(45, 156, 192, 20);
		contentPane.add(media);
		media.setColumns(10);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 29, 316, 247);
		contentPane.add(scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = tabela.getSelectedRow();
				nome.setText(model.getValueAt(contador, 0).toString());
				nota01.setText(model.getValueAt(contador, 1).toString());
				nota02.setText(model.getValueAt(contador, 2).toString());
				media.setText(model.getValueAt(contador, 3).toString());
				situacao.setText(model.getValueAt(contador, 4).toString());

			}

		});
		model=new DefaultTableModel();
		Object[] colunn = {"nome","nota01","nota02","media", "situação"};
		Object[] row= new Object[5];
		model.setColumnIdentifiers(colunn); 
		tabela.setModel(model);
		model.setColumnIdentifiers(colunn);
		tabela.setModel(model);
		
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				nomeInput = nome.getText();
				nota01I = nota01.getText();
				nota02I = nota02.getText();

				if (nomeInput.isEmpty() || nota01I.isEmpty() || nota02I.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					
				} else {
					if(!Regex.matchesOnlyText(nomeInput)) {
						JOptionPane.showMessageDialog(null, "Nome com número? Virjão demais");
					}else if(!Regex.matchesOnlyNumbers(nota01I)) {
						JOptionPane.showMessageDialog(null, "Nota com letra? Mais Virgem ainda!");
					}else {
						aluno.setNome(nomeInput);
						
						aluno.setNota01(Double.parseDouble(nota01I));
						aluno.setNota02(Double.parseDouble(nota02I));
	
						if (aluno.verificaNota() == true) {
							media.setText(String.valueOf(aluno.media()));
							situacao.setText(aluno.situacao());
							try {
								aluno.gravar();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							row[0]=nome.getText();
							row[1]=nota01I;
							row[2]=nota02I;
							row[3]=aluno.media();
							row[4]=aluno.situacao();
							model.addRow(row);
						} else {
							JOptionPane.showMessageDialog(null, "Nota inválida!");
						}
						
					}
				}
			}
		});
		calcular.setBounds(148, 253, 89, 23);
		contentPane.add(calcular);

		JLabel lblNewLabel_4 = new JLabel("Situação");
		lblNewLabel_4.setBounds(45, 187, 46, 14);
		contentPane.add(lblNewLabel_4);

		situacao = new JTextField();
		situacao.setForeground(new Color(0, 0, 0));
		situacao.setBounds(45, 212, 192, 20);
		contentPane.add(situacao);
		situacao.setColumns(10);

		limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome.setText("");
				nota01.setText("");
				nota02.setText("");
				situacao.setText("");
				media.setText("");
			}
		});
		limpar.setBounds(44, 253, 79, 23);
		contentPane.add(limpar);

		
	}
}
