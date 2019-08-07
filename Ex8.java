import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota1 = 0;
		System.out.print("Informe a primeira nota: ");
		nota1 = entrada.nextInt();
		int nota2 = 0;
		System.out.print("Informe a segunda nota: ");
		nota2 = entrada.nextInt();
		
		float nota = (nota1+nota2)/2;
		
		if (nota >= 7) {
			System.out.println("O aluno está aprovado, nota: "+nota);
		} else System.out.println("O aluno está reprovado, nota: "+nota);
		
		entrada.close();
	}

}
