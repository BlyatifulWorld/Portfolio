import java.awt.image.BufferedImage;

public class Product {
    private int id;
    private String name;
    private double price;
    private BufferedImage picture;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
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
        final Product other = (Product) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", picture=" + picture + '}';
    }

    
    
    
    public Product(int id, String name, double price, BufferedImage picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }
    
    
}
