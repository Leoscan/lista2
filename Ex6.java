import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		int div = num%4; 
		
		if (div == 0) {
			System.out.println("Este numero é par, transformando em impar");
			num = num + 1;
			System.out.println(num);
		}
		if (div != 0) {
			System.out.println("Este numero é impar, transformando em par");
			num = num + 1;
			System.out.println(num);
		}
		
		entrada.close();

	}

}
