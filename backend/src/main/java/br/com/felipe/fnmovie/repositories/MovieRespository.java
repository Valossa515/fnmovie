package br.com.felipe.fnmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.fnmovie.entities.Movie;


public interface MovieRespository extends JpaRepository<Movie, Long>{
	
}
