import java.util.Scanner;

public class soru_13 {

    public static void main(String[] args) {

        //Kullanıcıdan bir double bir tam sayi alin
        //double sayiyi ikinci sayiya bölün
        //ve bölüm isleminin sonucunu tam sayi kısmına yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kesirlisayi giriniz");

        double sayi1=scan.nextDouble();

        System.out.println("Lutfen bir tam sayı giriniz");

        int sayi2=scan.nextInt();

        int sonuc=(int)(sayi1/sayi2);

        System.out.println(sonuc);


    }


}
