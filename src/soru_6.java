import java.util.Scanner;

public class soru_6 {

    public static void main(String[] args) {

        //Kullanicidan bir cemberin yaricapini alip,
        //cevresini ve alanini yazdirin





        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");
        int yaricap=scan.nextInt();

        System.out.println("çemberin alanı: " + (Math.PI*yaricap*yaricap));

        System.out.println( "çemberin çevresi: "+(2*Math.PI*yaricap));


        //Daire formülü
        //Alan  : pi * r *r
        //çevre : 2 * pi * r
        // (r =yaricap demektir)

        // başka bir version
        /*
         int r;
    double alan,cevre,pi = 3.14;

    Scanner input = new Scanner(System.in);

    System.out.println("Daire yarı çapını giriniz : ");
    r = input.nextint();
    cevre = 2 * pi * r;
    alan = pi * (r*r);
    System.out.println("Dairenin Alanı : " + alan);
    System.out.println("Dairenin Çevresi : " + cevre);
         */
    }
}
