import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe a primeira idade: ");
		num = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Informe a segunda idade: ");
		num2 = entrada.nextInt();
		
		int num3 = 0;
		System.out.print("Informe a terceira idade: ");
		num3 = entrada.nextInt();

		int media = (num+num2+num3)/3;
		
		if(media < 25) System.out.println("Turma jovem");
		if(media >= 25 && media <= 40) System.out.println("Turma Adulta");
		if(media > 40) System.out.println("Turma Idosa");
		
		entrada.close();
	}

}
