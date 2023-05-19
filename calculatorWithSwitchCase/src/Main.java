import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, select;

        System.out.println("İlk sayısı giriniz... ");
        n1 = scanner.nextInt();
        System.out.println("ikinci sayısı giriniz... ");
        n2 = scanner.nextInt();

        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println(n1 + " + " + n2 + " = " +(n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " +(n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " x " + n2 + " = " +(n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + ((double)n1 / (double)n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen 1 ile 4 arasında bir rakam seçiniz.");
        }
    }
}