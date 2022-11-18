package PatıkaJavaCaseExample;

import java.util.ArrayList;
import java.util.Scanner;

public class PatikaStore {

        ArrayList<Products> productsList = new ArrayList<>();
        ArrayList<Brands>   brandsList   = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        public PatikaStore() {
        markaOlustur();
        }



public void begin(){
        System.out.println("-------------PatikaStore'a hoşgeldiniz-------------");
        maınMenü();
}
public  void  markaOlustur(){

        brandsList.add(new Brands("Samsung"));
        brandsList.add(new Brands("Lenovo"));
        brandsList.add(new Brands("Apple"));
        brandsList.add(new Brands("Huawei"));
        brandsList.add(new Brands("Casper"));
        brandsList.add(new Brands("Asus"));
        brandsList.add(new Brands("HP"));
        brandsList.add(new Brands("Xiaomi"));
        brandsList.add(new Brands("Monster"));
        brandsList.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
}

public void kararVer(){
        System.out.println("islem yapmaya devam etmek istermisiniz?\n1-EVET\n2-HAYIR");
        int karar  = scan.nextInt();
        if (karar ==1){
                maınMenü();
        }else if (karar == 2){
                System.out.println("Görüşürüz.Allaha Emanet");
        }else {
                System.out.println("gecerli bir giriş yapınız.");
                kararVer();
        }
}

public void  maınMenü(){
        String select;

        System.out.println("\t1-Ürünleri listele\n\t2-Ürün Ekleme\n\t3-Ürün silme\n\t4-Ürünleri filtrele\n\tQ-Çıkıs Yapma.");
        System.out.println("Lutfen Yapmak Istediğiniz İslemi Seciniz");
        select = scan.next();
        switch (select){
                case "1":
                        urunlerıList();
                        kararVer();
                        break;
                case "2":
                        urunEkle();
                        kararVer();
                        break;
                case "3":
                        urunSil();
                        kararVer();
                        break;
                case "4":
                        urunFlitrele();
                        kararVer();
                        break;
                case "Q":
                        System.out.println("Yeniden bekleriz...");
                        break;

        }
}
        public void  urunlerıList(){
                for (int i = 0; i < productsList.size(); i++) {
                        System.out.println(productsList.get(i));

                }
        }

        private void urunFlitrele() {

                for (int i = 0; i < brandsList.size(); i++) {

                        System.out.println(i+1 + "- "+brandsList.get(i));
                }
                System.out.println("filtrelemek istediğiniz markanın numarasını seçiniz:");
                int number = scan.nextInt();

                for (int i = 0; i < productsList.size(); i++) {
                        if(productsList.get(i).getBrand()==brandsList.get(number-1)){
                                System.out.println(productsList.get(i));

                        }
                }
        }

        private void urunSil() {
         urunlerıList();
                System.out.println("silmek istediginiz ürünün Id sini giriniz : ");
                int Id = scan.nextInt();
                for (int i = 0; i < productsList.size(); i++) {
                       if (productsList.get(i).getProductsİd() == Id){
                               productsList.remove(i);
                               System.out.println();
                       }
                }


        }

        private void urunEkle() {
        Products urun = null;
                System.out.println("Eklemek istediğiniz ürünü giriniz?\n1-Notebook\n2-Phone");
                int urunTipi = scan.nextInt();
                scan .nextLine();
                System.out.println("Ürünün ismini giriniz");
                String productName = scan.nextLine();
                System.out.println("Ürünün fiyatını giriniz");
                double price = scan.nextDouble();
                System.out.println("Ürünün indirim oranını giriniz");
                double discount = scan.nextDouble();
                System.out.println("Ürünün stogunu giriniz");
                int stock = scan.nextInt();
                scan.nextLine();
                System.out.println("Ürünün markasını giriniz");
                String brand = scan.nextLine();

                switch (urunTipi){
                        case 1 :
                                System.out.println("ram boyutunu giriniz");
                                int ram = scan.nextInt();
                                System.out.println("ekran boyutunu giriniz");
                                double screnSize = scan.nextDouble();
                                System.out.println("depolama alanını giriniz");
                                int depolama = scan.nextInt();
                                
                                urun = new Notebook(price,discount,stock,productName,findBrandByName(brand),ram,depolama,screnSize);
                                break;
                        case 2:
                                System.out.println("Depolama alanını giriniz");
                                int storage= scan.nextInt();
                                System.out.println("Ekran  boyutunu giriniz");
                                double screnSizePhone = scan.nextDouble();
                                System.out.println("Batarya boyutunu giriniz");
                                int battary = scan.nextInt();
                                System.out.println("Ram boyutunu giriniz");
                                int ramPhone = scan.nextInt();
                                System.out.println("Ürün rengini giriniz");
                                String color = scan.next();

                                urun = new Phone(price,discount,stock,productName,findBrandByName(brand),storage,screnSizePhone,battary,ramPhone,color);
                                break;

                }
                productsList.add(urun);

                
        }
        private Brands findBrandByName( String name){
                for (Brands current: brandsList) {
                if (current.getName().equals(name)){
                        return current;
                }
                }
               return null;
        }

}
