package programs;
import java.util.Scanner;

public class LeapCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("Yes");
            }
        }
        else{
            System.out.println("No");
        }
    }
}
