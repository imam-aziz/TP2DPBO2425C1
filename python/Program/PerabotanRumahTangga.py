from ProdukElektronik import ProdukElektronik

# =============================
# Class PerabotanRumahTangga
# Level 2 (Child dari ProdukElektronik)
# =============================
class PerabotanRumahTangga(ProdukElektronik):
    def __init__(self, nama_produk="", merek="", harga=0,
                 kategori="", material="", berat=0.0):
        """
        Inisialisasi atribut perabotan rumah tangga
        Memanggil constructor parent
        """
        super().__init__(nama_produk, merek, harga)  # panggil constructor parent
        self.kategori = kategori
        self.material = material
        self.berat = berat

    # Getter dan Setter
    def get_kategori(self):
        return self.kategori

    def set_kategori(self, kategori):
        self.kategori = kategori

    def get_material(self):
        return self.material

    def set_material(self, material):
        self.material = material

    def get_berat(self):
        return self.berat

    def set_berat(self, berat):
        self.berat = berat