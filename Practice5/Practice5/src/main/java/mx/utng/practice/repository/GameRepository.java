package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Game;

@Repository
public interface GameRepository 
extends JpaRepository<Game, Long>{ 
	@Query ("select game from Game game")
	public List<Game> findAll();
	

}
