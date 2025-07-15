import java.util.*;
 
public class prefix_to_infix {
    static boolean isoperator(char ch){
        return ch == '+'|| ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%';
    } 
    
    public static String prefixToInfix(String s){
        Stack<String> st = new Stack<>();
        int l = s.length();
        for(int i = l-1;i>=0;i--){
            char ch = s.charAt(i);
            if(isoperator(ch)){
                if(st.size()<2) return "Invalid String";
                String ope1 = st.pop();
                String ope2 = st.pop();

                String temp = "(" + ope1 + ch + ope2 + ")";
                st.push(temp);
            }else{
                st.push(ch+"");
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        System.out.println(prefixToInfix(prefix));

    }
    
}

