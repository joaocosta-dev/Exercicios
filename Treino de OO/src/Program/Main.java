package Program;

import java.util.Scanner;

import model.Aluno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			Aluno aluno1 = new Aluno();
			System.out.print("Deseja cadastrar usuario");
			String resposta=sc.nextLine();
			
			if(resposta.toLowerCase()=="sim") {
				System.out.print("Digite o login");
				String login=sc.nextLine();
				System.out.print("Digite a senha");
				sc.nextLine();
				String senha=sc.nextLine();
				System.out.print("Digite o nome");
				sc.nextLine();
				
				String nome = sc.nextLine();
				aluno1.cadastrar(login,senha,nome);
			
			
			System.out.print("Deseja logar?");
			resposta=sc.nextLine();
			
			aluno1.logar(login, senha);
			
			
	}

}}
