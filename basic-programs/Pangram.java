package programs;

public class Pangram {
    char list[]={'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};

    int search(char c,char charList[]){
        int position,i;
        for(i=0;i<charList.length;i++){
            if(c==charList[i]) break;
        }
        return i;
    }

    static boolean check(String s){
        int markList[]=new int[26];
        int i;
        boolean flag=true;
        Pangram p=new Pangram();

        for(i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                markList[p.search(s.charAt(i),p.list)]=1;
            }
        }

        for(i=0;i<25;i++){
            if(markList[i]==1) continue;
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        if(check("the quick brown fox jumps over a lazy dog")) System.out.print("yes");
        else System.out.print("No");
    }
}
