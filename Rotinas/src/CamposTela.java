import java.util.Scanner;

public class CamposTela {

	public static void main(String[] args) {
		//Declarando variáveis
		String nome;
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nome: ");
		nome = teclado.next();
		System.out.println("Idade: ");
		idade = teclado.nextInt();
		
		
		System.out.printf("Seu nome é: %s e você tem %d anos!",nome, idade);
	}

}
