package TwoPointers;

public class validPalindrome {
    public static boolean isPalindrome(String s){
        int n = s.length();
        int l = 0, r = n-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args){
        String s = "A man, a pla, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
