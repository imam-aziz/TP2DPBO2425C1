from PerabotanRumahTangga import PerabotanRumahTangga

# =============================
# Class Lampu
# Level 3 (Child dari PerabotanRumahTangga)
# =============================
class Lampu(PerabotanRumahTangga):
    def __init__(self, nama_produk="", merek="", harga=0,
                 kategori="", material="", berat=0.0,
                 daya=0, jenis_lampu="", garansi=0):
        """
        Inisialisasi atribut lampu
        Memanggil constructor parent
        """
        super().__init__(nama_produk, merek, harga, kategori, material, berat)
        self.daya = daya
        self.jenis_lampu = jenis_lampu
        self.garansi = garansi

    # Getter dan Setter
    def get_daya(self):
        return self.daya

    def set_daya(self, daya):
        self.daya = daya

    def get_jenis_lampu(self):
        return self.jenis_lampu

    def set_jenis_lampu(self, jenis_lampu):
        self.jenis_lampu = jenis_lampu

    def get_garansi(self):
        return self.garansi

    def set_garansi(self, garansi):
        self.garansi = garansi