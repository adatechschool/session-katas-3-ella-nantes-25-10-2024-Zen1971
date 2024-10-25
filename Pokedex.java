import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Pokemon{
	public static void main(string[] args) throws Exception{
		//je parse le fichier pokedex.json
		object pokemon = new JSONParser().parse(new FileReader("pokedex.json"));
		//convertion d'un objet en objet type JSONObject
		JSONObject poke = (JSONObject) pokemon;
// 1. compter le nombre de Pokémon
		system.out.printIn("Le nombre de Pokémon est de : " + countPokemon(poke));
	}
}
	
