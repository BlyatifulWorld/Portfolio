import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class PokemonService {
    private ArrayList<Pokemon> pokemon_list;
    public PokemonService() throws Exception{
        pokemon_list = new ArrayList<Pokemon>();
        String content = new String ( Files.readAllBytes( Paths.get("pokedex.json")));
        JSONArray json_arrays = new JSONArray(content);
        int N = json_arrays.length(); 
        for(int i=0; i<N ; i++){
            JSONObject pokemon = json_arrays.getJSONObject(i);
            int pokemond_id = pokemon.getInt("id");
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
            
           double pokemon_base_hp =  pokemon_base.getInt("HP");
           double pokemon_base_attack = pokemon_base.getInt("Attack");
           double pokemon_base_defense =  pokemon_base.getInt("Defense"); 
           double pokemon_base_spAttack = pokemon_base.getInt("Sp. Attack"); 
           double pokemon_base_spDefense = pokemon_base.getInt("Sp. Defense"); 
           double pokemon_base_speed = pokemon_base.getInt("Speed"); 
           
           Pokemon pkm = new Pokemon(pokemond_id 
                   ,pokemon_name_english
                   ,pokemon_name_chinese
                   ,pokemon_base_hp
                   ,pokemon_base_attack 
                   ,pokemon_base_defense
                   ,pokemon_base_speed);
                 
           pokemon_list.add(pkm);
        }
    }
    
    public ArrayList<Pokemon> sortByNameEnglish(){
        PokemonNameEnglishComparator english_compartor 
                = new PokemonNameEnglishComparator();
        Collections.sort(pokemon_list,english_compartor );
        return pokemon_list;
    }
    public ArrayList<Pokemon> sortByAttack(){
        PokemonAttackComparator attack_compartor
                = new PokemonAttackComparator();
        Collections.sort(pokemon_list, attack_compartor);
        return pokemon_list;
    }
    public ArrayList<Pokemon> sortByDefense() {
        PokemonDefenseComparator defense_compartor
                = new PokemonDefenseComparator();
        Collections.sort(pokemon_list, defense_compartor);
        return pokemon_list;
    }
    
    public Pokemon searchById(int id){
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);
            if(pkm.getId() == id){
                return pkm;
            }
        }
        return null;
    }
    public ArrayList<Pokemon> searchByNameEnglish(String name){
        ArrayList<Pokemon> results = new ArrayList<Pokemon>();
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);
            if(pkm.getName_english().contains(name)){
                results.add(pkm);
            }
        }
        return results;
    }
    public ArrayList<Pokemon> searchByAttack(double min_attack, double max_attack){
        ArrayList<Pokemon> results = new ArrayList<Pokemon>();
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);
            if(pkm.getAttack() >=min_attack && pkm.getAttack() <= max_attack){
                results.add(pkm);
            }
        }
        return results;
    };
    public ArrayList<Pokemon> searchByDefense(double min_defense, double max_defense){
        ArrayList<Pokemon> results = new ArrayList<Pokemon>();
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);
            if(pkm.getDefense() >=min_defense && pkm.getDefense() <= max_defense){
                results.add(pkm);
            }
        }
        return results;
    };
}
