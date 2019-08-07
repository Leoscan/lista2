import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe um ano: ");
		num = entrada.nextInt();
		
		int div = 0;
		div = num % 4;
		
		
		if (div == 0){
			System.out.println("Este ano é bissexto");
		} else System.out.println("Este ano não é bissexto");
		
		entrada.close();
	}

}
