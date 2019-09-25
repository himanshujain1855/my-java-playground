package programs;
import java.util.Scanner;

public class LeapCalculator {

    static boolean checkIsLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        year=sc.nextInt();
        if(checkIsLeapYear(year)){
            System.out.println("yes");
        }
        else System.out.println("No");
    }
}
