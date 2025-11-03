public class Simpang {
    boolean adaMobil;
    String lampu; // "hijau" atau "merah"

    public Simpang() {
        adaMobil = false;
        lampu = Math.random() > 0.5 ? "hijau" : "merah";
    }

    public void ubahLampu() {
        lampu = lampu.equals("hijau") ? "merah" : "hijau";
    }
}
