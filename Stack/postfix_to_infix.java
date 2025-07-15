import java.util.*;
public class postfix_to_infix {
    public static boolean isoperator(char ch){
        return ch=='+'|| ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    static String postfixToInfix(String s){
        Stack<String> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isoperator(ch)){
                if(st.size()<2) return "Invalid String";
                String op1 = st.pop();
                String op2 = st.pop();
                String newstr = op2+ch+op1;
                st.push("("+newstr+")");
            }
            else{
                st.push(""+ch);
            }
        }
        return st.pop();
    }
    public static void main(String args[]){
        String postfix = "abc+*d/";
        String res = postfixToInfix(postfix);
        System.out.println("Infix : "+res);
    }
}
