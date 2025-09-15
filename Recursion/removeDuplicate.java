// time complexity = O(n)
public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newstring){
        //once we reach to end of string return newstring(answer string)
        if(idx == str.length()){
            System.out.println("String with no duplicates : "+newstring);
            return;
        }
        
        char currchar = str.charAt(idx);
           
        //here for calculating index of current character we need to delete current char form a. for ex: for getting index of c in map ---> c-a = 2 so the index of c is 2
        // so if condition indicates that if the current char is marked as true in map then it means we have already seen that char in given string
        // so we have to remove it from given string as it is repeated. so we will not add it in new string and go for the next char in given string
        if(map[currchar-'a']){ 
            removeDuplicates(str, idx+1, newstring);
        } 

        //but if it is not seen previously in given string(i.e it is still marked as false) we need to mark it as true and add it in newstring and again go to next char in given string
        else{
            newstring += currchar;
            map[currchar-'a'] = true;
            removeDuplicates(str, idx+1, newstring);
        }

    }
    public static void main(String args[]){
        String str = "bccaabda";
        removeDuplicates(str, 0, "");

    }
}
