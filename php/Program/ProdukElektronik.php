<?php
// =============================
// Class ProdukElektronik
// Level 1 (Parent class)
// =============================
class ProdukElektronik {
    private $namaProduk;  // Nama produk elektronik
    private $merek;       // Merek produk
    private $harga;       // Harga produk
    private $gambar;      // File gambar produk

    // =============================
    // Constructor dengan parameter opsional
    // =============================
    public function __construct($namaProduk="", $merek="", $harga=0, $gambar=""){
        $this->namaProduk = $namaProduk;
        $this->merek = $merek;
        $this->harga = $harga;
        $this->gambar = $gambar;
    }

    // =============================
    // Getter & Setter
    // =============================
    public function getNamaProduk() { return $this->namaProduk; }
    public function setNamaProduk($namaProduk) { $this->namaProduk = $namaProduk; }

    public function getMerek() { return $this->merek; }
    public function setMerek($merek) { $this->merek = $merek; }

    public function getHarga() { return $this->harga; }
    public function setHarga($harga) { $this->harga = $harga; }

    public function getGambar() { return $this->gambar; }
    public function setGambar($gambar) { $this->gambar = $gambar; }
}
?>