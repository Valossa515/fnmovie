package br.com.felipe.fnmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.fnmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
