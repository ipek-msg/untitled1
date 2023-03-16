import java.util.Scanner;

public class soru_4 {

    public static void main(String[] args) {

        //Kullanicidan bir dikdörtgenin 2 kenar uzunlugunu alip,
        //dikdörtgenin alanini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kenar uzunluklarini giriniz" +
                            " iki ayrı kenar uzunlugu girin ");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        System.out.println("dikdortgenin alani:" + kenar1*kenar2);
    }
}
