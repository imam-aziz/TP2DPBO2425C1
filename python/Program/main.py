# =============================
# Main Program Toko Elektronik
# =============================

from Lampu import Lampu

# =============================
# Fungsi tampil data dalam bentuk tabel dinamis
# =============================
def tampil(data):
    if not data:
        print("Belum ada data!")
        return

    # Header tabel
    header = ["Nama Produk","Merek","Harga","Kategori",
              "Material","Berat","Daya","Jenis Lampu","Garansi"]

    # Hitung lebar kolom (dinamis)
    width = [len(h) for h in header]
    for x in data:
        row = [
            x.get_nama_produk(),
            x.get_merek(),
            str(x.get_harga()),
            x.get_kategori(),
            x.get_material(),
            str(x.get_berat()),
            str(x.get_daya()),
            x.get_jenis_lampu(),
            str(x.get_garansi())
        ]
        width = [max(width[i], len(row[i])) for i in range(len(row))]

    # Fungsi cetak border tabel
    def cetak_border():
        print("+", end="")
        for w in width:
            print("-" * (w + 2), end="+")
        print()

    # Cetak header
    cetak_border()
    print("|", end="")
    for i, h in enumerate(header):
        print(f" {h:<{width[i]}} |", end="")
    print()
    cetak_border()

    # Cetak isi data
    for x in data:
        row = [
            x.get_nama_produk(),
            x.get_merek(),
            str(x.get_harga()),
            x.get_kategori(),
            x.get_material(),
            str(x.get_berat()),
            str(x.get_daya()),
            x.get_jenis_lampu(),
            str(x.get_garansi())
        ]
        print("|", end="")
        for i, r in enumerate(row):
            print(f" {r:<{width[i]}} |", end="")
        print()
    cetak_border()


# =============================
# Program utama
# =============================
def main():
    data = []

    # Tambahkan 5 data awal
    data.append(Lampu("Lampu LED","Philips",50000,"Penerangan","Plastik",0.2,10,"LED",12))
    data.append(Lampu("Lampu Gantung","Samsung",200000,"Dekorasi","Besi",1.5,40,"Halogen",24))
    data.append(Lampu("Lampu Meja","LG",75000,"Interior","Kayu",0.8,15,"LED",18))
    data.append(Lampu("Lampu Tidur","Sony",60000,"Interior","Kaca",0.5,5,"Fluorescent",12))
    data.append(Lampu("Lampu Taman","Panasonic",150000,"Outdoor","Aluminium",2.0,60,"LED",36))

    while True:
        print("\n=== KimElektro, solusi rumah tanggamu! ===")
        print("1. Tambah Data")
        print("2. Tampil Data")
        print("3. Exit")
        try:
            pilihan = int(input("Pilih: "))
        except ValueError:
            print("Input harus angka!")
            continue

        if pilihan == 1:
            # Input data baru
            nama = input("Nama Produk: ")
            merek = input("Merek: ")
            try:
                harga = int(input("Harga: "))
            except ValueError:
                print("Harga harus angka!")
                continue
            kategori = input("Kategori: ")
            material = input("Material: ")
            try:
                berat = float(input("Berat (kg): "))
            except ValueError:
                print("Berat harus angka!")
                continue
            try:
                daya = int(input("Daya (watt): "))
            except ValueError:
                print("Daya harus angka!")
                continue
            jenis = input("Jenis Lampu: ")
            try:
                garansi = int(input("Garansi (bulan): "))
            except ValueError:
                print("Garansi harus angka!")
                continue

            # Tambahkan ke list
            data.append(Lampu(nama, merek, harga, kategori, material, berat, daya, jenis, garansi))
            tampil(data)
            print(">>> Data berhasil ditambahkan!")

        elif pilihan == 2:
            # Tampilkan semua data
            tampil(data)

        elif pilihan == 3:
            print("Terima kasih telah menggunakan KimElektro!")
            break

        else:
            print("Opsi Menu yang tersedia hanya 1-3!")


if __name__ == "__main__":
    main()