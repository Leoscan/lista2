import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe o primeiro número: ");
		num = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();
		
		if(num > num2) {
			System.out.println("O maior número informado foi: "+num);
		} else System.out.println("O maior número informado foi: "+num2);
		
		entrada.close();
	}

}
