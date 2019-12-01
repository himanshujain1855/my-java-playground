/**Below Program prints prime numbers from 0 to given input by user!
 * What is  prime number?
 * Ans:-A prime is a positive integer number,it divided by only 1 and itself only!
 * Why one(1) is not a prime number?
 */


import java.util.Scanner;

public class CheckPrimeNumber {

	static boolean isPrime(int number){
		int i=2;

		for(i=2;i<number;i++){
			if(number%i==0) break;
		}

		if(i==number) return true;
		else return false;

	}

        /**We need to check if loop is ended or broken due to inner if condition false
         * Hence if i==number then loop is ended
         * else loop is broken by inner if condition false
         */


    public static void main(String[] args) {

        int number;
        Scanner sc=new Scanner(System.in);

   	System.out.println("Enter numbr");
        number=sc.nextInt();

	if(isPrime(number)) System.out.println("Yes");
	else System.out.println("No");

        sc.close();
	
	}

}
