// =============================
// Class ProdukElektronik
// Level 1 (Parent class)
// =============================

public class ProdukElektronik {
    // =============================
    // Atribut dasar produk elektronik
    // =============================
    private String namaProduk; // menyimpan nama produk
    private String merek;      // menyimpan merek produk
    private int harga;         // menyimpan harga produk

    // =============================
    // Constructor kosong (default)
    // =============================
    public ProdukElektronik() {}

    // =============================
    // Constructor dengan parameter
    // Digunakan untuk menginisialisasi data produk langsung
    // =============================
    public ProdukElektronik(String namaProduk, String merek, int harga) {
        this.namaProduk = namaProduk;
        this.merek = merek;
        this.harga = harga;
    }

    // =============================
    // Getter dan Setter
    // Untuk mengakses dan mengubah atribut
    // =============================
    public String getNamaProduk() { return namaProduk; }
    public String getMerek() { return merek; }
    public int getHarga() { return harga; }

    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setMerek(String merek) { this.merek = merek; }
    public void setHarga(int harga) { this.harga = harga; }
}