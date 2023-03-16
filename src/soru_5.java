import java.util.Scanner;

public class soru_5 {

    public static void main(String[] args) {

        //kullanicidan ismini,soyismini
        // ve yasını alip asagıdaki formatta yazdirin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.next();
        System.out.println("Lutfen yasınızı giriniz");
        int yas=scan.nextInt();

        System.out.print("Girilen bilgiler: "+ isim + " " +
                soyisim +","+ yas);
    }
}
