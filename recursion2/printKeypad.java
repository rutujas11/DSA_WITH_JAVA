
public class printKeypad {
    /// in this problem we are supposed to print the al possible combinations of the character for the input number from keypad
    /// ex: for 0 --> ., 1 --> "abc", 2-->"def" likewise
    /// so first we will store combinations for single number in string array
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    ///    index ------------>        0 ,  1  ,  2  ,  3  ,  4  ,  5  ,  6   ,  7 ,  8  , 9
    public static void keypadCombinations(String str, int idx, String combinations){
        if(idx == str.length()){
            System.out.println(combinations);       ///once reach to end of string print current combination
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad[currchar-'0'];   
        // accessing combiantions for current char(number) of given input number
        // for example: for 2 keypad["2"-"0"] == keypad["2"] ==> "def"
        // now using for loop trace through it and add curr char to the combination and create combinations
        for(int i =0;i<mapping.length();i++){
            keypadCombinations(str, idx+1, combinations+mapping.charAt(i));
        }

    }
    public static void main(String args[]){
        String str = "34";
        keypadCombinations(str, 0, "");
    }
}
 