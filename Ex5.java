import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String sexo;
		System.out.print("Escreva uma letra: ");
		sexo = entrada.nextLine();
		
		switch (sexo) {
		case "a":
			System.out.println("Esta letra é uma Vogal");
		break;	
			
		case "e":
			System.out.println("Esta letra é uma Vogal");
		break;
		case "i":
			System.out.println("Esta letra é uma Vogal");
		break;	
			
		case "o":
			System.out.println("Esta letra é uma Vogal");
		break;
		
		case "u":
			System.out.println("Esta letra é uma Vogal");
		break;
		
		default:
			System.out.println("Esta letra não é uma Vogal");
		}
		
		entrada.close();

	}

}
