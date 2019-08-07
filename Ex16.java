import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
				Scanner entrada = new Scanner(System.in);
				
				int nota1 = 0;
				System.out.print("Informe a primeira nota: ");
				nota1 = entrada.nextInt();
				int nota2 = 0;
				System.out.print("Informe a segunda nota: ");
				nota2 = entrada.nextInt();
				
				float nota = (nota1+nota2)/2;
				
				if (nota >= 0 && nota <= 3){
					System.out.println("Reprovado");
				} else if (nota > 3 && nota < 7) {
					System.out.println("Em Exame");
				} else if (nota > 7 && nota <= 10) {
					System.out.println("Aprovado");
				}
				
				entrada.close();
			}

	}
