import java.util.Scanner;

public class StringReverse {
    static class Items{
        int tos=-1;

        char stack[]=new char[100];

        void push(char c){
            stack[++tos]=c;
        }

        char pop(){
            if(tos==-1){
                return '0';
            }
            else{
                char c=stack[tos];
                tos--;
                return c;
            }
        }
    }

    static String StringReverser(String s){
        Items item=new Items();
        int i;
        for(i=0;i<s.length();i++){
            item.push(s.charAt(i));
        }
        s="";
        char c='j';
        while (c!='0'){
            c=item.pop();
            if(c!='0') s=s+String.valueOf(c);
        }
        return s;
    }

    public static void main(String[] args) {
	String string;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String");
	string = sc.nextLine();
        System.out.println(StringReverser(string));
    }
}
