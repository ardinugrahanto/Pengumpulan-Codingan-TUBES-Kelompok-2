# STUDI KASUS 2 SIMULASI SISTEM LALU LINTAS CERDAS (TRAFFIC GRID)

Kelompok 2

Annisa Rohiimah Sufriyani	(G1A025013) 

Tryanda Finoza Dewantara  (G1A025017) 

Ardi Nugrahanto	      		(G1A025023) 

Royana Dwi Rohmah	      	(G1A025045) 

---
# Overview Sistem

Studi kasus ini membahas tentang pembuatan simulasi sistem lalu lintas cerdas dalam bentuk grid 5x5 yang merepresentasikan kota kecil dengan persimpangan jalan. Setiap simpang di dalam grid memiliki tiga elemen penting: lampu lalu lintas, mobil yang bisa bergerak, dan status posisi yang menunjukkan apakah simpang tersebut sedang kosong atau ditempati mobil. Tujuan utama simulasi ini adalah agar mobil dapat bergerak sesuai aturan lalu lintas — hanya melaju ketika lampu berwarna hijau dan berhenti jika lampu berwarna merah — sambil menghindari terjadinya tabrakan. Untuk membangun sistem ini, program dibagi menjadi empat kelas utama, yaitu `Simpang`, `Mobil`, `Kota`, dan `MainTraffic`. Kelas `Simpang` bertugas mengatur kondisi tiap persimpangan, termasuk status lampu yang dapat berganti antara merah dan hijau. Kelas `Mobil` menggambarkan perilaku kendaraan, mulai dari menentukan arah gerak hingga memeriksa kemungkinan tabrakan dengan mobil lain. Kelas `Kota` berperan sebagai wadah yang memuat seluruh simpang dan mengatur pembaruan kondisi lalu lintas secara keseluruhan, seperti memperbarui lampu dan menampilkan kondisi kota dalam bentuk visual grid. Terakhir, kelas `MainTraffic` menjadi pusat kontrol simulasi yang menjalankan perulangan waktu secara real-time, di mana setiap detik program akan memperbarui status lampu, menggerakkan mobil, serta menampilkan kondisi kota terkini. Simulasi ini memberikan gambaran sederhana tentang bagaimana sistem lalu lintas otomatis bekerja dengan logika dasar, menyeimbangkan pergerakan kendaraan dan pengaturan lampu agar tidak terjadi tabrakan di jalan.
