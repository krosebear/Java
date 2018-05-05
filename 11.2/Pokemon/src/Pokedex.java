
public class Pokedex extends AbstractClass {
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: "+ pokemon.getName() + " Health: "+ pokemon.getHealth() + " Type: "+ pokemon.getType();
	}
}
