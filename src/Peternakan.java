import java.util.ArrayList;

// Definisi kelas Peternakan
class Peternakan {
    // Atribut kelas Peternakan - daftar kambing dalam ArrayList
    private ArrayList<Kambing> kambingList = new ArrayList<>();

    // Metode untuk menambahkan kambing ke daftar peternakan
    public void tambahKambing(Kambing kambing) {
        kambingList.add(kambing);
    }

    // Metode untuk menampilkan status semua kambing di peternakan
    public void tampilkanSemuaKambing() {
        System.out.println("Daftar Kambing di Peternakan:");
        for (Kambing kambing : kambingList) {
            kambing.statusKambing();
        }
    }
}