import java.nio.file.*;
import org.json.*;

public class PokemonTest {
     public static void main(String args[]) throws Exception{
        //อ่านไฟล์ JSON ในรูปแบบข้อความ
        String content = new String ( Files.readAllBytes( Paths.get("pokedex.json")));
        //แปลงข้อความเป็น JSON ออบเจค
        JSONArray json_arrays = new JSONArray(content); 
        int N = json_arrays.length(); 
        System.out.println("จำนวนข้อมูลโปเกมอน = " + N);
        Pokemon[] pokemon_array = new Pokemon[N];
        for(int i=0; i<N ; i++){
            //อ่านค่าโปเกมอนทีละตัว
            JSONObject pokemon = json_arrays.getJSONObject(i);
            //แกะในข้อมูลใน JSON เรียนครั้งหน้า
            int pokemon_id = pokemon.getInt("id");
            JSONObject pokemon_name = pokemon.getJSONObject("name");
            JSONArray pokemon_type = pokemon.getJSONArray("type");
            JSONObject pokemon_base = pokemon.getJSONObject("base");
            
            String pokemon_name_english = pokemon_name.getString("english");
            String pokemon_name_japanese = pokemon_name.getString("japanese");
            String pokemon_name_chinese = pokemon_name.getString("chinese");
            String pokemon_name_french = pokemon_name.getString("french");
                    
            int pokemon_type_N = pokemon_type.length();
            //สร้าง Array ของ String
            String[] type = new String[pokemon_type_N];
            //อ่านค่าที่ละตัวใน JSONArray  และเก็บในอะเรย์ของ String
            for(int j=0; j<pokemon_type_N;j++){
                type[j] = pokemon_type.getString(j);
            }
        
           double pokemon_base_hp =  pokemon_base.getFloat("HP");
           double pokemon_base_attack = pokemon_base.getFloat("Attack");
           double pokemon_base_defense =  pokemon_base.getFloat("Defense"); 
           double pokemon_base_spAttack = pokemon_base.getInt("Sp. Attack"); 
           double pokemon_base_spDefense = pokemon_base.getInt("Sp. Defense"); 
           double pokemon_base_speed = pokemon_base.getInt("Speed"); 
                  
           //สร้าง ออบเจคโปเกมอน และใส่ไปในอะเรย์
           Pokemon pkm  = new Pokemon(pokemon_name_english,pokemon_name_japanese
                   ,pokemon_base_hp,pokemon_base_attack,pokemon_base_defense  ); //เปลี่ยนที่บรรทัดนี้บรรทัดเดียว
           
           //กำหนดให้ อะเรย์ตำแหน่งที่ i เป็น ค่าโปเกมอนที่เพิ่งสร้างขึ้น
           pokemon_array[i] = pkm;
           
        }
        //ทดลองแสดงค่าโปเกมอนในอะเรย์
        for(int i=0; i<N ; i++){
            System.out.println(pokemon_array[i]);
        }
    }
}
