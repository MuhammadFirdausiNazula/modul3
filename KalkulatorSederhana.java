import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class KalkulatorSederhana1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Selamat datang di kalkulator sederhana!");
        out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        out.println("Pilih operasi matematika: ");
        out.println("1. Penjumlahan");
        out.println("2. Pengurangan");
        out.println("3. Perkalian");
        out.println("4. Pembagian");
        out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 == 0) {
                    out.println("Tidak dapat melakukan pembagian dengan angka nol.");
                    return;
                } else {
                    hasil = angka1 / angka2;
                }
                break;
            default:
                out.println("Pilihan tidak valid.");
                return;
        }

        out.println("Hasil: " + hasil);

        scanner.close();
    }
}
