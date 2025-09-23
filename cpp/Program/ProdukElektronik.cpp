#include <bits/stdc++.h>   // Mengimpor seluruh header standar C++ (praktis, tapi tidak direkomendasikan di production)
using namespace std;

// ===== Class ProdukElektronik =====
// Level paling dasar (base class) yang merepresentasikan produk elektronik umum
class ProdukElektronik {
private:
    string namaProduk;  // Nama produk elektronik (contoh: Lampu LED, TV, dll)
    string merek;       // Nama merek produk (contoh: Philips, LG, Samsung)
    int harga;          // Harga produk dalam satuan rupiah

public:
    // Constructor kosong: bisa dipakai saat membuat objek tanpa langsung mengisi atribut
    ProdukElektronik() {}

    // Constructor dengan parameter: langsung mengisi atribut produk
    ProdukElektronik(string namaProduk, string merek, int harga) {
        this->namaProduk = namaProduk;
        this->merek = merek;
        this->harga = harga;
    }

    // Getter: untuk mengambil nilai atribut (membaca data)
    string getNamaProduk() { return namaProduk; }
    string getMerek() { return merek; }
    int getHarga() { return harga; }

    // Setter: untuk mengubah nilai atribut (menulis data)
    void setNamaProduk(string namaProduk) { this->namaProduk = namaProduk; }
    void setMerek(string merek) { this->merek = merek; }
    void setHarga(int harga) { this->harga = harga; }

    // Destructor: dipanggil otomatis saat objek dihapus (tidak ada aksi khusus di sini)
    ~ProdukElektronik() {}
};