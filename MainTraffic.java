public class MainTraffic {
    public static void main(String[] args) throws InterruptedException {
        Kota kota = new Kota();

        for (int detik = 1; detik <= 20; detik++) {
            System.out.println("\nDetik ke-" + detik);
            kota.ubahSemuaLampu();
            boolean tabrakan = kota.gerakkanSemuaMobil();
            kota.tampilkanKota();

            if (tabrakan) {
                System.out.println("🚨 Simulasi dihentikan karena tabrakan!");
                break;
            }

            Thread.sleep(1000);
        }
    }
}
