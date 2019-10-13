import java.util.Scanner;

public class DigitCounter{

	public static int countNumberOfDigit(int num){
		int count=0;
        	while (num!=0){
            	num=num/10;
            	count++;
        	}
		return count;	
	}
	
    public static void main(String[] args) {

	int number;
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbr");
        number=sc.nextInt();
	System.out.println(countNumberOfDigit(number));
    }
}
