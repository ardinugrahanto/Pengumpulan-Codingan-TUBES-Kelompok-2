import java.util.Random;

public class Kota {
    Simpang[][] grid = new Simpang[5][5];
    Mobil[] mobilList;
    Random rand = new Random();

    public Kota() {
        // Buat grid 5x5
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                grid[i][j] = new Simpang();

        // Tambah beberapa mobil (beberapa nakal)
        mobilList = new Mobil[]{
            new Mobil(0, 0, false),
            new Mobil(2, 2, true), // nakal
            new Mobil(4, 4, false),
            new Mobil(0, 4, true)  // nakal
        };

        // Tandai posisi awal mobil
        for (Mobil m : mobilList)
            grid[m.x][m.y].adaMobil = true;
    }

    public void ubahSemuaLampu() {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (rand.nextInt(3) == 0) // ubah beberapa tiap detik
                    grid[i][j].ubahLampu();
    }

    public boolean gerakkanSemuaMobil() {
        for (Mobil m : mobilList) {
            boolean tabrakan = m.gerak(this);
            if (tabrakan) return true;
        }
        return false;
    }

    public void tampilkanKota() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (grid[i][j].adaMobil) System.out.print("🚗 ");
                else if (grid[i][j].lampu.equals("hijau")) System.out.print("🟢 ");
                else System.out.print("🔴 ");
            }
            System.out.println();
        }
    }
}
