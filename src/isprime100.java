import java.util.Scanner;

public class isprime100 {
    public static void main(String[] args) {
      int N=2;
        for (int count = 0; count <100; N++){
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                count++;
            }
        }
    }
}
