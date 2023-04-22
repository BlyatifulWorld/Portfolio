import java.awt.image.BufferedImage;

public class cafe {
    private int id;
    private String name;
    private double price;
    private String type;
    private double cal;
    private BufferedImage picture;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.id;
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
        final cafe other = (cafe) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public cafe(int id, String name, double price, String type, double cal, BufferedImage picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.cal = cal;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "cafe{" + "id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", cal=" + cal + ", picture=" + picture + '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }
}
