package br.com.felipe.fnmovie.DTO;

import br.com.felipe.fnmovie.entities.Score;

public class ScoreDTO {
	private Long movieId;
	private String email;
	public Double score;

	public ScoreDTO() {

	}

	public ScoreDTO(Long movieId, String email, Double score) {
		super();
		this.movieId = movieId;
		this.email = email;
		this.score = score;
	}
	
	public ScoreDTO(Score s) {
		movieId = s.getId().getMovie().getId();
		email = s.getId().getUsre().getEmail();
		score = s.getId().getMovie().getScore();
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
