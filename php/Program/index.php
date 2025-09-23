<?php
require_once 'Lampu.php';

// Inisialisasi pesan
$message = "";

// Data hardcode 5 item, akan selalu reset setiap reload
$gambarDefault1 = "assets/Ringlight.jpg";
$gambarDefault2 = "assets/LampuGantung.jpg";
$gambarDefault3 = "assets/LampuMeja.jpg";
$gambarDefault4 = "assets/LampuTidur.jpg";
$gambarDefault5 = "assets/UcupLampuTaman.jpg";
$data = [
    new Lampu("Ring Light","Tiktokers",100000,$gambarDefault1,"Portable","Plastik",0.5,12,"LED",6),
    new Lampu("Lampu Gantung","Samsung",200000,$gambarDefault2,"Dekorasi","Besi",1.5,40,"Halogen",24),
    new Lampu("Lampu Meja","LG",75000,$gambarDefault3,"Interior","Kayu",0.8,15,"LED",18),
    new Lampu("Lampu Tidur","Sony",60000,$gambarDefault4,"Interior","Kaca",0.5,5,"Fluorescent",12),
    new Lampu("Lampu Taman","Panasonic",150000,$gambarDefault5,"Outdoor","Aluminium",2.0,60,"LED",36)
];

// Handle Add sementara hanya untuk page load saat itu
if (isset($_POST['action']) && $_POST['action']=="add") {
    if (isset($_FILES['gambar']) && $_FILES['gambar']['error'] == 0) {
        $targetDir = "assets/";
        if(!is_dir($targetDir)) mkdir($targetDir);
        $targetFile = $targetDir . basename($_FILES['gambar']['name']);
        move_uploaded_file($_FILES['gambar']['tmp_name'], $targetFile);
        $gambarLampu = $targetFile;
    }

    $data[] = new Lampu(
        $_POST['nama'], $_POST['merek'], (int)$_POST['harga'],
        $gambarLampu,
        $_POST['kategori'], $_POST['material'], (float)$_POST['berat'],
        (int)$_POST['daya'], $_POST['jenisLampu'], (int)$_POST['garansi']
    );
    $message = "Data berhasil ditambahkan!";
}
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Toko KimElektro - Data Lampu</title>
    <style>
        body { text-align: center; background-color: #b4f3f8; font-family: Arial, sans-serif; margin:20px; }
        table { margin: 5px; border-collapse: collapse; width: 100%;  }
        th, td { background-color: #E3FDFD;border: 1px solid #444; padding: 8px; text-align: center; }
        th { background-color: #71C9CE; color:white; }
        img { max-width: 80px; max-height: 80px; object-fit: cover; }
        .form-container { max-width: 600px; margin: 20px auto; padding: 15px; background: #E3FDFD; border-radius: 20px; text-align: left; }
        input, select { padding: 6px; margin: 5px 0; width: 100%; box-sizing: border-box; }
        input[type="submit"] { width: auto; background: #71C9CE; color: white; border: none; cursor: pointer; border-radius: 4px; }
    </style>
</head>
<body>
<h2>Toko KimElektro - Data Lampu</h2>

<?php if (!empty($message)): ?>
<p style="color:green;"><?php echo $message; ?></p>
<?php endif; ?>

<!-- Tabel Data Lampu -->
<table>
    <tr>
        <th>Nama Produk</th>
        <th>Merek</th>
        <th>Harga</th>
        <th>Kategori</th>
        <th>Material</th>
        <th>Berat (kg)</th>
        <th>Daya (W)</th>
        <th>Jenis Lampu</th>
        <th>Garansi (bulan)</th>
        <th>Gambar</th>
    </tr>
    <?php foreach ($data as $lampu): ?>
    <tr>
        <td><?php echo htmlspecialchars($lampu->getNamaProduk()); ?></td>
        <td><?php echo htmlspecialchars($lampu->getMerek()); ?></td>
        <td><?php echo number_format($lampu->getHarga()); ?></td>
        <td><?php echo htmlspecialchars($lampu->getKategori()); ?></td>
        <td><?php echo htmlspecialchars($lampu->getMaterial()); ?></td>
        <td><?php echo $lampu->getBerat(); ?></td>
        <td><?php echo $lampu->getDaya(); ?></td>
        <td><?php echo htmlspecialchars($lampu->getJenisLampu()); ?></td>
        <td><?php echo $lampu->getGaransi(); ?></td>
        <td><img src="<?php echo $lampu->getGambar(); ?>" alt="Gambar Lampu"></td>
    </tr>
    <?php endforeach; ?>
</table>
<br>
<!-- Form Add Data -->
<h2>Tambah Data Lampu</h2>
<div class="form-container">
    <form method="post" enctype="multipart/form-data">
        <input type="hidden" name="action" value="add">
        <label>Nama Produk:</label><input type="text" name="nama" required>
        <label>Merek:</label><input type="text" name="merek" required>
        <label>Harga:</label><input type="number" name="harga" required>
        <label>Kategori:</label><input type="text" name="kategori" required>
        <label>Material:</label><input type="text" name="material" required>
        <label>Berat (kg):</label><input type="number" step="0.1" name="berat" required>
        <label>Daya (W):</label><input type="number" name="daya" required>
        <label>Jenis Lampu:</label><input type="text" name="jenisLampu" required>
        <label>Garansi (bulan):</label><input type="number" name="garansi" required>
        <label>Gambar (opsional):</label><input type="file" name="gambar" accept="image/*">
        <input type="submit" value="Tambah Data">
    </form>
</div>

</body>
</html>
