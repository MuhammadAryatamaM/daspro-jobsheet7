import java.util.Scanner;
public class TiketBioskop15 {
    
    public static void main(String[] args) {
      
        Scanner input15 = new Scanner(System.in);

        int jmlTransaksi, totalBeliTiket, i;
        double jmlTiket, hargaPerTiket, totalHargaTiket, bayarTiket, diskon;

        totalBeliTiket = 0;
        hargaPerTiket = 50000;
        totalHargaTiket = 0;
        i = 1;

        System.out.print("Masukkan jumlah transaksi tiket yang terjadi hari ini: ");
        jmlTransaksi = input15.nextInt();

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli pada transaksi ke-" + i + ": ");
            jmlTiket = input15.nextInt();

            if (jmlTiket > 4 && jmlTiket <= 10) {
                diskon = 0.9;
            } else if (jmlTiket > 10) {
                diskon = 0.85;
            } else if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, mohon input ulang.");
                continue;
            } else {
                diskon = 1;
            }

            bayarTiket = jmlTiket * hargaPerTiket * diskon;
            totalBeliTiket += jmlTiket;
            totalHargaTiket += bayarTiket;
            i++;

        } while (i <= jmlTransaksi);

        System.out.println("Hari ini telah terjual " + totalBeliTiket + " tiket dengan penjualan total sebanyak Rp" + totalHargaTiket);
    }
}