package com.pokedex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Pokedex {

	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		System.out.println("Attrapez-les tous !");
		
		// On déclare un JSONParser et un Reader pour lire le fichier JSON
		JSONParser parser = new JSONParser();
		Reader reader = new FileReader("assets/pokedex.json");

		Object jsonObj = parser.parse(reader);

		JSONObject jsonObject = (JSONObject) jsonObj;
		
//		System.out.println(jsonObject);

		JSONArray pokemon = (JSONArray) jsonObject.get("pokemon");
//		System.out.println("poke = " + pokemon);
		JSONObject poke1Test = (JSONObject) pokemon.get(0);
		
		System.out.println("poke1 = " + poke1Test);
		String nameTest = (String) poke1Test.get("name");
		System.out.println("nom du poke 1 : " + nameTest);
		
		// Premier test de notre classe Pokemon
		// TODO : mettre le bon id et le bon weight
		Pokemon bulbiTest = new Pokemon(0, nameTest, 0);
		System.out.println(bulbiTest.getName());
		
		// ETAPE 2
		// Combien de pokémon ?
		System.out.println(pokemon.size());
		
		// Poids sup à 10kg
		// Dans un 1er temps, accéder au champs weight de bulbi
		String weightTest = (String) poke1Test.get("weight");
		System.out.println("poids du poke 1 : " + weightTest);
		
		// Ensuite :
		// Boucle sur le JSONArray pokemon
		// TODO : Passer par la classe Pokemon pour la boucle sur les poids :)
		// TODO : A compléter :)
		@SuppressWarnings("unchecked")
		Iterator<JSONObject> it = pokemon.iterator();
		while (it.hasNext()) {
			// Je récupère le poké
			JSONObject poke = it.next();
			// Son nom
			String name = (String) poke.get("name");
			// Son poids en String. Exemple : "6.89 kg"
			String weightRaw = (String) poke.get("weight");
			// Son poids en String mais sans le " kg"
			String weight = weightRaw.replace(" kg", "");
			// Son poids converti en float (nombre à virgule)
			float weightInt = Float.parseFloat(weight);
			// Affichez-les tous !
			//System.out.println(weightInt);
			// Affichez-les pas tous ! Uniquement sup à 10 kg
			if (weightInt > 10.0) {
				System.out.println(name + " qui pèse " + weightInt + " kg");
			}
		}
		reader.close();
	}
	
}
