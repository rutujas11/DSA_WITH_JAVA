import java.util.Stack;
public class Infix_to_postfix {
    static int prec(char ch){
        if(ch == '^') return 3;
        else if(ch=='/' || ch=='*') return 2;
        else if(ch == '+' || ch=='-') return 1;
        else return -1;
    }
    
    static String infixToPost(String s){
        Stack<Character> st = new Stack<>();

        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }

            else if(ch == '('){
                st.push(ch);
            }

            else if(ch == ')'){
                while(st.peek() != '(' && !st.isEmpty()){
                    res.append(st.pop());
                }
                st.pop();
            }

            else{
                while(!st.isEmpty() && prec(ch) <= prec(st.peek())){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }


    public static void main(String[] args){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPost(exp));
    }
}
