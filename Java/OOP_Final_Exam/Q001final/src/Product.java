public class Product {
    private int productID;
    private String productName;
    private int categoryID;
    private String unit;
    private double price;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int productID, String productName, int categoryID, String unit, double price) {
        this.productID = productID;
        this.productName = productName;
        this.categoryID = categoryID;
        this.unit = unit;
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", categoryID=" + categoryID + ", unit=" + unit + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.productID;
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
        if (this.productID != other.productID) {
            return false;
        }
        return true;
    }

    
}
