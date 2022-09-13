import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número 01: ");
		int x = input.nextInt();
		System.out.println("Número 02: ");
		int y = input.nextInt();
		int mult = 0;
		
		for(int i = 0; i < y; i++) {
			mult = mult + x;
			System.out.printf("%d + ",x);
		}
		System.out.println("=  "+mult);
	}
	

}
