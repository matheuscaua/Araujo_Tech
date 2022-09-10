import java.util.Scanner;

public class ExibeNome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = input.next();
		
		
		System.out.println("Olá "+nome);
	}

}
