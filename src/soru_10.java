import java.util.Scanner;

public class soru_10 {
    public static void main(String[] args) {


        //Kullanicidan bir harf alin
        //ve alfabede o harften sonraki 3 harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char girilenKrk=scan.next().charAt(0);

        System.out.println(""+(char)(girilenKrk+1)+(char)(girilenKrk+2)+(char)(girilenKrk+3));
    }
}
