import java.util.Scanner;
public class PalindromeChecker {

    static boolean check(String s){
        String newString="";
        int i;
        for(i=(s.length()-1);i>=0;i--){
            newString+=s.charAt(i);
        }
        return s.equals(newString);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(check(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
