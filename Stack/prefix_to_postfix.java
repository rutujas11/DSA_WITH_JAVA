import java.util.*;
public class prefix_to_postfix {
    public static boolean isoperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch == '/' || ch == '^';
    }
    public static void prefixToPostfix(String s){
        Stack<String> st = new Stack<>();

        for(int i = s.length()-1;i>=0;i--){
            if(isoperator(s.charAt(i))){
                if(st.size()<2) System.out.println("Invalid String");

                String op1 = st.pop();
                String op2 = st.pop();

                String newstr = op1+op2+s.charAt(i);
                st.push(newstr);
            }
            else{
                st.push(""+s.charAt(i));
            }
        }
        System.out.println("Postfix : "+st.pop());
    }
    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        prefixToPostfix(prefix);
    }
}
