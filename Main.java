import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Sayı değerinin giriş işlemi.

        Scanner input = new Scanner(System.in);
        int sayi;

        // For döngüsü uygulaması-1.

        for (boolean run = true; run; ) {
            System.out.print("Sayi Giriniz: ");
            sayi = input.nextInt();
            if (sayi < 0) {
                run = false;

                // While döngüsü uygulaması-1.

        /*System.out.print("Sayi Giriniz: ");
        sayi =input.nextInt();
        while (sayi >=0) {
            System.out.print("Sayi Giriniz: ");
            sayi =input.nextInt();*/

                // d0-while uygulaması.

       /* do {
            System.out.print("Sayi Giriniz: ");
            sayi = input.nextInt();
            }
           while (sayi >=0);*/

                // For döngüsü uygulaması-2.

        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            }*/

                // While döngüsü uygulaması-2.

      /* int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            }*/
            }
        }
    }
}





