import java.nio.file.*;
import java.util.Arrays;
import java.util.Objects;
import org.json.*;
import java.util.Comparator;

public class Pokemon {
    private Integer id;
    private String name_english;
    private Double attack;
    private Double defense;
    private Double spAttack;
    private Double spDefense;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_english() {
        return name_english;
    }

    public void setName_english(String name_english) {
        this.name_english = name_english;
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = attack;
    }

    public Double getDefense() {
        return defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Double getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(Double spAttack) {
        this.spAttack = spAttack;
    }

    public Double getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(Double spDefense) {
        this.spDefense = spDefense;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name_english=" + name_english + ", attack=" + attack + ", defense=" + defense + ", spAttack=" + spAttack + ", spDefense=" + spDefense + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Pokemon(Integer id, String name_english, Double attack, Double defense, Double spAttack, Double spDefense) {
        this.id = id;
        this.name_english = name_english;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
    }

    
    
    public static void main(String args[]) throws Exception{
        String content = new String ( Files.readAllBytes( Paths.get("pokedex.json")));
        JSONArray json_arrays = new JSONArray(content); 
        int N = json_arrays.length(); 
        System.out.println("จำนวนข้อมูลโปเกมอน = " + N);
        Pokemon[] pokemon_array = new Pokemon[N];
        for(int i=0; i<N ; i++){
            JSONObject pokemon = json_arrays.getJSONObject(i);
            int pokemon_id = pokemon.getInt("id");
            JSONObject pokemon_name = pokemon.getJSONObject("name");
            JSONArray pokemon_type = pokemon.getJSONArray("type");
            JSONObject pokemon_base = pokemon.getJSONObject("base");
            
            String pokemon_name_english = pokemon_name.getString("english");
            String pokemon_name_japanese = pokemon_name.getString("japanese");
            String pokemon_name_chinese = pokemon_name.getString("chinese");
            String pokemon_name_french = pokemon_name.getString("french");
                    
            int pokemon_type_N = pokemon_type.length();
            String[] type = new String[pokemon_type_N];
            for(int j=0; j<pokemon_type_N;j++){
                type[j] = pokemon_type.getString(j);
            }
        
           double pokemon_base_hp =  pokemon_base.getFloat("HP");
           double pokemon_base_attack = pokemon_base.getFloat("Attack");
           double pokemon_base_defense =  pokemon_base.getFloat("Defense"); 
           double pokemon_base_spAttack = pokemon_base.getInt("Sp. Attack"); 
           double pokemon_base_spDefense = pokemon_base.getInt("Sp. Defense"); 
           double pokemon_base_speed = pokemon_base.getInt("Speed"); 
                  
           
           Pokemon pkm  = new Pokemon(pokemon_id, pokemon_name_english, pokemon_base_attack, pokemon_base_defense, pokemon_base_spAttack, pokemon_base_spDefense);

           pokemon_array[i] = pkm;
           }
        
        PokemonspAttackComparator spAttack_compartor = new PokemonspAttackComparator();
        
        Arrays.sort(pokemon_array,spAttack_compartor);
        
        for(int i=0; i<N ; i++){
            System.out.println(pokemon_array[i]);
        }
    }
}
