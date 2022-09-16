import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField nomeProd;
	private JTextField quantidadeProd;
	private JTextField valorUnitario;
	private JTextField marcaProd;
	private JTextField validadeProd;
	private JTable table;

	DefaultTableModel model;

	private String nome;
	private String quantidade;
	private String valorUni;
	private String marca;
	private String validade;
	
	
	private JTextField quantidadeProduto;
	private JTable tabela;

	Produto produto = new Produto();
	SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 11, 114, 19);
		contentPane.add(lblNewLabel);

		nomeProd = new JTextField();
		nomeProd.setBounds(10, 30, 172, 20);
		contentPane.add(nomeProd);
		nomeProd.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Quantidade:");
		lblNewLabel_1.setBounds(10, 61, 114, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Valor Unitário");
		lblNewLabel_2.setBounds(10, 108, 114, 19);
		contentPane.add(lblNewLabel_2);

		valorUnitario = new JTextField();
		valorUnitario.setBounds(10, 125, 172, 20);
		contentPane.add(valorUnitario);
		valorUnitario.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Marca:");
		lblNewLabel_3.setBounds(10, 156, 46, 14);
		contentPane.add(lblNewLabel_3);

		marcaProd = new JTextField();
		marcaProd.setBounds(10, 169, 172, 20);
		contentPane.add(marcaProd);
		marcaProd.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Validade");
		lblNewLabel_4.setBounds(10, 193, 114, 14);
		contentPane.add(lblNewLabel_4);

		validadeProd = new JTextField();
		validadeProd.setBounds(10, 211, 172, 20);
		contentPane.add(validadeProd);
		validadeProd.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(208, 30, 428, 238);
		contentPane.add(scrollPane);

		tabela = new JTable();
		scrollPane.setViewportView(tabela);

		tabela.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int contador = tabela.getSelectedRow();
				nomeProd.setText(model.getValueAt(contador, 0).toString());
				quantidadeProduto.setText(model.getValueAt(contador, 1).toString());
				valorUnitario.setText(model.getValueAt(contador, 2).toString());
				marcaProd.setText(model.getValueAt(contador, 3).toString());
				validadeProd.setText(model.getValueAt(contador, 4).toString());
			}

		});
		model = new DefaultTableModel();
		Object[] colunn = { "Nome", "Quantidade", "Valor Un", "Marca", "Validade" };
		Object[] row = new Object[5];
		model.setColumnIdentifiers(colunn);
		tabela.setModel(model);
		model.setColumnIdentifiers(colunn);
		tabela.setModel(model);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome = nomeProd.getText();
				quantidade = quantidadeProduto.getText();
				valorUni = valorUnitario.getText();
				marca = marcaProd.getText();
				validade = validadeProd.getText();
				
				if (nome.isEmpty() || quantidade.isEmpty() || valorUni.isEmpty() || marca.isEmpty()
						|| validade.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campos inválidos! ");
				} else {
					if(!Regex.matchesOnlyNumbers(quantidade) || !Regex.matchesOnlyNumbers(valorUni)) {
						JOptionPane.showMessageDialog(null, "Campo inválido!");
					}else {
						produto.setNome(nome);
						produto.setQuantidade(quantidade);
						produto.setValorUni(valorUni);
						produto.setMarca(marca);	
						try {
							Date validadeData = dataFormatada.parse(validade);
							validadeProd.setText(validade);
							row[0] = nome;
							row[1] = quantidade;
							row[2] = valorUni;
							row[3] = marca;
							row[4] = validade;
							produto.escreverArquivo();
							model.addRow(row);
						} catch (ParseException e1) {
							JOptionPane.showMessageDialog(null, "Data Inválida!");
							
						}
						
						
					}
				}
			}
		});

		btnNewButton.setBounds(101, 242, 81, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeProd.setText("");
				quantidadeProduto.setText("");
				valorUnitario.setText("");
				validadeProd.setText("");
				marcaProd.setText("");
			

		        while (tabela.getModel().getRowCount() > 0) {  
		               ((DefaultTableModel) tabela.getModel()).setRowCount(0);  
		         }
			}
		});
		btnNewButton_1.setBounds(10, 242, 81, 23);
		contentPane.add(btnNewButton_1);

		quantidadeProduto = new JTextField();
		quantidadeProduto.setBounds(10, 77, 172, 20);
		contentPane.add(quantidadeProduto);
		quantidadeProduto.setColumns(10);

	}
}
