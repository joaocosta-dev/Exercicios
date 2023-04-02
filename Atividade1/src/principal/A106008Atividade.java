package principal;

import java.util.Scanner;

public class A106008Atividade {

	public static void main(String[] args) {
		 String tipo="",registro="";
		 float comprimento=0,envergadura=0;
		 String valida="";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Caso deseje sair, digite F");
		
		while( valida.toLowerCase().equals("f")==false) {
			
			System.out.println("Digite o Registro da aeronave");
			 registro=sc.next();
			 valida=registro;
			 System.out.println("Digite a Envergadura da aeronave");
			 envergadura= sc.nextInt();
			 
			 System.out.println("Digite o Comprimento da aeronave");
			 comprimento= sc.nextInt();
			 
			 System.out.println("Digite o Tipo da aeronave");
			 tipo=sc.next();
			 
			 System.out.println("Caso deseje sair, digite F");
			 valida=sc.next();
		}
		A106008Aeronave aeronave = new A106008Aeronave(tipo,registro,comprimento,envergadura);
		
		System.out.println(aeronave.retornarComprimento());
		System.out.println(aeronave.retornarEnvergadura());
		System.out.println(aeronave.retornarRegistroTipo());
		
		
		sc.close();

	}

}
