import java.util.Scanner;

public class soru_12 {


    public static void main(String[] args) {

        //kullanıcıdan iki double sayi alin,
        //ilk sayiyi ikinci sayiya bölün
        //ve bölüm isleminin sonucunu tamsayi kısmına yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki adet kesirli sayı giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int sonuc=(int)(sayi1/sayi2);

        System.out.println(sonuc);
    }
}
