// =============================
// Class Lampu
// Level 3 (Child dari PerabotanRumahTangga)
// =============================

public class Lampu extends PerabotanRumahTangga {
    // =============================
    // Atribut khusus untuk lampu
    // =============================
    private int daya;         // daya listrik lampu dalam watt
    private String jenisLampu;// jenis lampu (LED, Fluorescent, Halogen, dll)
    private int garansi;      // masa garansi lampu dalam bulan

    // =============================
    // Constructor kosong (default)
    // =============================
    public Lampu() {}

    // =============================
    // Constructor dengan parameter
    // Memanggil parent constructor dan inisialisasi semua atribut
    // =============================
    public Lampu(String namaProduk, String merek, int harga,
                 String kategori, String material, float berat,
                 int daya, String jenisLampu, int garansi) {
        super(namaProduk, merek, harga, kategori, material, berat); // panggil constructor parent
        this.daya = daya;
        this.jenisLampu = jenisLampu;
        this.garansi = garansi;
    }

    // =============================
    // Getter dan Setter
    // =============================
    public int getDaya() { return daya; }
    public String getJenisLampu() { return jenisLampu; }
    public int getGaransi() { return garansi; }

    public void setDaya(int daya) { this.daya = daya; }
    public void setJenisLampu(String jenisLampu) { this.jenisLampu = jenisLampu; }
    public void setGaransi(int garansi) { this.garansi = garansi; }
}