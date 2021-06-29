import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematikNotu, fizikNotu, kimyaNotu, türkçeNotu, tarihNotu, müzikNotu;
        float notOrtalaması;

        String geçmeMesajı = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematikNotu = scanner.nextInt();

        System.out.print("Fizk notunu giriniz: ");
        fizikNotu = scanner.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimyaNotu = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        türkçeNotu = scanner.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarihNotu = scanner.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        müzikNotu = scanner.nextInt();

        notOrtalaması = (matematikNotu + fizikNotu + kimyaNotu + türkçeNotu + tarihNotu + müzikNotu) / 6;


        geçmeMesajı =  notOrtalaması > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(geçmeMesajı);

    }

}
