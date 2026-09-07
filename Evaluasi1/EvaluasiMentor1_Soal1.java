import java.util.Scanner;

public class EvaluasiMentor1_Soal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama = in.nextLine();
        String nim = in.nextLine();
        String jurusan = in.nextLine();
        int angkatan = in.nextInt();
        int umur = in.nextInt();
        char gender = in.next().charAt(0);
        double ukt = in.nextDouble();
        boolean aktif = in.nextBoolean();

        System.out.println("===== Data Mahasiswa =====");
        System.out.println("Nama Lengkap\t: "+ nama);
        System.out.println("NIM\t\t: "+nim);
        System.out.println("Jurusan\t\t: "+jurusan);
        System.out.println("Angkatan\t: "+angkatan);
        System.out.println("Umur\t\t: "+umur+" tahun");
        System.out.println("Jenis Kelamin\t: "+gender);
        System.out.println("Biaya UKT\t: "+ukt+" Juta");
        System.out.println("Status Aktif\t: "+aktif);

        in.close();
    }
}