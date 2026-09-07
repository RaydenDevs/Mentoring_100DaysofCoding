import java.util.Scanner;

public class EvaluasiMentor1_Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        // in.nextLine(); //Buffer

        String C = in.nextLine();
        String D = in.nextLine();

        char E = in.next().charAt(0);
        char F = in.next().charAt(0);

        System.out.println("Sebelum Ditukar:");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        System.out.println("E: "+E);
        System.out.println("F: "+F);

        int cacheInt = A;
        A = B;
        B = cacheInt;

        String cacheString = C;
        C = D;
        D = cacheString;

        char cacheChar = E;
        E = F;
        F = cacheChar;

        System.out.println("Sesudah Ditukar:");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        System.out.println("E: "+E);
        System.out.println("F: "+F);

        in.close();
    }
}
