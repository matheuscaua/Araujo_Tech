import java.util.Scanner;

public class Tela {
	static Scanner teclado = new Scanner(System.in);
	static double confere() {
		double value = 0;
		boolean t1 = true;
		do {
	        if(teclado.hasNextDouble()){
	        	value = teclado.nextDouble();
	        	t1 = true;
	        }else {
	        	System.out.println("Numero invalido! Tente Novamente");
	        	
	        	t1 = false;
	        	teclado.nextDouble();
	        }
		}while(t1 == false);
		
		return  value;
	}
	
	
public static void main(String[] args) {
		
		int op;
		double v1 = 0,v2 = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			   
			   System.out.println("Digite o primeiro valor");
			   v1 = confere();
			   
			   System.out.println("Digite o segundo valor");
			   v2 = confere();
			   
			   System.out.println("Digite o numero para a operaçao desejada 1( + ) / 2( - ) / 3( / ) / 4( * ) OU Digite 0 para Sair");
			   op = teclado.nextInt();
			   switch(op) {
			   
			   case 1:
				   System.out.println("Adição");
				   Operacao conta = new Operacao();
					conta.exibirSoma(v1, v2);
				   
				   break;
				   
			   case 2:
				      
				   System.out.println("Subtraçao");
				   Operacao conta1 = new Operacao();
					conta1.exibirSub(v1, v2);
				   
				   break;
			   case 3:
				   System.out.println("Divisao");
				   Operacao conta3 = new Operacao();
					conta3.exibirDiv(v1, v2);
				   
			   case 4: 
				   System.out.println("Multiplicaçao");
				   Operacao conta4 = new Operacao();
					conta4.exibirMult(v1, v2);
				  
				   
				   break;
				   
				 default:
				 System.out.println("SAINDO");
			   }
			   
			   
			   
		   } while (op != 0);
		
	}
}
