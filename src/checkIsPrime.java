import java.util.Scanner;

public class checkIsPrime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println("is not a prime");
        }else {
            int a = 2;
            boolean check= true;
            while (a<Math.sqrt(number)){
            if (number%a==0) {
                check = false;
                break;
            }
            a++;
            }
            if (check){
                System.out.println("is a prime");
            }else {
                System.out.println("is not a prime");
            }
        }

    }
}
