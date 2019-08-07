import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float num = 0;
		System.out.print("Informe o primeiro número: ");
		num = entrada.nextFloat();
		
		float num2 = 0;
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextFloat();
		
		int op = 0;
		System.out.print("Qual operação usar? (1-multiplicação; 2-divisão; 3-Soma; 4-Subtração: ");
		op = entrada.nextInt();
		
		float resultado = 0;
		switch (op) {
		case 1:
			resultado = num * num2;
		break;
		case 2:
			resultado = num / num2;
		break;
		case 3:
			resultado = num + num2;
		break;
		case 4:
			resultado = num - num2;
		break;

		default:
			System.out.println("Operação inválida");
		}
		
		System.out.println("resultado: "+resultado);
		if(resultado % 2 == 0 ) {
			System.out.println("O número é par");
		} else System.out.println("O número é ímpar");
		
		if(resultado >= 0 ) {
			System.out.println("O número é positivo");
		} else System.out.println("O número é negativo");
		
		if(resultado % 1 == 0 ) {
			System.out.println("é um Inteiro");
		} else System.out.println("é um decimal");
		
		entrada.close();
	}

}
