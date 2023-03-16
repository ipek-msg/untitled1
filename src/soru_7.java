import java.util.Scanner;

public class soru_7 {
    public static void main(String[] args) {


        // Soru 7 (ınterview) -Kullanıcıdan iki sayi alip
        // ikisinin degerlerini degistirin(swap)


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci tam sayiyi giriniz");

        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int sayi2= scan.nextInt();

        int bos;

        bos=sayi1;
        sayi1=sayi2;

        bos=sayi2;
        sayi1=bos;


        System.out.println("sayi1 'in degeri: " + sayi1);
        System.out.println("sayi2 'nin degeri: " + sayi2);

    }
}