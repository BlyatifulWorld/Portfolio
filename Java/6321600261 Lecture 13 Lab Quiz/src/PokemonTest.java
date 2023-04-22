import java.util.*;

public class PokemonTest {
    public static void main(String args[]) throws Exception {
        PokemonService pkm_service = new PokemonService();

        ArrayList<Pokemon> results = pkm_service.sortByNameEnglish();
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
        
        /*
        ArrayList<Pokemon> results = pkm_service.sortByAttack();
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
        */
        
        /*
        Pokemon result1 = pkm_service.searchById(99);
        System.out.println(result1);
        
        Pokemon result2 = pkm_service.searchById(918);
        System.out.println(result2);
         */
        
        /*
         ArrayList<Pokemon> results = pkm_service.searchByNameEnglish("leo");
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        } */
        
        /*ArrayList<Pokemon> results = pkm_service.searchByAttack(100, 105);
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }*/
    }

}
