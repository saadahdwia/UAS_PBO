// Import kelas ArrayList untuk digunakan dalam kelas Peternakan
import java.util.ArrayList;

// Definisi kelas Kambing
class Kambing {
    // Atribut-atribut kelas Kambing
    private String nama;
    private double berat;
    private double tinggi;
    private double panjang;

    // Konstruktor untuk inisialisasi atribut ketika objek Kambing dibuat
    public Kambing(String nama, double beratAwal, double tinggiAwal, double panjangAwal) {
        this.nama = nama;
        this.berat = beratAwal;
        this.tinggi = tinggiAwal;
        this.panjang = panjangAwal;
    }

    // Metode untuk mengupdate pertumbuhan bulanan kambing
    public void pertumbuhanBulanan(double beratTambahan, double tinggiTambahan, double panjangTambahan) {
        this.berat += beratTambahan;
        this.tinggi += tinggiTambahan;
        this.panjang += panjangTambahan;
    }

    // Metode untuk menampilkan status kambing
    public void statusKambing() {
        System.out.println("Status Kambing " + nama + ":");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Panjang: " + panjang + " cm\n");
    }
}