import java.util.Comparator;

public class PokemonspAttackComparator implements Comparator<Pokemon>{

    @Override
    public int compare(Pokemon pkm1, Pokemon pkm2) {
        Double pokemon_spattack1 = pkm1.getSpAttack();
        Double pokemon_spattack2 = pkm2.getSpAttack();
        return pokemon_spattack1.compareTo(pokemon_spattack2);
    }
    
}
  
