
public interface PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type);
	public void attack(Pokemon pokemon);
	public String pokemonInfo(Pokemon pokemon);
}
