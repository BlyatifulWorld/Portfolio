import java.util.Comparator;
public class PokemonNameEnglishComparator implements Comparator<Pokemon>{
    @Override
    // ความหมายการ return ของ compare 
    // < 0 pkm1 มาก่อน
    // > 0 pkm2 มาก่อน
    // = 0 เท่ากัน
    public int compare(Pokemon pkm1, Pokemon pkm2) {
        //อ่านค่าชื่อภาษาอังกฤษของโปเกมอนตัวที่ 1 (pkm1)
       String pokemon_name_english1 = pkm1.getName_english();
       //อ่านค่าชื่อภาษาอังกฤษของโปเกมอนตัวที่ 2 (pkm2)
       String pokemon_name_english2 = pkm2.getName_english();
       //เปรียบเทียบ ชื่อภาษาอังกฤษของโปเกมอนตัวที่ 1 กับ 2 และ return ค่า
       return pokemon_name_english1.compareTo(pokemon_name_english2);
    }
    
}