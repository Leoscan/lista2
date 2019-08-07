import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Informe a primeira nota: ");
		num = entrada.nextInt();
		
		int num2 = 0;
		System.out.print("Informe a segunda nota: ");
		num2 = entrada.nextInt();
		
		int num3 = 0;
		System.out.print("Informe a terceira nota: ");
		num3 = entrada.nextInt();

		int media = (num+num2+num3)/3;
		
		if(media >= 7 && media < 10) System.out.println("Aprovado, com média: "+media);
		if(media < 7) System.out.println("Reprovado, com média:"+media);
		if(media == 10) System.out.println("Aprovado com Distinção, média: "+media);
		
		entrada.close();

	}

}
