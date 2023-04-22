import java.nio.file.*;
import java.util.Arrays;
import org.json.*;

public class PokemonTest {
    public static void main(String args[]) throws Exception{
        String content = new String ( Files.readAllBytes( Paths.get("pokedex.json")));
        JSONArray json_arrays = new JSONArray(content);
        int N = json_arrays.length(); 
        System.out.println("จำนวนข้อมูลโปเกมอน = " + N);
        Pokemon[] pokemon_array = new Pokemon[N];
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
            
           double   pokemon_base_hp =  pokemon_base.getInt("HP");
           double   pokemon_base_attack = pokemon_base.getInt("Attack");
           double   pokemon_base_defense =  pokemon_base.getInt("Defense"); 
           double   pokemon_base_spAttack = pokemon_base.getInt("Sp. Attack"); 
           double   pokemon_base_spDefense = pokemon_base.getInt("Sp. Defense"); 
           double   pokemon_base_speed = pokemon_base.getInt("Speed"); 
           
           //แก้แค่ที่บรรทัดนี้ **** สร้างออบเจคโปเกมอน
           Pokemon pkm = new Pokemon(pokemond_id 
                   ,pokemon_name_english
                   ,pokemon_name_chinese
                   ,pokemon_base_hp
                   ,pokemon_base_attack 
                   ,pokemon_base_defense
                   ,pokemon_base_speed);

           pokemon_array[i] = pkm;
        }

        PokemonDefenseComparator defense_compartor 
                = new PokemonDefenseComparator();
        
        Arrays.sort(pokemon_array,defense_compartor);
        
        for(int i=0; i<N ; i++){
            System.out.println(pokemon_array[i]);
        }
    }

}
