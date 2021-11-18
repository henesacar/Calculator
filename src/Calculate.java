import java.util.Scanner;

public class Calculate {
    static void plus() {
        Scanner scn = new Scanner(System.in);
        int total, i = 1, result = 0;
        while (true) {
            System.out.println(i++ + ". sayı:");
            total = scn.nextInt();
            if (total == 0) {
                break;
            }
            result += total;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void minus() {
        Scanner scn = new Scanner(System.in);
        int total = 0, i = 1, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz?:");
        int counter = scn.nextInt();
        for (i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            total = scn.nextInt();
            if (i == 1) {
                result += total;
                continue;
            }
            result -= total;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void times() {
        Scanner scn = new Scanner(System.in);
        int total = 1, i = 1, result = 1;
        while (true) {
            System.out.print(i++ + ". sayı:");
            total = scn.nextInt();
            if (total == 0) {
                result = 0;
                break;
            }
            if (total == 1) {
                break;
            }
            result *= total;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void divide() {
        Scanner scn = new Scanner(System.in);
        double total, result = 0.0;
        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int count = scn.nextInt();
        if (count == 1 || count == 0) {
            System.out.println("Geçerli bir sayı girin.");
        }
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı :");
            total = scn.nextInt();
            if (i != 1 && total == 0) {
                System.out.println("Bölen olarak 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = total;
                continue;
            }
            result /= total;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void power() {
        Scanner scn = new Scanner(System.in);
        int result = 1, i;
        System.out.print("Taban sayısını girin: ");
        int base = scn.nextInt();
        System.out.print("Üs sayısını girin: ");
        int pow = scn.nextInt();
        for (i = 1; i <= pow; i++) {
            result *= base;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void factorial() {
        Scanner scn = new Scanner(System.in);
        int total = 1, result, i;
        System.out.print("Faktöriyelini almak istediğiniz sayıy girin: ");
        int data = scn.nextInt();
        for (i = 1; i <= data; i++) {
            total *= i;
        }
        result = total;
        System.out.println("İşlem sonucu : " + result);
    }

    static void mod() {
        Scanner scn = new Scanner(System.in);
        int result = 1;
        System.out.print("Modu alanıcak sayıyı girin: ");
        int data = scn.nextInt();
        System.out.print("Mod sayısını girin: ");
        int data2 = scn.nextInt();
        if (data > 0 && data2 > 0 && data > data2) {
            result = data % data2;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    static void rectangle() {
        Scanner scn = new Scanner(System.in);
        int a, b, result = 0;
        System.out.print("Dikdörtgenin uzun kenar uzunluğunu girin: ");
        a = scn.nextInt();
        System.out.print("Dikdörtgenin kısa kenar uzunluğunu girin: ");
        b = scn.nextInt();
        if (a > b && a > 0 && b > 0) {
            result = a*b;
        }
        System.out.println("İşlem sonucu : " + result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:" +
                    "\n1 - Toplama" +
                    "\n2 - Çıkarma" +
                    "\n3 - Çarpma" +
                    "\n4 - Bölme" +
                    "\n5 - Üs Alma" +
                    "\n6 - Faktöriyel Alma" +
                    "\n7 - Mod Alma" +
                    "\n8 - Dikdörtgen Alan Hesaplama" +
                    "\n0 - Çıkış ");
            input = scn.nextInt();
            switch (input) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz");
            }

        } while (input != 0);
    }
}
