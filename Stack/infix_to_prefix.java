import java.util.*;
public class infix_to_prefix {
    static int prec(char c) {
        if(c == '^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1;
    }
    static String infixToPostfix(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='('){
                    postfix.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && prec(ch) <= prec(st.peek())){
                    postfix.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            postfix.append(st.pop());
        }
        return postfix.toString();
    }


    public static String infixToPrefix(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();

        char[] chars = s.toCharArray();
        for(int i = 0;i<chars.length;i++){
            if(chars[i] == '('){
                chars[i] = ')';
            }else if(chars[i] == ')'){
                chars[i] = '(';
            }
        }
        String postfix = infixToPostfix(new String(chars));
        return new StringBuilder(postfix).reverse().toString();
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPrefix(exp));
    }
}



