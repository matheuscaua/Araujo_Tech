import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Insira um valor entre 1 e 9: ");
		x = input.nextInt();
		System.out.println("==== TABUADA ====");
		for(int i = 0; i <= 9; i++) {
			int r = x * i;
			System.out.println(i+" x "+x+" = "+r);
		}
	}
}
