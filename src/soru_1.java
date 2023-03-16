import java.util.Scanner;

public class soru_1 {


public static void main(String[] args) {


    //Kullanıcıdan uc farklı data turunde deger alip,
    //girilen degerleri acıklamalarıyla yazdırın


    Scanner scan = new Scanner(System.in);
    System.out.println("Lutfen isminizi giriniz");

    String kullaniciadi=scan.next();
    System.out.println(kullaniciadi);

    System.out.println("lutfen sıfrenizi giriniz");
    int sifre=scan.nextInt();

    System.out.println("lutfen kilonuzu giriniz");
    double kilo=scan.nextDouble();


}
}