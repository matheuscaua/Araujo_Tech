import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class TelaCalculadora extends JFrame {

    private JButton numero1;
    private JButton numero2;
    private JButton numero3;
    private JButton numero4;
    private JButton numero5;
    private JButton numero6;
    private JButton numero7;
    private JButton numero8;
    private JButton numero9;
    private JButton numero0;
    private JButton numeroP;
    
    private JButton dividir;
    private JButton multiplicar;
    private JButton subtrair;
    private JButton somar;
    private JButton igual;
    private JTextField display;
    
    private double leitura;
    private double memoria;
    private char operacao;
    private JButton btnClear;

    public TelaCalculadora() {
    	getContentPane().setBackground(new Color(192, 192, 192));
        this.setTitle("Calculadora Matheuzin");
        this.setBounds(500, 100, 292, 450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        leitura = 0;
        memoria = 0;

        display = new JTextField();
        display.setBackground(new Color(192, 192, 192));
        display.setBounds(0, 0, 275, 65);
        getContentPane().add(display);
        
        //FAIXA 01
        numero7 = new JButton();
        numero7.setBackground(new Color(128, 0, 255));
        numero7.setText("7");
        numero7.setBounds(0, 76, 65, 52);
        getContentPane().add(numero7);
        
        numero4 = new JButton();
        numero4.setBackground(new Color(128, 0, 255));
        numero4.setText("4");
        numero4.setBounds(0, 139, 65, 52);
        getContentPane().add(numero4);
        
        numero1 = new JButton();
        numero1.setBackground(new Color(128, 0, 255));
        numero1.setText("1");
        numero1.setBounds(0, 202, 65, 52);
        getContentPane().add(numero1);
        
        numero0 = new JButton();
        numero0.setBackground(new Color(128, 0, 255));
        numero0.setText("0");
        numero0.setBounds(0, 265, 65, 52);
        getContentPane().add(numero0);
        
        //FAIXA 02
        numero8 = new JButton();
        numero8.setBackground(new Color(128, 0, 255));
        numero8.setText("8");
        numero8.setBounds(70, 76, 65, 52);
        getContentPane().add(numero8);
        
        numero5 = new JButton();
        numero5.setBackground(new Color(128, 0, 255));
        numero5.setText("5");
        numero5.setBounds(70, 139, 65, 52);
        getContentPane().add(numero5);
        
        numero2 = new JButton();
        numero2.setBackground(new Color(128, 0, 255));
        numero2.setText("2");
        numero2.setBounds(70, 202, 65, 52);
        getContentPane().add(numero2);
        
        numeroP = new JButton();
        numeroP.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		leitura = Double.parseDouble(display.getText() + ".");
        	}
        });
        numeroP.setBackground(new Color(128, 0, 255));
        numeroP.setText(".");
        numeroP.setBounds(70, 265, 65, 52);
        getContentPane().add(numeroP);
        
        //FAIXA 03
        numero9 = new JButton();
        numero9.setBackground(new Color(128, 0, 255));
        numero9.setText("9");
        numero9.setBounds(140, 76, 65, 52);
        getContentPane().add(numero9);
        
        numero6 = new JButton();
        numero6.setBackground(new Color(128, 0, 255));
        numero6.setText("6");
        numero6.setBounds(140, 139, 65, 52);
        getContentPane().add(numero6);
        
        numero3 = new JButton();
        numero3.setBackground(new Color(128, 0, 255));
        numero3.setText("3");
        numero3.setBounds(140, 202, 65, 52);
        getContentPane().add(numero3);
        
        somar = new JButton();
        somar.setBackground(new Color(128, 0, 255));
        somar.setText("+");
        somar.setBounds(140, 265, 65, 52);
        getContentPane().add(somar);
        
        //FAIXA 04
        dividir = new JButton();
        dividir.setBackground(new Color(128, 0, 255));
        dividir.setText("/");
        dividir.setBounds(210, 76, 65, 52);
        getContentPane().add(dividir);
        
        multiplicar = new JButton();
        multiplicar.setBackground(new Color(128, 0, 255));
        multiplicar.setText("X");
        multiplicar.setBounds(210, 139, 65, 52);
        getContentPane().add(multiplicar);
        
        subtrair = new JButton();
        subtrair.setBackground(new Color(128, 0, 255));
        subtrair.setText("-");
        subtrair.setBounds(210, 202, 65, 52);
        getContentPane().add(subtrair);
        
        igual = new JButton();
        igual.setBackground(new Color(128, 0, 255));
        igual.setText("=");
        igual.setBounds(210, 265, 65, 52);
        getContentPane().add(igual);
        
        btnClear = new JButton("C");
        btnClear.setBackground(new Color(128, 0, 255));
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		memoria = 0;
        		display.setText("");
        	}
        });
        btnClear.setBounds(0, 331, 65, 52);
        getContentPane().add(btnClear);

        numero1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 1;
                display.setText(display.getText() + "1");
            }
        });

        numero2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 2;
                display.setText(display.getText() + "2");
            }
        });
        
        numero3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                display.setText(display.getText() + "3");
            }
        });
        
        numero4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 4;
                display.setText(display.getText() + "4");
            }
        });
        
        numero5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 5;
                display.setText(display.getText() + "5");
            }
        });
        
        numero6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 6;
                display.setText(display.getText() + "6");
            }
        });
        
        numero7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 7;
                display.setText(display.getText() + "7");
            }
        });
        
        numero8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 8;
                display.setText(display.getText() + "8");
            }
        });
        
        numero9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 3;
                display.setText(display.getText() + "9");
            }
        });
        
        numero0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leitura *= 10;
                leitura += 0;
                display.setText(display.getText() + "0");
            }
        });

        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '+';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " + ");
            }
        });
        
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '-';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " - ");
            }
        });
        
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = 'X';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " X ");
            }
        });
        
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                operacao = '/';
                memoria += leitura;
                leitura = 0;
                display.setText(memoria + " / ");
            }
        });

        igual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch (operacao) {
                    case '.': {
                        memoria = memoria + '.';
                        break;
                    }
                    case '+': {
                        memoria += leitura;
                        break;
                    }
                    
                    case '-': {
                        memoria -= leitura;
                        break;
                    }
                    
                    case 'X': {
                        memoria *= leitura;
                        break;
                    }
                    
                    case '/': {
                        memoria /= leitura;
                        break;
                    }
                    
                }
                leitura = 0;
                display.setText("" + memoria);
                
            }
        });
    }

    public static void main(String[] args) {
        TelaCalculadora exemplo = new TelaCalculadora();
        exemplo.setVisible(true);
    }
} // classe