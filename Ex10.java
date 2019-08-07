import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		int num2 = 0;
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();
		int num3 = 0;
		System.out.print("Informe terceiro número: ");
		num3 = entrada.nextInt();
		int num = 0;
		
		if(num3 > num2) {
			num = num2;
			num2 = num3;
			num3 = num;
		}
		if(num2 > num1) {
			num = num1;
			num1 = num2;
			num2 = num;
		}
		if(num3 > num2) {
			num = num2;
			num2 = num3;
			num3 = num;
		}
		System.out.println("O maior número é: "+num1);
		System.out.println("O menor número é: "+num3);
		
		entrada.close();
	}

}
