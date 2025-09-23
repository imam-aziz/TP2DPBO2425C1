# =============================
# Class ProdukElektronik
# Level 1 (Parent class)
# =============================
class ProdukElektronik:
    # Constructor
    def __init__(self, nama_produk="", merek="", harga=0):
        """
        Inisialisasi atribut dasar produk elektronik
        :param nama_produk: nama produk
        :param merek: merek produk
        :param harga: harga produk
        """
        self.nama_produk = nama_produk
        self.merek = merek
        self.harga = harga

    # =============================
    # Getter dan Setter
    # =============================
    def get_nama_produk(self):
        return self.nama_produk

    def set_nama_produk(self, nama_produk):
        self.nama_produk = nama_produk

    def get_merek(self):
        return self.merek

    def set_merek(self, merek):
        self.merek = merek

    def get_harga(self):
        return self.harga

    def set_harga(self, harga):
        self.harga = harga