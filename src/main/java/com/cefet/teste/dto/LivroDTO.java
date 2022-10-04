package com.cefet.teste.dto;

import com.cefet.teste.entity.Livro;

public class LivroDTO {
	
	private Long id;
	private String nome;
	private String editora;
	private String autores;
	
	public LivroDTO(Livro livro) {
		this.id = livro.getId();
		this.nome = livro.getNome();
		this.editora = livro.getEditora();
		this.autores = livro.getAutores();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
}
