<?php
require_once 'PerabotanRumahTangga.php';

// =============================
// Class Lampu
// Level 3 (Child dari PerabotanRumahTangga)
// =============================
class Lampu extends PerabotanRumahTangga {
    private $daya;        // Daya lampu (Watt)
    private $jenisLampu;  // Jenis lampu (LED, Halogen, dsb)
    private $garansi;     // Garansi (bulan)

    public function __construct($namaProduk="", $merek="", $harga=0, $gambar="",
                                $kategori="", $material="", $berat=0.0,
                                $daya=0, $jenisLampu="", $garansi=0){
        parent::__construct($namaProduk, $merek, $harga, $gambar, $kategori, $material, $berat);
        $this->daya = $daya;
        $this->jenisLampu = $jenisLampu;
        $this->garansi = $garansi;
    }

    // =============================
    // Getter & Setter
    // =============================
    public function getDaya() { return $this->daya; }
    public function setDaya($daya) { $this->daya = $daya; }

    public function getJenisLampu() { return $this->jenisLampu; }
    public function setJenisLampu($jenisLampu) { $this->jenisLampu = $jenisLampu; }

    public function getGaransi() { return $this->garansi; }
    public function setGaransi($garansi) { $this->garansi = $garansi; }
}
?>