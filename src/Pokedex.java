
public class Pokedex extends PokemonManager
{

    public Pokedex()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String[] pokemonInfo(Pokemon pokemon)
    {
        return new String[] {pokemon.getName(), "" + pokemon.getHealth(), pokemon.getType()};
    }

}
