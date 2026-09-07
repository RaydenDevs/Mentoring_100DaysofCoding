import java.util.Scanner;

public class EvaluasiMentor1_Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String tipe1 = "Test";
        byte tipe2 = 123;
        short tipe3 = 12345;
        int tipe4 = 1234567890;
        long tipe5 = 1234567890;
        float tipe6 = 1.1f;
        double tipe7 = 1.2;
        char tipe8 = 'A';
        boolean tipe9 = true;

        System.out.println("Sebelum Update:");
        System.out.println(tipe1);
        System.out.println(tipe2);
        System.out.println(tipe3);
        System.out.println(tipe4);
        System.out.println(tipe5);
        System.out.println(tipe6);
        System.out.println(tipe7);
        System.out.println(tipe8);
        System.out.println(tipe9);

        tipe1 = in.nextLine();
        tipe2 = in.nextByte();
        tipe3 = in.nextShort();
        tipe4 = in.nextInt();
        tipe5 = in.nextLong();
        tipe6 = in.nextFloat();
        tipe7 = in.nextDouble();
        tipe8 = in.next().charAt(0);
        tipe9 = in.nextBoolean();

        System.out.println("Setelah Update:");
        System.out.println(tipe1);
        System.out.println(tipe2);
        System.out.println(tipe3);
        System.out.println(tipe4);
        System.out.println(tipe5);
        System.out.println(tipe6);
        System.out.println(tipe7);
        System.out.println(tipe8);
        System.out.println(tipe9);

        in.close();
    }
}
