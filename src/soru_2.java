import java.util.Scanner;

public class soru_2 {

    public static void main(String[] args) {
        // Kullanicidan bir double,birde int sayi alip
        // bunlarin toplamini ve  carpimini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen kesirli bir sayi giriniz");

        double sayi1= scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int sayi2= scan.nextInt();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1*sayi2);
    }
}


