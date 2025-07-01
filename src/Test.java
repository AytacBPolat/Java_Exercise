import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
       int matematik,fizik, kimya, turkce, tarih, muzik;
       Scanner input = new Scanner(System.in);
    System.out.print("Matematik notunuz: ");
    matematik = input.nextInt();
   System.out.print("Fizik notunuz: ");
    fizik = input.nextInt();
    System.out.print("Kimya notunuz: ");
    kimya = input.nextInt();
    System.out.print("Turkce notunuz: ");
    turkce = input.nextInt();
    System.out.print("Tarih notunuz: ");
    tarih = input.nextInt();
    System.out.print("Muzik notunuz: ");
    muzik = input.nextInt();
    int toplam = matematik +  fizik + kimya + turkce + tarih + muzik;
    double ortalama = toplam /6.0 ;
    double gecmeNotu = 60;
    System.out.println(ortalama);
    String Sonuc = (ortalama > gecmeNotu) ? ("Ortalama " + gecmeNotu + " üstünde, geçer. ") : ("Ortalama " + gecmeNotu + " altında geçmez.");
   System.out.println(Sonuc);
    }
}

