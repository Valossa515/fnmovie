package br.com.felipe.fnmovie.DTO;

public class ScoreDTO {
	private Long movieId;
	private String email;
	public Double score;
	
	public ScoreDTO() {
		
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
