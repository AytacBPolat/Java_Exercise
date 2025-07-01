import java.util.Scanner;
public class KDV_Hesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ucret, KDV1,KDV2;
        ucret = input.nextDouble();
        System.out.print("KDV'siz Fiyat:" +ucret);
        KDV1 =  ucret + (ucret * 0.18);
        KDV2 = ucret + (ucret * 0.08);
        double fiyatAraligi = 1000.0;
        String tutar = (ucret > fiyatAraligi) ? ("KDV'li fiyat: " +KDV2) : ("KDV'li fiyat:" +KDV1);
        System.out.print(tutar);
    }
}
