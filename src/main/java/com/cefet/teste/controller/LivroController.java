package com.cefet.teste.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.cefet.teste.dto.LivroDTO;
import com.cefet.teste.entity.Livro;
import com.cefet.teste.form.LivroForm;
import com.cefet.teste.repository.LivroRepository;

@RestController
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;
	/*@GetMapping("/hello")
	@ResponseBody
	public String hello()
	{
		return "Oi, turma!";
	}*/
	
	@GetMapping("/livro")
	public List<Livro> getAllLivros()
	{
		return livroRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<LivroDTO> saveLivro(@RequestBody LivroForm form,
			UriComponentsBuilder builder)
	{
		//converter de LivroForm para Livro
		Livro livro = form.converter();
		
		//salvar o livro no BD
		livroRepository.save(livro);
		UriComponents uriComponents = builder.path("/livro/{id}").buildAndExpand(livro.getId());
		return ResponseEntity.created(uriComponents.toUri()).body(new LivroDTO(livro));
	}
	

}
