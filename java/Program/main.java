// =============================
// Main Program Toko Elektronik
// =============================

// Library bawaan Java
import java.util.*; // untuk Scanner (input) dan List (penyimpanan data)

public class main {

    // =============================
    // Fungsi tampil data dalam bentuk tabel dinamis
    // =============================
    public static void tampil(List<Lampu> data) {
        if (data.isEmpty()) {
            // Jika belum ada data tersimpan
            System.out.println("Belum ada data!");
            return;
        }

        // Header tabel (judul kolom)
        String[] header = {"Nama Produk","Merek","Harga","Kategori",
                           "Material","Berat","Daya","Jenis Lampu","Garansi"};

        // Array untuk menyimpan lebar tiap kolom (dinamis menyesuaikan isi terpanjang)
        int[] width = new int[header.length];
        for (int i=0; i<header.length; i++) width[i] = header[i].length();

        // Cek data untuk menentukan lebar maksimal setiap kolom
        for (Lampu x : data) {
            String[] row = {
                x.getNamaProduk(), x.getMerek(), String.valueOf(x.getHarga()),
                x.getKategori(), x.getMaterial(), String.valueOf(x.getBerat()),
                String.valueOf(x.getDaya()), x.getJenisLampu(), String.valueOf(x.getGaransi())
            };
            for (int i=0; i<row.length; i++) {
                width[i] = Math.max(width[i], row[i].length()); // update lebar kolom
            }
        }

        // Cetak border tabel
        Runnable cetakBorder = () -> {
            System.out.print("+");
            for (int w : width) {
                for (int j=0; j<w+2; j++) System.out.print("-");
                System.out.print("+");
            }
            System.out.println();
        };

        // Cetak header
        cetakBorder.run();
        System.out.print("|");
        for (int i=0; i<header.length; i++) {
            System.out.printf(" %-" + width[i] + "s |", header[i]);
        }
        System.out.println();
        cetakBorder.run();

        // Cetak isi data baris per baris
        for (Lampu x : data) {
            String[] row = {
                x.getNamaProduk(), x.getMerek(), String.valueOf(x.getHarga()),
                x.getKategori(), x.getMaterial(), String.valueOf(x.getBerat()),
                String.valueOf(x.getDaya()), x.getJenisLampu(), String.valueOf(x.getGaransi())
            };
            System.out.print("|");
            for (int i=0; i<row.length; i++) {
                System.out.printf(" %-" + width[i] + "s |", row[i]);
            }
            System.out.println();
        }
        cetakBorder.run();
    }

    // =============================
    // Main method (program utama)
    // =============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Scanner untuk input user
        List<Lampu> data = new ArrayList<>();    // List sebagai tempat penyimpanan data Lampu

        // =============================
        // Tambahkan 5 data awal ke dalam sistem
        // =============================
        data.add(new Lampu("Lampu LED","Philips",50000,"Penerangan","Plastik",0.2f,10,"LED",12));
        data.add(new Lampu("Lampu Gantung","Samsung",200000,"Dekorasi","Besi",1.5f,40,"Halogen",24));
        data.add(new Lampu("Lampu Meja","LG",75000,"Interior","Kayu",0.8f,15,"LED",18));
        data.add(new Lampu("Lampu Tidur","Sony",60000,"Interior","Kaca",0.5f,5,"Fluorescent",12));
        data.add(new Lampu("Lampu Taman","Panasonic",150000,"Outdoor","Aluminium",2.0f,60,"LED",36));

        // =============================
        // Menu interaktif (loop sampai user pilih Exit)
        // =============================
        int pilihan;
        do {
            // Tampilkan menu utama
            System.out.println("\n=== KimElektro, solusi rumah tanggamu! ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Exit");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine(); // konsumsi newline agar tidak lompat input

            if (pilihan == 1) {
                // =============================
                // Input data baru dari user
                // =============================
                System.out.print("Nama Produk : ");
                String nama = sc.nextLine();
                System.out.print("Merek       : ");
                String merek = sc.nextLine();
                System.out.print("Harga       : ");
                int harga = sc.nextInt(); sc.nextLine();

                System.out.print("Kategori    : ");
                String kategori = sc.nextLine();
                System.out.print("Material    : ");
                String material = sc.nextLine();
                System.out.print("Berat (kg)  : ");
                float berat = sc.nextFloat(); sc.nextLine();

                System.out.print("Daya (watt) : ");
                int daya = sc.nextInt(); sc.nextLine();
                System.out.print("Jenis Lampu : ");
                String jenis = sc.nextLine();
                System.out.print("Garansi (bulan) : ");
                int garansi = sc.nextInt(); sc.nextLine();

                // Tambahkan data baru ke dalam list
                data.add(new Lampu(nama, merek, harga, kategori, material, berat, daya, jenis, garansi));
                System.out.println(">>> Data berhasil ditambahkan!");
                tampil(data);
            }
            else if (pilihan == 2) {
                // Tampilkan semua data
                tampil(data);
            }
            else if (pilihan == 3) {
                // Keluar dari program
                System.out.println("Terima kasih telah menggunakan KimElektro!");
            }
            else {
                // Error handling jika input tidak valid
                System.out.println("Opsi Menu yang tersedia hanya 1-3!");
            }
        } while (pilihan != 3);
    }
}