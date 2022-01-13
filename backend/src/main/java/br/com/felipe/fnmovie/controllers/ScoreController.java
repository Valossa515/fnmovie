package br.com.felipe.fnmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.fnmovie.DTO.MovieDTO;
import br.com.felipe.fnmovie.DTO.ScoreDTO;
import br.com.felipe.fnmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO movieDTO = scoreService.saveScore(dto);
		return movieDTO;
	}
	@GetMapping
	public Page<ScoreDTO> findAll(Pageable pageable){
		return scoreService.finAll(pageable);
	}
}
