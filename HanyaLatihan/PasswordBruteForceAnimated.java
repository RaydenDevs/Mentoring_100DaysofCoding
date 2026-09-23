public class PasswordBruteForceAnimated {
    public static void main(String[] args) throws InterruptedException{
        String password = "WhenYhJagoNgoding";
        String getPassword = "";

        if (password.isEmpty()) {
            System.out.println("Password tidak boleh kosong!");
            return;
        }
        if (!getPassword.isEmpty()) {
            System.out.println("Variabel penangkap password sebaiknya kosong!");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            int targetChar = password.charAt(i);
            int maxSearchLength = (targetChar <= 126) ? 126 : Character.MAX_VALUE;
            for (int j = 32; j <= maxSearchLength; j++) {
                System.out.print("\rScanning: "+getPassword+(char)j);
                if ((int) password.charAt(i) == j) {
                    getPassword += (char)j;
                    break;
                }
                Wait(10);
            }
        }
        System.out.println("\nPassword Ditemukan!\nPassword: "+getPassword);
    }

    static void Wait(int ms) throws InterruptedException{
        Thread.sleep(ms);
        System.out.flush();
    }
}
