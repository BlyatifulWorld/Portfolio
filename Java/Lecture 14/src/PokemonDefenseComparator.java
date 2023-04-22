import java.util.Comparator;
public class PokemonDefenseComparator implements Comparator<Pokemon>{
    @Override
     public int compare(Pokemon pkm1, Pokemon pkm2) {
        Double pokemon_defense1 = pkm1.getDefense();
        Double pokemon_defense2 = pkm2.getDefense();
        return pokemon_defense1.compareTo(pokemon_defense2);
    }
}
