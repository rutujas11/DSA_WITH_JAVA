import java.util.*;
public class practice {
    // public static void reverseword(String s){
    //     s = s.trim().replaceAll("\\s+"," ");
    //     String[] words = s.split(" ");
    //     System.out.println(words.length);
    //     StringBuilder reverse = new StringBuilder();
    //     for(int i = words.length-1;i>=0;i--){
    //         reverse.append(words[i]);
    //         System.out.println(reverse);
    //         if(i!=0){
    //             reverse.append(" ");
    //         }
            
    //     }
    //     System.out.println(reverse.toString());
    // }

    // public static String longestCommonPrefix(String[] strs) {
    //         StringBuilder result = new StringBuilder("");
    //         for(int i = 0;i<strs[0].length();i++){
    //             char ch = strs[0].charAt(i);
    //             for(String word : strs){
    //                 if(i>=word.length() || word.charAt(i) != ch)
    //                 {
    //                     return result.toString();
    //                 }
    //             }
    //             result.append(ch);
    //         }
    //         return result.toString();
    // }

    // public static boolean isIsomorphic(String s, String t) {
    //     if(s.length() != t.length()){return false;}

    //     HashMap<Character, Character> map = new HashMap<>();
    //     HashSet<Character> mappedvalues = new HashSet<>();

    //     for(int i = 0;i<s.length();i++){
    //         char cs = s.charAt(i);
    //         char ct = t.charAt(i);
    //         if(map.containsKey(cs)){
    //             if(map.get(cs) != ct){
    //                 return false;
    //             }
    //         }
    //         else{
    //             if(mappedvalues.contains(ct)){
    //                 return false;
    //             }
    //             map.put(cs,ct);
    //             mappedvalues.add(ct);
    //         }
    //     }
    //     return true;
    // }

    // public static boolean rotateString(String s, String goal) {
    //     int n = s.length();
    //     if(n != goal.length()) return false;
    //     String rotated = s+s;
    //     return (rotated.contains(goal));
    // }

    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);

        

        int res =0;
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            if((i>0) && (s.charAt(i) == 'V' || s.charAt(i) =='X') && s.charAt(i-1) == 'I'){
                res = res+hmap.get(s.charAt(i))-hmap.get(s.charAt(i-1));
                i--;
            }
            else if((i>0) && (s.charAt(i) == 'L' || s.charAt(i) =='C') && s.charAt(i-1) == 'X'){
                res = res+hmap.get(s.charAt(i))-hmap.get(s.charAt(i-1));
                i--;
            }
            else if((i>0) && (s.charAt(i) == 'D' || s.charAt(i) =='M') && s.charAt(i-1) == 'C'){
                res = res+hmap.get(s.charAt(i))-hmap.get(s.charAt(i-1));
                i--;
            }
            
            else{
                res = res+hmap.get(s.charAt(i));
            }
            
        }
        return res;

    }


    public static void main(String args[]){
        // String s = "the sky is blue";
        // reverseword(s);
        // String[] strs = {"flower","flow","flight"};
        // String res = longestCommonPrefix(strs);
        // System.out.println(res);
        // boolean ans = isIsomorphic("egcd","adfd");
        // System.out.println(ans);
        // boolean result = rotateString("abcde","abced");
        // System.out.println(result);

        int num = romanToInt("MCDLXXVI");
        System.out.println(num);
    }
}
