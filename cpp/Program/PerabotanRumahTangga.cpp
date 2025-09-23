#include <bits/stdc++.h>       // Library standar C++
#include "ProdukElektronik.cpp" // Include class induk (ProdukElektronik)
using namespace std;

// ===== Class PerabotanRumahTangga =====
// Turunan dari ProdukElektronik (multilevel inheritance step 1)
// Menambahkan atribut khusus perabotan rumah tangga
class PerabotanRumahTangga : public ProdukElektronik {
private:
    string kategori;  // Kategori perabotan (contoh: Interior, Outdoor, Dekorasi)
    string material;  // Bahan material utama (contoh: Kayu, Plastik, Besi, Kaca)
    float berat;      // Berat produk dalam kilogram

public:
    // Constructor kosong
    PerabotanRumahTangga() {}

    // Constructor dengan parameter (memanggil constructor ProdukElektronik juga)
    PerabotanRumahTangga(string namaProduk, string merek, int harga,
                         string kategori, string material, float berat)
        : ProdukElektronik(namaProduk, merek, harga) {
        this->kategori = kategori;
        this->material = material;
        this->berat = berat;
    }

    // Getter
    string getKategori() { return kategori; }
    string getMaterial() { return material; }
    float getBerat() { return berat; }

    // Setter
    void setKategori(string kategori) { this->kategori = kategori; }
    void setMaterial(string material) { this->material = material; }
    void setBerat(float berat) { this->berat = berat; }

    // Destructor
    ~PerabotanRumahTangga() {}
};