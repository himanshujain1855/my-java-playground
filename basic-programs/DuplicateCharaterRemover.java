import java.util.*;
public class DuplicateCharaterRemover{
	static String removeDups(String s){
		if(s.length()==1) return s;
		if(s.substring(1).contains(s.substring(0,1))) return removeDups(s.substring(1));
		else return removeDups(s.substring(0,1)) + removeDups(s.substring(1));
	}
    public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);

		String s="";
		if(scanner.hasNextLine()){
			s=scanner.nextLine();
		}
		
		System.out.print(removeDups(s));

    }
}
