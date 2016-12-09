package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="games")
public class Game {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private Long cost;
	private String platform;
	
	public Game(String name, Long cost, String  platform) {
		super();
		this.name = name;
		this.cost = cost;
		this.platform = platform;
		
	}
	
	public Game() {
		this("",0L,"");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
