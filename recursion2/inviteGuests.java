public class inviteGuests {
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }
        ///invite single guest ways
        int ways1 = callGuests(n-1);

        /// invite pair guest ways
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }
    public static void main(String args[]){
        int n = 4;
        int result  = callGuests(n);
        System.out.println("ways : "+result);
    }
}
