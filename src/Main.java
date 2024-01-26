// Kelas utama (main class) untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Pembuatan objek kambing
        Kambing kambing1 = new Kambing("Kambing A", 20, 60, 80);
        Kambing kambing2 = new Kambing("Kambing B", 18, 55, 75);

        // Pertumbuhan bulanan kambing
        kambing1.pertumbuhanBulanan(5, 10, 12);
        kambing2.pertumbuhanBulanan(4, 8, 10);

        // Pembuatan objek peternakan
        Peternakan peternakanSlamet = new Peternakan();

        // Menambahkan kambing ke peternakan
        peternakanSlamet.tambahKambing(kambing1);
        peternakanSlamet.tambahKambing(kambing2);

        // Menampilkan status semua kambing di peternakan
        peternakanSlamet.tampilkanSemuaKambing();
    }
}
