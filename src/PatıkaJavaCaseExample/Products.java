package PatıkaJavaCaseExample;
public abstract class Products {

   protected long   productsİd;
   protected double price;
   protected double discount;
   protected int    stock;
   protected String name;
   protected Brands brand;

   private static long id = 20000;

    public Products(double price, double discount, int stock, String name, Brands brand) {
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        id+=1;
        this.productsİd =id;
    }

    public long getProductsİd() {
        return productsİd;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
