package exClasse;

public class TestePessoa {
	public static void imprimeP(Pessoa x) {
		String a = x.nome;
		int b = x.idade;
		int i = x.tel.ddd;
		String n = x.tel.numero;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(i+n);
		
	}
	
	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.nome = "João";
		a.idade = 19;
		a.tel= new Telefone();
		a.tel.ddd = 19;
		a.tel.numero="21123134";
		
		Pessoa b = new Pessoa();
		b.nome = "Tigao";
		b.idade = 19;
		b.tel= new Telefone();
		b.tel.ddd = 19;
		b.tel.numero="21123134";
		
		Pessoa c = new Pessoa();
		c.nome = "Marlu";
		c.idade = 19;
		c.tel= new Telefone();
		c.tel.ddd = 19;
		c.tel.numero="21123134";
		
		imprimeP(a);
	
		
	}
}
