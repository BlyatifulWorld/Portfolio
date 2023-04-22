import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class ProductService {
    private Connection conn = null;
    
    public ProductService() throws Exception{
        //ติดต่อฐานข้อมูล
         try {
            String url = "jdbc:sqlite:oopproject.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }    
    }
    //เมธอดที่ใช้ในการอ่านข้อมูลโปรดัคโดยรับ input เป็นคำสั่ง SQL
    public ArrayList<Product> getProductsFromSQL(String sql){
      ArrayList<Product> results = new ArrayList<Product>();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String name_english = rs.getString("name");
                double price = rs.getDouble("price");
                BufferedImage  img = ImageIO.read(rs.getBinaryStream("picture"));
                Product p = new Product(id,name_english,price,img);
                results.add(p);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
        return results;
    }
    
    public ArrayList<Product> sortByName(){
       String sql = "SELECT * FROM product order by name";
        ArrayList<Product> results = getProductsFromSQL(sql);
        return results;
    }
    
    public ArrayList<Product> sortByPrice(){
        String sql = "SELECT * FROM product order by price";
        ArrayList<Product> results = getProductsFromSQL(sql);
        return results;
    }
    
    public ArrayList<Product> searchByName(String name){
        String sql = "SELECT * FROM product WHERE name LIKE '%" + name + "%'";
        ArrayList<Product> results = getProductsFromSQL(sql);
        return results;
    }
    
    public ArrayList<Product> searchByPrice(double min_price, double max_price){
        String sql = "SELECT * FROM product WHERE price >= " + min_price + " AND price <= " + max_price;
        ArrayList<Product> results = getProductsFromSQL(sql);
        return results;
    }
    
    public boolean insertProduct(int id,String name,double price,BufferedImage picture){
        boolean success = false;
        try {
            String sql = "INSERT INTO product VALUES(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(picture, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setDouble(3, price);
            stmt.setBytes(4, bytes);
            stmt.executeUpdate();
            success = true;
            
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
            
        } 
        return success;
    }
    
     public boolean updateProduct(int id,String name,double price,BufferedImage picture){
         boolean success = false;
        try {
            String sql = "UPDATE Product "
                       + " SET name = ?, "
                       + "    price = ?, "
                       + "  picture = ? "
                       + " WHERE id = ? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(picture, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setBytes(3, bytes);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
            
        } 
        return success;
    }
    
    public boolean deleteProduct(int id){
        boolean success = false;
        try {
            String sql = "DELETE FROM Product WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            success = true;
        } catch (Exception e) {
            e.printStackTrace();
            success = false;
            
        } 
        return success;
    }
}
