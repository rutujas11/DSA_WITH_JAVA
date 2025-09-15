public class moveAllxToEnd {
    public static void moveAllx(String str,int idx,int count,String newstring){
        if(idx == str.length()){
            for(int i = 0;i<count;i++){
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        
        if(str.charAt(idx) == 'x'){
            count += 1;
            moveAllx(str, idx+1, count, newstring);
        } else{
            newstring += str.charAt(idx);
            moveAllx(str, idx+1, count, newstring);

        }
    }
    public static void main(String args[]){
        String str = "axbxxcxde";
        String newstring = "";
        moveAllx(str,0,0,newstring);
    }
}
