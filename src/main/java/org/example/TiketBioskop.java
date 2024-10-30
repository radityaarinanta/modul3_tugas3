package org.example;

/**
 * class ini berisi tentang informasi seperti nama film, jumlah tiket dan harga pertiket
 */
public class TiketBioskop {
    private String namaFilm;
    private int jumlahTiket;
    private double hargaPerTiket;


    private static final double TARIF_DISKON = 0.9;
    private static final int BATAS_DISKON = 3;

    public TiketBioskop(String namaFilm, int jumlahTiket, double hargaPerTiket) {
        this.setNamaFilm(namaFilm);
        this.setJumlahTiket(jumlahTiket);
        this.setHargaPerTiket(hargaPerTiket);
    }

    public double hitungTotalHarga() {
        return jumlahTiket * hargaPerTiket;
    }

    /**
     * method ini berfungsi untuk menghitung harga tiket yang akan dibeli
     * @return
     */
    public double hitungHargaSetelahDiskon() {
        if (jumlahTiket > BATAS_DISKON) {
            return jumlahTiket * hargaPerTiket * TARIF_DISKON;
        } else {
            return jumlahTiket * hargaPerTiket;
        }
    }

    public void tampilkanRincianTiket() {
        System.out.println("Film: " + namaFilm);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Harga per Tiket: Rp" + hargaPerTiket);
        System.out.println("Total Pembayaran: Rp" + hitungHargaSetelahDiskon());
    }


    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    public double getHargaPerTiket() {
        return hargaPerTiket;
    }

    public void setHargaPerTiket(double hargaPerTiket) {
        this.hargaPerTiket = hargaPerTiket;
    }
}
