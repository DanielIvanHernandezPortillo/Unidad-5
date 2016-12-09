package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.Game;
import mx.utng.practice.repository.GameRepository;

@Named
@ViewScoped
public class GameController {
	
	
	@Autowired
	private GameRepository gameRepository;
	
	private Game game = new Game();
	private List<Game> games;

	private boolean editMode = false;

	@PostConstruct
	public void init(){
		setGames(gameRepository.findAll());
	}
	
	public void save(){
		gameRepository.save(game);
		if(!editMode){
			getGames().add(game);
		}
		game = new Game();
		setEditMode(false);
	}
	
	
	public void delete(Game game){
		gameRepository.delete(game);
		games.remove(game);
	}
	
	public Game getGame(){
		return game;
	}
	
	public void setGame(Game game){
		this.game = game;
	}
	
	public void update(Game game){
		setGame(game);
		setEditMode(true);
	}
	
	public void cancel(){
		game = new Game();
		setEditMode(false);
	}
	
	public List<Game> getGames(){
		return games;
	}
	
	public void setGames(List<Game> games){
		this.games=games;
	}
	
	public boolean isEditMode(){
		return editMode;
	}
	
	public void setEditMode(boolean editMode){
		this.editMode = editMode;
	}

}
