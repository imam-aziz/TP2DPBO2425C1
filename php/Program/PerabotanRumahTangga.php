<?php
require_once 'ProdukElektronik.php';

// =============================
// Class PerabotanRumahTangga
// Level 2 (Child dari ProdukElektronik)
// =============================
class PerabotanRumahTangga extends ProdukElektronik {
    private $kategori;   // Kategori produk (misal Interior, Outdoor)
    private $material;   // Material produk (misal Kayu, Plastik)
    private $berat;      // Berat produk (kg)

    public function __construct($namaProduk="", $merek="", $harga=0, $gambar="", $kategori="", $material="", $berat=0.0){
        parent::__construct($namaProduk, $merek, $harga, $gambar);
        $this->kategori = $kategori;
        $this->material = $material;
        $this->berat = $berat;
    }

    // =============================
    // Getter & Setter
    // =============================
    public function getKategori() { return $this->kategori; }
    public function setKategori($kategori) { $this->kategori = $kategori; }

    public function getMaterial() { return $this->material; }
    public function setMaterial($material) { $this->material = $material; }

    public function getBerat() { return $this->berat; }
    public function setBerat($berat) { $this->berat = $berat; }
}
?>