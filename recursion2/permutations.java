public class permutations {
    public static void printPermutations(String str, String permutation){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i<str.length();i++){
            char currchar = str.charAt(i);
            //removing current char from str(newstr)
            String newstr = str.substring(0,i) + str.substring(i+1);
                    //       part before i ^                  part after i ^
            // ex: if str = "abc" & i = 1 ,  currchar = 'b' and newstr = "a"+"c" ==> "ac"
            printPermutations(newstr, permutation+currchar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPermutations(str, "");
    }
}
