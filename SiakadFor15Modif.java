import java.util.Scanner;
public class SiakadFor15Modif {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nilai, terendah = 100, tertinggi = 0;
        int mhsLulus = 0, mhsTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                mhsLulus++;
            } else {
                mhsTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mhsLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + mhsTidakLulus);
    }
}