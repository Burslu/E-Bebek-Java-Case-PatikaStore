package PatıkaJavaCaseExample;

public class Phone extends  Products{

    int    storage;
    double screnSize;
    int    battery;
    int    ram;
    String color;
    public Phone(double price, double discount, int stock, String name, Brands brand, int storage,double screnSize,int battery,int ram,String color) {
        super(price, discount, stock, name, brand);
        this.storage   = storage;
        this.screnSize = screnSize;
        this.battery   = battery;
        this.ram       = ram;
        this.color     = color;

    }

    @Override
    public String toString() {
        return  " name='" + name + '\''+"\n" +
                "storage=" +storage +"\n"+
                " screnSize=" + screnSize+"\n" +
                " battery=" + battery +"\n"+
                " ram=" + ram +"\n"+
                " color='" + color + '\'' +"\n"+
                " productsİd=" + productsİd +"\n"+
                " price=" + price +"\n"+
                " discount=" + discount +"\n"+
                " stock=" + stock +"\n"+
                " brand=" + brand +"\n"+
                "\n";
    }
}
