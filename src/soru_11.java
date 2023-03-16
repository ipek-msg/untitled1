import java.util.Scanner;

public class soru_11 {


    public static void main(String[] args) {
        //Kullanicidan bir sayi alin
        // kullanici kac degerini girerse girsin
        // o sayiyi -128 ile 127 arasındaki bir sayiya dönüstürüp yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");

        int girilenSayi= scan.nextInt();

        byte donusenSayi=(byte) girilenSayi;

        System.out.println("girdiginiz" + girilenSayi +" 'nin donusmus hali :"+ donusenSayi);

        //soruda int byte dönüstürülmüstür
        //bytein hafızada kapladıgı yer aralıgı -128 ve 127 aralıgında oldugu icin
        //en az yer hafıza yeri byte tır
        //bu sebeple byte cevirdik
        //donusen sayılarda byte donusensayı=(byte) girilen sayı;
        //yazmamızın sebebi girilen sayının önune (byte) yazıp sorumlulugu almaktır
        //cunku java sorumluluk kabul etmez
    }
    }


