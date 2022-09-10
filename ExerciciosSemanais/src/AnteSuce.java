import java.util.Scanner;

public class AnteSuce {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int x = input.nextInt();
		
		int antecessor = x - 1;
		int sucessor = x + 1;
		
		System.out.printf("Antecessor: %d%n Número: %d%nSucessor: %d", antecessor, x , sucessor);
	}

}
