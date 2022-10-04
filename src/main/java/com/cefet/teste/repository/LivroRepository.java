package com.cefet.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cefet.teste.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
