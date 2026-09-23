public class PasswordBruteForce {
    public static void main(String[] args){
        String password = "Rayhan-PembuatSoal-ICL2026"; //anggaplah password pengguna yang ingin diretas
        String getPassword = ""; // variabel password tebakan

        // pengurutan tiap simbol dalam string password (0 ~ panjang password)
        for (int i = 0; i < password.length(); i++) {
            // pengecekan kesamaan simbol dari 0 ~ Character.MAX_VALUE dalam bentuk integer
            for (int j = 0; j <= Character.MAX_VALUE; j++) {
                // kondisi kalau simbolnya benar maka j dikonversi ke char agar berubah jadi simbol dan dimasukkan ke string
                if ((int) password.charAt(i) == j) getPassword += (char) j; // Konversi ASCII (Simbol)
            }
        }
        System.out.println("Password Ditemukan: "+getPassword); // menampilkan hasil
    }
}
