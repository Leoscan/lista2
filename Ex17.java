import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota1 = 0;
		System.out.print("Informe a primeira nota: ");
		nota1 = entrada.nextInt();
		int nota2 = 0;
		System.out.print("Informe a segunda nota: ");
		nota2 = entrada.nextInt();
		
		float nota = (nota1+nota2)/2;
		String conceito = null;
		
		if (nota >= 0 && nota <= 4){
			conceito = "E";
		} else if (nota > 4 && nota <= 6) {
			conceito = "D";
		} else if (nota > 6 && nota <= 7.5) {
			conceito = "C";
		} else if (nota > 7.5 && nota <= 9) {
			conceito = "B";
		} else if (nota > 9 && nota <= 10) {
			conceito = "A";
		}
		
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Média: "+nota);
		System.out.println("Conceito: "+conceito);
		
		if (conceito.equals("A")) {
			System.out.println("Aprovado");
		} else if (conceito.equals("B")) {
			System.out.println("Aprovado");
		} else if (conceito.equals("C")) {
			System.out.println("Aprovado");
		} else System.out.println("Reprovado");

		entrada.close();
	}

}
