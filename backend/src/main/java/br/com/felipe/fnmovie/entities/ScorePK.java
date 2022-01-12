package br.com.felipe.fnmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ScorePK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User usre;
	
	public ScorePK() {
		
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUsre() {
		return usre;
	}

	public void setUsre(User usre) {
		this.usre = usre;
	}
	
	
	
}
