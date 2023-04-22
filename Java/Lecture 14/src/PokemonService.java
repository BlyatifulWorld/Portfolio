import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

//สร้าง class PokemonService : เพื่อสะดวกต่อการจัดการข้อมูล
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
           double  pokemon_base_attack = pokemon_base.getInt("Attack");
           double   pokemon_base_defense =  pokemon_base.getInt("Defense"); 
           double   pokemon_base_spAttack = pokemon_base.getInt("Sp. Attack"); 
           double   pokemon_base_spDefense = pokemon_base.getInt("Sp. Defense"); 
           double    pokemon_base_speed = pokemon_base.getInt("Speed"); 
           
           Pokemon pkm = new Pokemon(pokemond_id 
                   ,pokemon_name_english
                   ,pokemon_name_chinese
                   ,pokemon_base_hp
                   , pokemon_base_attack 
                   , pokemon_base_defense
                   , pokemon_base_speed);
                 
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
    public ArrayList<Pokemon> sortByDefense(){
        PokemonDefenseComparator defense_compartor
                = new PokemonDefenseComparator();
        Collections.sort(pokemon_list, defense_compartor);
        return pokemon_list;
    
    }
    
    //ตัวอย่างการค้นหาข้อมูลใน list โดยผลลัพธ์ต้องการแค่ตัวเดียว เงื่อนไขการค้นหาเป็นแบบ exact match
    public Pokemon searchById(int id){
        //หลักการค้นหา เชคทีละตัวตั้งแต่ตัวแรกถึงตัวสุดท้าย
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);//อ่านค่าโปเกมอนทีละตัวใน loop
            //ถ้า id ที่ user กรอกตรงกับโปเกมอนปัจจุบัน ให้ทำการคืนค่าโปเกมอนจากเมธอด
            if(pkm.getId() == id){
                return pkm;
            }
        }
        //ในกรณีไม่มีโปกมอนตัวใดเลยมี id ตรงกับที่ user กรอกให้ return null
        return null;
    }
    
    //ตัวอย่างการค้นหาข้อมูลใน list โดยผลลัพธ์อาจจะมีมากกว่า 1 ตัว เงื่อนไขการค้นหาเป็นแบบ partial match
    public ArrayList<Pokemon> searchByNameEnglish(String name){
        ArrayList<Pokemon> results = new ArrayList<Pokemon>();
        
        //หลักการค้นหา เชคทีละตัวตั้งแต่ตัวแรกถึงตัวสุดท้าย
        for(int i=0; i<pokemon_list.size(); i++){
            Pokemon pkm = pokemon_list.get(i);//อ่านค่าโปเกมอนทีละตัวใน loop
            //pkm.getName_english() getter ในการอ่านชื่อของออบเจคโปเกมอน
            //pkm.getName_english().contains(name) ชื่อโปเกมอน มีคำที่ user กรอกมาหรือกไม่
            if(pkm.getName_english().contains(name)){
                results.add(pkm);
            }
        }
        return results;
    }
   //ตัวอย่างการค้นหาข้อมูลใน list โดยผลลัพธ์อาจจะมีมากกว่า 1 ตัว เงื่อนไขการค้นหาในช่วงข้อมูล
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
            if(pkm.getAttack() >= min_defense && pkm.getAttack() <= max_defense){
                results.add(pkm);
            }
        }
        return results;
    }
    
    //+insertPokemon(id : Integer, name_english : String
    //, hp : Double,attack : Double,defense : Double,speed : Double)
    public void insertPokemon(Integer id, String name_english, Double hp, Double attack, Double defense, Double speed  ){
        //ค้นหาว่ามี pokemon id นี้แล้วหรือยัง?
        Pokemon search_pokemon = searchById(id);
        //search_pokemon==null แปลค้นหา id นี้ไม่เจอ ให้ทำการเพิ่ม id นี้เข้าไปได้
        if(search_pokemon==null){
            //สร้างออบเจคโปเกมอน
            Pokemon pkm = new Pokemon(id,name_english, "", hp, attack, defense, speed);
            pokemon_list.add(pkm);
            System.out.println("เพิ่มโปเกมอน " + pkm + "สำเร็จ");
        }else{
            System.out.println("มีโปเกมอน " +search_pokemon + "แล้ว");
        }
        
        
    }
    
//+updatePokemon(id : Integer, name_english : String, hp : Double,attack : Double,defense : Double,speed : Double)
    public void updatePokemon(Integer id, String name_english, Double hp, Double attack, Double defense, Double speed){
        //ค้นหาว่ามี pokemon id นี้แล้วหรือยัง?
        Pokemon search_pokemon = searchById(id);
        
        //search_pokemon!=null แปลค้นหา id เจอ ให้ทำการแก้ไขโปเกมอน id นี้ได้
        if(search_pokemon!=null){
            //ใช้ setter ในการแก้ไขข้อมูล
            search_pokemon.setName_english(name_english);
            search_pokemon.setHp(hp);
            search_pokemon.setAttack(attack);
            search_pokemon.setDefense(defense);
            search_pokemon.setSpeed(speed);
            System.out.println("แก้ไขโปเกมอน " + search_pokemon + "สำเร็จ");
        }else{
            System.out.println("ยังไม่มีโปเกมอน id : " + id  + " นี้ในระบบ แก้ไขไม่ได้");
        }
        
    }
     //+deletePokemon(id : Integer)        
    public void deletePokemon(Integer id){
        //ค้นหาว่ามี pokemon id นี้แล้วหรือยัง?
        Pokemon search_pokemon = searchById(id);
         //search_pokemon!=null แปลค้นหา id เจอ ให้ทำลบข้อมูลตัวนี้ได้
        if(search_pokemon!=null){
            //ทำการลบค่าโปเกมอนตัวนี้ออกไปจาก list
            pokemon_list.remove(search_pokemon);
            System.out.println("ลบโปเกมอน " + search_pokemon + "สำเร็จ");
        }else{
            System.out.println("ยังไม่มีโปเกมอน id : " + id  + " นี้ในระบบ ลบไม่ได้");
        }
    }    
}
