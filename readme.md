# TiketBioskop

## Deskripsi Proyek
Proyek ini adalah aplikasi Java sederhana untuk mengelola informasi tiket bioskop. Kelas `TiketBioskop` mencakup informasi seperti:
- Nama film,
- Jumlah tiket yang dipesan, dan
- Harga per tiket.

Selain itu, kelas ini juga menyediakan fitur untuk menghitung total harga tiket yang dibeli, baik dengan atau tanpa diskon.

## Fitur Utama
1. **Hitung Total Harga**: Menghitung total harga berdasarkan jumlah tiket dan harga per tiket.
2. **Diskon Pembelian**: Mendapatkan diskon 10% jika jumlah tiket yang dibeli lebih dari tiga.
3. **Tampilkan Rincian**: Menampilkan detail tiket yang mencakup nama film, jumlah tiket, harga per tiket, dan total harga setelah diskon (jika berlaku).

## Struktur Kelas
- `namaFilm`: Nama film (String)
- `jumlahTiket`: Jumlah tiket yang dibeli (int)
- `hargaPerTiket`: Harga satu tiket (double)
- `hitungTotalHarga()`: Menghitung total harga tiket tanpa diskon
- `hitungHargaSetelahDiskon()`: Menghitung total harga tiket setelah menerapkan diskon (jika berlaku)
- `tampilkanRincianTiket()`: Menampilkan semua informasi terkait tiket

## Cara Menjalankan Proyek
1. Pastikan JDK sudah diinstal dan dikonfigurasi di sistem Anda.
2. Clone atau unduh repositori ini.
3. Kompilasi kelas `TiketBioskop.java` dengan perintah:
    ```bash
    javac TiketBioskop.java
    ```
4. Jalankan program dengan membuat instance `TiketBioskop` dan memanggil metode `tampilkanRincianTiket()`.

### Contoh
```java
public class Main {
    public static void main(String[] args) {
        TiketBioskop tiket = new TiketBioskop("Film Contoh", 5, 50000);
        tiket.tampilkanRincianTiket();
    }
}
