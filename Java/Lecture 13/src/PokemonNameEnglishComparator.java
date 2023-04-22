import java.util.Comparator;

public class PokemonNameEnglishComparator implements Comparator<Pokemon>{
    @Override
       public int compare(Pokemon pkm1, Pokemon pkm2) {  
       String pokemon_name_english1 = pkm1.getName_english();
       String pokemon_name_english2 = pkm2.getName_english();
       return pokemon_name_english1.compareTo(pokemon_name_english2);
    }
}
