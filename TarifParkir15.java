import java.util.Scanner;
public class TarifParkir15 {
    
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int jenis, durasi, total;

        total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (mobil = 1, motor = 2, 0 untuk keluar): ");
            jenis = input15.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Berapa lama Anda parkir? (jam): ");
                durasi = input15.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Jenis tidak ada di sistem, mohon input ulang.");
                continue;
            } else {
                System.out.print("Program diberhentikan");
                break;
            }

            System.out.println("Tarif parkir total sebanyak Rp" + total);
        }
    }
}