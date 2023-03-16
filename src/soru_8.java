import java.util.Scanner;

public class soru_8 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alip,
        //ucuncu bir degisken olmadan ikinin degerlerini degistirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen ilk sayiyi giriniz");

        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int sayi2= scan.nextInt();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi2-sayi1;



        System.out.println("degisen sayi degerleri :" + "sayi1 :" +sayi1 +
                                "sayi2 :"+ sayi2);


        //yer degistirme formülü;

        // a = a + b;
        // b = a - b;
        // a = a - b;

    }
}
