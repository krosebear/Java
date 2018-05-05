
public class PokemonTest {
	public static void main(String[] args) {
		Pokemon Bulbasaur = new Pokemon("Bulbasaur", 100, "Water");
		
		Pokedex pd = new Pokedex();
		Pokemon charmander = pd.createPokemon("Charmander", 100, "Fire");
		System.out.println(pd.pokemonInfo(charmander));

	}
}
