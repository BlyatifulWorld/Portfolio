import java.util.*;
public class PokemonServiceTest {
    
    
    public static void main(String args[]) throws Exception{
        PokemonService pkm_service = new PokemonService();
        Scanner scan = new Scanner(System.in);
        String cmd = "";
        do{
           System.out.println("กรุณาเลือกคำสั่งที่ต้องการ แล้ว Enter");
           System.out.println("1) เรียงโปเกมอนตามชื่อภาษาอังกฤษ");
           System.out.println("2) เรียงโปเกมอนตามพลังโจมตี");
           System.out.println("3) เรียงโปเกมอนตามพลังป้องกัน");
           System.out.println("4) ค้นหาโปเกมอนจากข้อความบางส่วนของชื่อ");
           System.out.println("5) ค้นหาโปเกมอนจากช่วงพลังโจมตี"); 
           System.out.println("6) ค้นหาโปเกมอนจากช่วงพลังป้องกัน"); 
           System.out.println("7) เพิ่มโปเกมอน"); 
           System.out.println("8) แก้ไขโปเกมอน"); 
           System.out.println("9) ลบโปเกมอน"); 
           System.out.println("Q) ออกจากโปรแกรม"); 
           cmd = scan.nextLine();

           if(cmd.equals("1")){
               ArrayList<Pokemon> result = pkm_service.sortByNameEnglish();
               System.out.println("เรียงข้อมูลโปเกมอนตามชื่อภาษาอังกฤษ");
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
               }
           }
           if(cmd.equals("2")){
               ArrayList<Pokemon> result = pkm_service.sortByAttack();
               System.out.println("เรียงข้อมูลโปเกมอนตามพลังโจมตี");
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
               }
           }
           if(cmd.equals("3")){
               ArrayList<Pokemon> result = pkm_service.sortByDefense();
               System.out.println("เรียงข้อมูลโปเกมอนตามพลังป้องกัน");
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
                }
           }
           if(cmd.equals("4")){
               System.out.println("กรุณากรอก ข้อความบางส่วนของชื่อภาษาอังกฤษโปเกมอน");
               String name = scan.nextLine();
               
               ArrayList<Pokemon> result = pkm_service.searchByNameEnglish(name);
               System.out.println("ข้อมูลโปเกมอนที่มีข้อความ " + name + " อยู่ในชื่อภาษาอังกฤษ");
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
               }
           }
           if(cmd.equals("5")){
               System.out.println("กรุณากรอกพลังโจมตีต่ำสุดของช่วงที่ต้องการค้นหา");
               Double min_attack = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอกพลังโจมตีสูงสุดของช่วงที่ต้องการค้นหา");
               Double max_attack = Double.parseDouble(scan.nextLine());
               
               ArrayList<Pokemon> result = pkm_service.searchByAttack(min_attack, max_attack );
               System.out.println("ข้อมูลโปเกมอนทีมีพลังโจมตีในช่วง " + min_attack + " - " + max_attack  );
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
               }    
           }
           if(cmd.equals("6")){
               System.out.println("กรุณากรอกพลังป้องกันต่ำสุดของช่วงที่ต้องการค้นหา");
               Double min_defense = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอกพลังป้องกันสูงสุดของช่วงที่ต้องการค้นหา");
               Double max_defense = Double.parseDouble(scan.nextLine());
               
               ArrayList<Pokemon> result = pkm_service.searchByDefense(min_defense, max_defense );
               System.out.println("ข้อมูลโปเกมอนทีมีพลังป้องกันในช่วง " + min_defense + " - " + max_defense  );
               System.out.println("-------------------------------------------");
               for(int i=0; i<result.size();i++){
                   System.out.println(result.get(i));
               }
           }   
           if(cmd.equals("7")){
               System.out.println("กรุณากรอก id ของโปเกมอน");
               Integer id = Integer.parseInt(scan.nextLine());
               
               System.out.println("กรุณากรอก name_english ของโปเกมอน");
               String name_english = scan.nextLine();
               
               System.out.println("กรุณากรอก hp ของโปเกมอน");
               Double hp = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก attack ของโปเกมอน");
               Double attack = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก defense ของโปเกมอน");
               Double defense = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก speed ของโปเกมอน");
               Double speed = Double.parseDouble(scan.nextLine());
               
               pkm_service.insertPokemon(id, name_english, hp, attack, defense, speed);
           }
           if(cmd.equals("8")){
               System.out.println("กรุณากรอก id ของโปเกมอน");
               Integer id = Integer.parseInt(scan.nextLine());
               
               System.out.println("กรุณากรอก name_english ของโปเกมอน");
               String name_english = scan.nextLine();
               
               System.out.println("กรุณากรอก hp ของโปเกมอน");
               Double hp = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก attack ของโปเกมอน");
               Double attack = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก defense ของโปเกมอน");
               Double defense = Double.parseDouble(scan.nextLine());
               
               System.out.println("กรุณากรอก speed ของโปเกมอน");
               Double speed = Double.parseDouble(scan.nextLine());
               
               pkm_service.updatePokemon(id, name_english, hp, attack, defense, speed);
               
           }

           if(cmd.equals("9")){
               System.out.println("กรุณากรอก id ของโปเกมอน");
               Integer id = Integer.parseInt(scan.nextLine());
               
               pkm_service.deletePokemon(id);
           }

        }while(!cmd.equalsIgnoreCase("Q"));
    }
}