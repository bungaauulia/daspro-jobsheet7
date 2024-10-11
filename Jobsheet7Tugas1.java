import java.util.Scanner;
public class Jobsheet7Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jmlTiket, tiketTerjual = 0, hrgTiket = 50000;
        double total = 0;

        while (true) {
            System.out.print("Jumlah tiket terjual(Ketik 0 untuk keluar): ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0){
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan kembali.");
                continue;
            }

            double hargaTotal = jmlTiket * hrgTiket;
            if (jmlTiket > 4) {
                hargaTotal *= 0.9;
            } else if (jmlTiket > 10) {
                hargaTotal *= 0.85;
            }

            tiketTerjual += jmlTiket;
            total += hargaTotal;

            System.out.println("Total penjualan untuk transaksi ini: Rp " + hargaTotal);
        }

        System.out.println("Total tiket terjual hari ini: " + tiketTerjual);
        System.out.println("Total pendapatan hari ini: Rp " + total);
    }
}