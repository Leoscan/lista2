import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float horas = 0;
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		horas = entrada.nextFloat();
		
		float vlHoras = 0;
		System.out.print("Informe o valor de sua hora: ");
		vlHoras = entrada.nextFloat();
		
		float sBruto = vlHoras*horas; 
		System.out.println("Salário bruto ("+vlHoras+"*"+horas+") : R$"+sBruto);
		
		float vlIR = 0;
		if (sBruto <= 900) {
			System.out.println("Isento de IR");
		} else if (sBruto > 900 && sBruto <= 1500){
			vlIR = (sBruto/100)*5;
			System.out.println("(-) IR (5%)   : R$"+vlIR);
		} else if (sBruto > 1500 && sBruto <= 2500){
			vlIR = (sBruto/100)*10;
			System.out.println("(-) IR (10%)   : R$"+vlIR);
		} else if (sBruto > 2500){
			vlIR = (sBruto/100)*20;
			System.out.println("(-) IR (20%)   : R$"+vlIR);
		}
		
		float inss = (sBruto/100)*10;
		System.out.println("(-) INSS ( 10%)   : R$"+inss);
	
		float fgts = (sBruto/100)*11;
		System.out.println("FGTS (11%)   : R$"+fgts);
		
		float descontos = inss+vlIR;
		System.out.println("Total de descontos   : R$"+descontos);
		
		float sLiq = sBruto - descontos;
		System.out.println("Salário Liquido   : R$"+sLiq);
		
		entrada.close();
	}

}
