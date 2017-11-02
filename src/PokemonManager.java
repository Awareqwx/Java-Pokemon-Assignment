
public abstract class PokemonManager implements PokemonUtil
{

    @Override
    public Pokemon createPokemon(String name, int health, String type)
    {
        return new Pokemon(name, type, health);
    }

    @Override
    public void attackPokemon(Pokemon pokemon)
    {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }

}
