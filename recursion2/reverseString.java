public class reverseString {
    public static void reverseStr(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseStr(str, idx-1);
    }
    public static void main(String args[]){
        String str = "rutuja";
        reverseStr(str, str.length()-1);
    }
}
