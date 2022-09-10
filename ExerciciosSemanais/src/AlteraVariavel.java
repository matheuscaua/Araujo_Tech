import java.util.Scanner;

public class AlteraVariavel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome1 = " Mestre do Universo";
		String nome2;
		String x ;
		System.out.println("Informe um nome: ");
		nome2 = input.next();
		
		x = nome1;
		nome1 = nome2;
		nome2 = x;
		
		System.out.printf("Variáveis trocadas ===> Nome1: %s%nNome2: %s%n",nome1, nome2);
		String stringSomada = nome1 + nome2;
		System.out.println("Soma das Strings "+stringSomada);
		}

}
