
public abstract class AbstractClass implements PokemonInterface{
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	@Override
	public void attack(Pokemon pokemon) {
		int health = pokemon.getHealth() - 10;
		pokemon.setHealth(health);
		System.out.println("current health: " + health);
	}
	
}

