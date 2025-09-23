#include <bits/stdc++.h>             // Library standar
#include "PerabotanRumahTangga.cpp"  // Include parent (PerabotanRumahTangga)

// ===== Class Lampu =====
// Turunan dari PerabotanRumahTangga (multilevel inheritance step 2)
// Spesifik untuk produk lampu
class Lampu : public PerabotanRumahTangga {
private:
    int daya;           // Daya listrik lampu dalam Watt
    string jenisLampu;  // Jenis lampu (contoh: LED, Halogen, Fluorescent)
    int garansi;        // Lama garansi (dalam bulan)

public:
    // Constructor kosong
    Lampu() {}

    // Constructor dengan parameter (memanggil constructor parent)
    Lampu(string namaProduk, string merek, int harga,
          string kategori, string material, float berat,
          int daya, string jenisLampu, int garansi)
        : PerabotanRumahTangga(namaProduk, merek, harga, kategori, material, berat) {
        this->daya = daya;
        this->jenisLampu = jenisLampu;
        this->garansi = garansi;
    }

    // Getter
    int getDaya() { return daya; }
    string getJenisLampu() { return jenisLampu; }
    int getGaransi() { return garansi; }

    // Setter
    void setDaya(int daya) { this->daya = daya; }
    void setJenisLampu(string jenisLampu) { this->jenisLampu = jenisLampu; }
    void setGaransi(int garansi) { this->garansi = garansi; }

    // Destructor
    ~Lampu() {}
};