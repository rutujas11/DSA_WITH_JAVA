//Q. find first and last occurance of an element in String
// Time Complexity = O(n)   n-->String length()
public class firstLastOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void firstlast(String str, char elt,int idx){
        if(idx == str.length()){
            System.out.println("First occurance of "+elt+" is at index : "+first);
            System.out.println("Last occurance of "+elt+" is at index : "+last);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == elt){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        firstlast(str, elt, idx+1);
        
    }
    public static void main(String args[]){
        String str = "abaaaccbbac";
        char elt = 'b';
        firstlast(str, elt, 0);

    }

}
