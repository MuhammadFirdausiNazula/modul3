import java.util.Scanner;

/**
 * Program ini digunakan untuk menghitung luas jajargenjang.
 */
public class Luasjajargenjang {

    /**
     * Method ini menghitung luas jajargenjang berdasarkan alas dan tinggi.
     *
     * @param alas   Panjang alas jajargenjang
     * @param tinggi Tinggi jajargenjang
     * @return Luas jajargenjang
     */
    public static double hitungLuasJajargenjang(double alas, double tinggi) {
        return alas * tinggi;
    }

    /**
     * Method utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan alas jajargenjang: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi jajargenjang: ");
        double tinggi = input.nextDouble();

        double luas = hitungLuasJajargenjang(alas, tinggi);
        System.out.println("Luas jajargenjang adalah: " + luas);
    }
}

