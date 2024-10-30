import org.example.TiketBioskop;

import java.util.Scanner;

public class Main {

    public static final int pertaruhan = 50000;
    public static final int aliTopan = 60000;
    public static final int jakartavsEverybody = 70000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Film:");
        System.out.println("1. Pertaruhan (Rp50,000)");
        System.out.println("2. Ali topan (Rp60,000)");
        System.out.println("3. Jakarta vs Evrybody (Rp70,000)");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        String namaFilm = "";
        double hargaPerTiket = 0;

        switch (pilihan) {
            case 1:
                namaFilm = "Pertaruhan";
                hargaPerTiket = pertaruhan;
                break;
            case 2:
                namaFilm = "Ali topan";
                hargaPerTiket = aliTopan;
                break;
            case 3:
                namaFilm = "Jakarta vs everybody";
                hargaPerTiket = jakartavsEverybody;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();

        TiketBioskop tiket = new TiketBioskop(namaFilm, jumlahTiket, hargaPerTiket);
        tiket.tampilkanRincianTiket();
    }
}
