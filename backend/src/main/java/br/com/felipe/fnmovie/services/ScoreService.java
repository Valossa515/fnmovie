package br.com.felipe.fnmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.felipe.fnmovie.DTO.MovieDTO;
import br.com.felipe.fnmovie.DTO.ScoreDTO;
import br.com.felipe.fnmovie.entities.Movie;
import br.com.felipe.fnmovie.entities.Score;
import br.com.felipe.fnmovie.entities.User;
import br.com.felipe.fnmovie.repositories.MovieRespository;
import br.com.felipe.fnmovie.repositories.ScoreRepository;
import br.com.felipe.fnmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRespository movieRepository;
	
	@Autowired
	private UserRepository userRepositor;
	@Autowired
	private ScoreRepository scoreRepositor;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		User user = userRepositor.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepositor.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		Score score = new Score();
		
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		score = scoreRepositor.saveAndFlush(score);
		double sum = 0.0;
		for(Score s: movie.getScores()) {
			sum = sum + s.getValue();
		}
		double avg = sum/movie.getScores().size();
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
	@Transactional(readOnly = true)
	public Page<ScoreDTO> finAll(Pageable pageable){
		Page<Score>result = scoreRepositor.findAll(pageable);
		Page<ScoreDTO> page = result.map(x -> new ScoreDTO(x));
		return page;
	}
	
}
