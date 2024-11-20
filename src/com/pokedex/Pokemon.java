package com.pokedex;

// TODO : ajouter tous les attributs pertinents et méthodes associées
public class Pokemon {
	// Attributs
	private int id;
	private String name;
	private float weight;
	
	//Constructeur
	public Pokemon(int id, String name, float weight) {
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	// Getters/Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
