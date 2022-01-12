package br.com.felipe.fnmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.fnmovie.entities.Score;
import br.com.felipe.fnmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
