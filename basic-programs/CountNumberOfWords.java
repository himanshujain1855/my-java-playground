import java.util.Scanner;

public class CountNumberOfWords {
	
	public static int countNumberWords(String line){
	int count=0; // counter
        String temp=line.trim(); // removes whitespaces from begin and end.
        String words[];
        words=temp.split(" ");

        for (String s:words
        ) {
            if(s.equals(""))continue;
            count++;
        }
	return count;
	}

    public static void main(String args[] ) throws Exception {
	String line;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Antthing");
        line=sc.nextLine();
        System.out.print(countNumberWords(line));
    }
}
