import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, type;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = input.nextInt();
        if (km <= 50) {
            System.out.println("Mesafe 50 kilometreden az olamaz.");
        } else {
            System.out.print("Yaşınızı giriniz : ");
            age = input.nextInt();
            if (age < 0) {
                System.out.println("Lütfen geçerli bir yaş giriniz.");
            } else {
                System.out.println("Yolculuk tipini seçiniz:\n1-)Tek Yön\n2-)Gidiş-Dönüş");
                type = input.nextInt();

                if (type == 1) {
                    if (age < 12) {
                        total = (km * 0.1) * 0.5;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else if (age <= 24) {
                        total = (km * 0.1) * 0.9;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else if (65 <= age) {
                        total = (km * 0.1) * 0.7;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else {
                        total = km * 0.1;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    }
                } else if (type == 2) {
                    if (age < 12) {
                        total = (km * 0.1) * 0.5 * 0.8 * 2;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else if (age <= 24) {
                        total = (km * 0.1) * 0.9 * 0.8 * 2;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else if (65 <= age) {
                        total = (km * 0.1) * 0.7 * 0.8 * 2;

                        System.out.println("Yolculuk ücretiniz = " + total);
                    } else {
                        total = (km * 0.1) * 0.8 * 2;
                        System.out.println("Yolculuk ücretiniz = " + total);
                    }

                } else {
                    System.out.println("Geçerli bir yolculuk tipi giriniz.");
                }

            }


        }
    }
}
