package model;

import java.util.Objects;

public class Usuario {
	private int codigo;
	private String login;
	private String senha;
	private String nome;
	
	
	public Usuario() {
		
	}

	public Usuario(int codigo, String login, String senha, String nome) {
		
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public String getNome() {
		return nome;
	}
	

	public void cadastrar(String login, String senha, String nome) {
		this.login=login;
		this.senha=senha;
		this.nome=nome;
	}
	public void logar(String login, String senha) {
		if(this.login==login && this.senha==senha) {
			System.out.print("O usuário está logado");
			System.out.printf("Bem vindo"+this.nome);
		}
	}
}
