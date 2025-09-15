import java.util.*;
public class printUniqueSubseq {
    //logic is same as code for printSubseq only add hashset to avoid duplicate subsequences
    public static void uniqueSubSequences(String str, int idx, String newstring, HashSet<String> set ){
        if(idx == str.length()){
            //if hashset already contain newstring then don't do anything (do not add it again)
            if(set.contains(newstring)){
                return;
            }
            //but if don't contain newstring then print it and add it to hashset
            else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char currchar = str.charAt(idx);
        uniqueSubSequences(str, idx+1, newstring+currchar, set);

        uniqueSubSequences(str, idx+1, newstring, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubSequences(str, 0, "", set);
    }
}

///here for input 'aaa' original answer is aaa, aa, aa, aa, a, a, a. 
/// but we want only unique so output will be aaa, aa, a, ___(empty string)
