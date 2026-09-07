import java.util.Scanner;

public class EvaluasiMentor1_Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input1: ");
        float input1 = in.nextFloat();
        System.out.print("Input2: ");
        double input2 = in.nextDouble();

        System.out.println("=========== OUTPUT ============");
        System.out.printf("%.0f | %.1f | %.3f | %f\n",input1,input1,input1,input1);
        System.out.printf("%.0f | %.2f | %.4f | %f\n",input2,input2,input2,input2);

        in.close();
    }
}
