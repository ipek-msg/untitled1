public class soru_increment {


    public static void main(String[] args) {

        int a=10;
        System.out.println("a'nin degeri : "+ ++a);//11

        int b= a++;
        System.out.println("b'nin degeri: "+b);//11

        int c= b++ + a;
        System.out.println("c 'nin degeri:"+ c);//23

        System.out.println("son toplam: " + (a + b + c));

    }
}
