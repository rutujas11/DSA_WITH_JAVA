import java.util.*;
public class postfix_to_prefix {
    public static boolean isoperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch == '/' || ch == '^';
    }
    static String postfixToPrefix(String s){
        Stack<String> st = new Stack<>();
        
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isoperator(ch)){
                if(st.size()<2) return "Invalid String";
                String op1 = st.pop();
                String op2 = st.pop();

                String temp = ch+op2+op1;
                st.push(temp);
            }
            else{
                st.push(""+ch);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String postfix = "ABC/-AK/L-*";
        String res = postfixToPrefix(postfix);
        System.out.println("Prefix : "+res);
    }
}
