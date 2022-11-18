package PatıkaJavaCaseExample;

public class Brands {

    private long brandId;
    private String name;
    private static long id = 10000;

    public Brands(String name) {
        this.name = name;
        id += 1;
        this.brandId = id;
    }

    public long getBrandId() {
        return brandId;
    }


    public static long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "  Brands{" +"\n"+
                " brandId=" + brandId+"\n" +
                " name='" + name + '\''+"\n" +
                "}\n";
    }
}

