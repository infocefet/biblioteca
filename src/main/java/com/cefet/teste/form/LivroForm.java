package com.cefet.teste.form;

import com.cefet.teste.entity.Livro;

public class LivroForm {
	
	private String nome;
	private String editora;
	private String autores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	public Livro converter()
	{
		Livro livro = new Livro();
		livro.setNome(nome);
		livro.setEditora(editora);
		livro.setAutores(autores);
		return livro;
	}

}
