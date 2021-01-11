import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
         double interest_rate= 1.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money=sc.nextDouble();
        month=sc.nextInt();
        interest_rate = sc.nextDouble();
        double totalInterest_rate = 0;
        for(int i = 0; i < month; i++){
            totalInterest_rate += money * (interest_rate/100)/12 * month;
        }
        System.out.println(totalInterest_rate);
    }
}
