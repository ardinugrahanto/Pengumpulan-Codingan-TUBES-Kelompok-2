import java.util.Random;

public class Mobil {
    int x, y;
    boolean nakal; // true = suka nerobos
    Random rand = new Random();

    public Mobil(int x, int y, boolean nakal) {
        this.x = x;
        this.y = y;
        this.nakal = nakal;
    }

    // Menggerakkan mobil 1 langkah sesuai lampu
    public boolean gerak(Kota k) {
        Simpang[][] g = k.grid;
        int nx = x, ny = y; // posisi baru sementara

        // Pilih arah acak (atas, bawah, kiri, kanan)
        int[][] arah = {
            {x - 1, y}, {x + 1, y},
            {x, y - 1}, {x, y + 1}
        };
        int[] arahDipilih = arah[rand.nextInt(4)];

        nx = arahDipilih[0];
        ny = arahDipilih[1];

        // Cek batas peta
        if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) return false;

        Simpang next = g[nx][ny];

        // Kalau simpang merah dan mobil patuh, jangan jalan
        if (next.lampu.equals("merah") && !nakal) return false;

        // Kalau simpang merah dan mobil nakal nerobos maka tabrakan
        if (next.lampu.equals("merah") && nakal) {
            if (next.adaMobil) {
                System.out.println("💥 Tabrakan! Mobil di (" + x + "," + y + ") nerobos lampu merah dan menabrak mobil di (" + nx + "," + ny + ")");
                return true;
            }
        }

        // Kalau simpang hijau tapi sudah ada mobil maka tabrakan juga
        if (next.lampu.equals("hijau") && next.adaMobil) {
            System.out.println("💥 Tabrakan di simpang (" + nx + "," + ny + ") karena dua mobil masuk bersamaan!");
            return true;
        }

        // Update posisi
        g[x][y].adaMobil = false;
        x = nx;
        y = ny;
        g[x][y].adaMobil = true;

        return false;
    }
}
