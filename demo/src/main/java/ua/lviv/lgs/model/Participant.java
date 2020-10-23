package ua.lviv.lgs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participants")
public class Participant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	String email;
	
	Level level;
	
	String primarySkill;

	public Participant() {}

	public Participant(String name, String email, Level level, String primarySkill) {
		this.name = name;
		this.email = email;
		this.level = level;
		this.primarySkill = primarySkill;
	}

	public Participant(Long id, String name, String email, Level level, String primarySkill) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.level = level;
		this.primarySkill = primarySkill;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", email=" + email + ", level=" + level + ", primarySkill="
				+ primarySkill + "]";
	}
	
}
