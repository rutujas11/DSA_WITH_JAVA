/// Q.Place tiles of size 1xm in a floor of size nxm 
public class placeTiles {
    public static int placetiles(int n, int m){
        /// if floor has same length and breadth then there is only 2 ways to place them 
        /// for ex: n = m = 4 then tile will be of sixe 1x4 so we can either place them all vertically or all horizontally, therefore answer is 2
        ///  __ __ __ __                    __ __ __ __
        /// |__|__|__|__|                  |__|__|__|__|1xm ==> 1x4 tile
        /// |__|__|__|__|
        /// |__|__|__|__|
        /// |__|__|__|__|nxm ==> 4x4 floor         
        if(n == m){   
            return 2;
        }

        /// if n is small i.e rows (length) is less than columns then we can place them only horizontally therefore only 1 way so return 1
        ///  __ __ __ __                    __ __ __ __
        /// |__|__|__|__|                  |__|__|__|__|1xm ==> 1x4 tile
        /// |__|__|__|__|
        /// |__|__|__|__|nxm ==> 3x4 floor
        if(n<m){
            return 1;
        }

        /// if n>m
        ///  __ __ __                  __ __ __ 
        /// |__|__|__|                |__|__|__|1xm ==> 1x3 tile
        /// |__|__|__|
        /// |__|__|__|
        /// |__|__|__| nxm ==> 4x3 floor                   
        /// in this case if we place first 1 tile horizontally then we can place left 3 tiles both way horizontally and vertically
        int verticalplace = placetiles(n-m, m);
        int horizontalplace = placetiles(n-1, m);
        return verticalplace+horizontalplace;
    }
    public static void main(String args[]){
        int n = 3,m = 4;
        int ans = placetiles(n, m);
        System.out.println(ans);
    }
}
