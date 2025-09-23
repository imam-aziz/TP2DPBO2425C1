// =============================
// Class PerabotanRumahTangga
// Level 2 (Child dari ProdukElektronik)
// =============================

public class PerabotanRumahTangga extends ProdukElektronik {
    // =============================
    // Atribut tambahan khusus perabotan rumah tangga
    // =============================
    private String kategori;  // kategori produk (misalnya Interior, Outdoor)
    private String material;  // bahan dasar produk (Kayu, Besi, Plastik, dll)
    private float berat;      // berat produk dalam kg

    // =============================
    // Constructor kosong (default)
    // =============================
    public PerabotanRumahTangga() {}

    // =============================
    // Constructor dengan parameter
    // Memanggil parent constructor (super) untuk atribut dasar
    // =============================
    public PerabotanRumahTangga(String namaProduk, String merek, int harga,
                                String kategori, String material, float berat) {
        super(namaProduk, merek, harga); // panggil constructor parent
        this.kategori = kategori;
        this.material = material;
        this.berat = berat;
    }

    // =============================
    // Getter dan Setter
    // =============================
    public String getKategori() { return kategori; }
    public String getMaterial() { return material; }
    public float getBerat() { return berat; }

    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setMaterial(String material) { this.material = material; }
    public void setBerat(float berat) { this.berat = berat; }
}
