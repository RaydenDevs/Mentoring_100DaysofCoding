import java.util.Scanner;

public class EvaluasiMentor1_Soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = in.next();
        char hurufPertama = nama.charAt(0);
        System.err.print("Pilihan Huruf\n0 ~ (panjang nama -1): ");
        char hurufKedua = nama.charAt(in.nextInt());
        System.err.print("Panjang nama (-1): ");
        char hurufKetiga = nama.charAt(in.nextInt());

        System.out.println("\nHuruf pertama\t: "+hurufPertama);
        System.out.println("Pilihan huruf\t: "+hurufKedua);
        System.out.println("Huruf terakhir\t: "+hurufKetiga);

        in.close();
    }
}
