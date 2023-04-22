import java.util.Comparator;

public class PokemonSpAttackComparator implements Comparator<Pokemon>{
    @Override

    public int compare(Pokemon pkm1, Pokemon pkm2) {
        Double pokemon_attack1 = pkm1.getAttack();
        Double pokemon_attack2 = pkm2.getAttack();
        return pokemon_attack1.compareTo(pokemon_attack2);
    }
}
