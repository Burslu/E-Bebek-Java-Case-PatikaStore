package PatıkaJavaCaseExample;

public class Notebook extends Products{

    int ram;
    int storage;
    double screenSize;

    public Notebook(double price, double discount, int stock, String name, Brands brand, int ram, int storage, double screenSize) {
        super(price, discount, stock, name, brand);
    this.ram        = ram;
    this.storage    = storage;
    this.screenSize = screenSize;

    }

    @Override
    public String toString() {
        return  " name='" + name + '\''+"\n" +
                " ram=" + ram +"\n"+
                " storage=" + storage +"\n"+
                " screenSize=" + screenSize +"\n"+
                " productsİd=" + productsİd +"\n"+
                " price=" + price +"\n"+
                " discount=" + discount +"\n"+
                " stock=" + stock +"\n"+
                " brand=" + brand +"\n"+
                "\n";
    }
}
