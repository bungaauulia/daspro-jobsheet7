import java.util.Scanner;
public class Jobsheet7Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasiParkir, tarifMobil = 3000, tarifMotor = 2000, tarifTetap = 12500;
        double totalBayar = 0;

        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }
            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                continue;
            }
            System.out.println("Masukkan durasi parkir dalam jam: ");
            durasiParkir = sc.nextInt();

            if (durasiParkir < 0) {
                System.out.println("Durasi parkir tidak valid. Silakan coba lagi.");
                continue;
            }
            double biayaParkir = 0;
            if (durasiParkir > 5) {
                // Jika parkir lebih dari 5 jam, tarif tetap berlaku
                biayaParkir = tarifTetap;
            } else {
                if (jenisKendaraan == 1) {  // Mobil
                    biayaParkir = durasiParkir * tarifMobil;
                } else if (jenisKendaraan == 2) {  // Motor
                    biayaParkir = durasiParkir * tarifMotor;
                }
            }
            totalBayar += biayaParkir;
            System.out.println("Biaya parkir untuk kendaraan ini: Rp " + biayaParkir);
        }
        System.out.println("Total pembayaran parkir: Rp " + totalBayar);
    }
}
