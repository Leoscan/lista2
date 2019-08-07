import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("O número é par");
		} else System.out.println("O número é ímpar");
		
		entrada.close();
	}

}
