// Lampu.java
// Grandchild class: PerabotanRumahTangga -> Lampu
public class Lampu extends PerabotanRumahTangga {
    // atribut khas lampu
    private int daya;
    private String jenisLampu;
    private int garansi; // bulan

    public Lampu() {}

    public Lampu(String namaProduk, String merek, int harga,
                 String kategori, String material, float berat,
                 int daya, String jenisLampu, int garansi) {
        super(namaProduk, merek, harga, kategori, material, berat);
        this.daya = daya;
        this.jenisLampu = jenisLampu;
        this.garansi = garansi;
    }

    // getter / setter
    public int getDaya() { return daya; }
    public void setDaya(int daya) { this.daya = daya; }

    public String getJenisLampu() { return jenisLampu; }
    public void setJenisLampu(String jenisLampu) { this.jenisLampu = jenisLampu; }

    public int getGaransi() { return garansi; }
    public void setGaransi(int garansi) { this.garansi = garansi; }
}