//Time complexity = O(2^n)
public class printSubseq {
    public static void allSubSequences(String str,int idx, String newstring){
         //and when you reach to last print the formed strign (newstring) 
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(idx);
        //first call1 (of our function) for current char wants to add with newstring and move to next char in given string
        allSubSequences(str, idx+1, newstring+currchar);

       //and call2 for current char don't want to add with newstring and move to next char in given string
       allSubSequences(str, idx+1, newstring);
    }
    public static void main(String args[]){
        String str = "abc";
        allSubSequences(str, 0, "");

    }
}
