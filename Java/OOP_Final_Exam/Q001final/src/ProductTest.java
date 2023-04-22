import java.util.ArrayList;
public class ProductTest {
    static ArrayList<Product> Product_List = new ArrayList<Product>();
    public static void main(String[] args) {
        Product chais = new Product(1, "Chais", 1, "boxes", 18);
        Product Chang = new Product(2, "Chang", 1, "boxes", 19);
        Product Aniseed = new Product(3, "Aniseed Syrup", 1, "boxes", 10);
        Product Anton = new Product(4, "Chef Anton's Cajun Seasoning", 2, "jars", 22);
        
        System.out.println("Chais id : " + chais.getProductID() + " productName : " + chais.getProductName() + " CategoryID : " + chais.getCategoryID() + " Unit : "  + chais.getUnit() + " Price : " + chais.getPrice()); 
        System.out.println("Chang id : " + Chang.getProductID() + " productName : " + Chang.getProductName() + " CategoryID : " + Chang.getCategoryID() + " Unit : " + chais.getUnit() + " Price : " + chais.getPrice()); 
        System.out.println("Aniseed id : " + Aniseed.getProductID() + " productName : " + Aniseed.getProductName() + " CategoryID : " + Aniseed.getCategoryID() + " Unit : " + chais.getUnit() + " Price : " + chais.getPrice()); 
        System.out.println("Anton id : " + Anton.getProductID() + " productName : " + Anton.getProductName() + " CategoryID : " + Anton.getCategoryID() + " Unit : " + chais.getUnit() + " Price : " + chais.getPrice()); 
    }
}
