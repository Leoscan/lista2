import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		if (num > 0){
			System.out.println("Este número é positivo");
		} else if (num < 0){
			System.out.println("Este número é negativo");
		} else System.out.println("Este número é o zero");
		
		entrada.close();
	}
}
