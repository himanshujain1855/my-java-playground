public class BalancedParan {

   public static class Stack {
        int tos = -1;
        char stack[] = new char[100];

        void push(char c) {
            stack[++tos] = c;
        }

        char pop() {
            if (tos == -1) {
                return '\0';
            } else {
                char c = stack[tos];
                tos--;
                return c;
            }
        }

        boolean isEmpty() {
            if (tos == -1) return true;
            return false;
        }
    }

   public static boolean isMatchingPair(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        else if (c1 == '{' && c2 == '}') return true;
        else if (c1 == '[' && c2 == ']') return true;
        return false;
    }

    public static boolean areBalancedParanthesis(String string) {
        Stack s = new Stack();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == '[' || string.charAt(i) == '{') {
                s.push(string.charAt(i));
            }

            if (string.charAt(i) == ')' || string.charAt(i) == ']' || string.charAt(i) == '}') {

                if (s.isEmpty()) return false;
                else if (!isMatchingPair(s.pop(), string.charAt(i))) return false;
            }
        }

        if (s.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String string="{{[[(())]]}}";
        System.out.print(areBalancedParanthesis(string));
    }
}
