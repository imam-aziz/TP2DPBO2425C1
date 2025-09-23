#include <bits/stdc++.h>  // Library standar
using namespace std;
#include "Lampu.cpp"      // Include class paling bawah (Lampu) agar otomatis ikut semua parent

// ===== Fungsi tampil =====
// Menampilkan seluruh data dalam bentuk tabel dinamis (otomatis menyesuaikan lebar kolom)
void tampil(vector<Lampu> &data) {
    if (data.empty()) {
        cout << "Belum ada data!\n";
        return;
    }

    // Header tabel
    vector<string> header = {
        "Nama Produk","Merek","Harga","Kategori","Material","Berat","Daya","Jenis Lampu","Garansi"
    };

    // Menentukan lebar kolom (supaya rapi)
    vector<int> width(header.size(), 0);
    for (size_t i=0; i<header.size(); i++) width[i] = header[i].size();

    // Hitung lebar kolom berdasarkan isi data
    for (auto &x : data) {
        vector<string> row = {
            x.getNamaProduk(), x.getMerek(), to_string(x.getHarga()),
            x.getKategori(), x.getMaterial(), to_string(x.getBerat()),
            to_string(x.getDaya()), x.getJenisLampu(), to_string(x.getGaransi())
        };
        for (size_t i=0; i<row.size(); i++) {
            width[i] = max(width[i], (int)row[i].size());
        }
    }

    // Fungsi cetak border (garis tabel)
    auto cetakBorder = [&]() {
        cout << "+";
        for (size_t i=0; i<width.size(); i++) {
            cout << string(width[i]+2, '-') << "+";
        }
        cout << "\n";
    };

    // Cetak header tabel
    cetakBorder();
    cout << "|";
    for (size_t i=0; i<header.size(); i++) {
        cout << " " << setw(width[i]) << left << header[i] << " |";
    }
    cout << "\n";
    cetakBorder();

    // Cetak isi data
    for (auto &x : data) {
        vector<string> row = {
            x.getNamaProduk(), x.getMerek(), to_string(x.getHarga()),
            x.getKategori(), x.getMaterial(), to_string(x.getBerat()),
            to_string(x.getDaya()), x.getJenisLampu(), to_string(x.getGaransi())
        };
        cout << "|";
        for (size_t i=0; i<row.size(); i++) {
            cout << " " << setw(width[i]) << left << row[i] << " |";
        }
        cout << "\n";
    }
    cetakBorder();
}

// ===== Fungsi pressEnter =====
// Menunggu user menekan Enter agar tidak langsung lanjut
void pressEnter() {
    cout << "Tekan Enter untuk lanjut...";
    cin.ignore();
    cin.get();
}

// ===== MAIN PROGRAM =====
int main() {
    vector<Lampu> data;  // Vector untuk menampung banyak objek Lampu

    // 5 Data awal (default data sebelum input user)
    data.push_back(Lampu("Lampu LED","Philips",50000,"Penerangan","Plastik",0.2,10,"LED",12));
    data.push_back(Lampu("Lampu Gantung","Samsung",200000,"Dekorasi","Besi",1.5,40,"Halogen",24));
    data.push_back(Lampu("Lampu Meja","LG",75000,"Interior","Kayu",0.8,15,"LED",18));
    data.push_back(Lampu("Lampu Tidur","Sony",60000,"Interior","Kaca",0.5,5,"Fluorescent",12));
    data.push_back(Lampu("Lampu Taman","Panasonic",150000,"Outdoor","Aluminium",2.0,60,"LED",36));

    int pilihan;
    do {
        system("cls"); // Membersihkan layar (khusus Windows)
        cout << "=== KimElektro, solusi rumah tanggamu! ===" << endl;
        cout << "1. Tambah Data\n";
        cout << "2. Tampil Data\n";
        cout << "3. Exit\n";
        cout << "Pilih: ";
        cin >> pilihan;

        if (pilihan == 1) {
            // Input data baru dari user
            string nama, merek, kategori, material, jenisLampu;
            int harga, daya, garansi;
            float berat;

            cout << "Nama Produk   : "; cin >> ws; getline(cin, nama);
            cout << "Merek         : "; getline(cin, merek);
            cout << "Harga         : "; cin >> harga;
            cout << "Kategori      : "; cin >> ws; getline(cin, kategori);
            cout << "Material      : "; getline(cin, material);
            cout << "Berat (kg)    : "; cin >> berat;
            cout << "Daya (W)      : "; cin >> daya;
            cout << "Jenis Lampu   : "; cin >> ws; getline(cin, jenisLampu);
            cout << "Garansi (bln) : "; cin >> garansi;

            // Masukkan ke vector
            data.push_back(Lampu(nama,merek,harga,kategori,material,berat,daya,jenisLampu,garansi));
            tampil(data); // tampilkan setelah ditambahkan
            cout << "Data berhasil ditambahkan!\n";

            pressEnter();
        }
        else if (pilihan == 2) {
            // Tampilkan semua data
            tampil(data);
            pressEnter();
        }
        else if (pilihan == 3) {
            // Keluar dari program
            cout << "Terimakasih telah berkunjung di KimElektro!\n";
        }
        else {
            // Input tidak valid
            cout << "Opsi Menu yang tersedia hanya 1-3!\n";
            pressEnter();
        }

    } while (pilihan != 3);  // Ulangi sampai user pilih exit

    return 0;
}