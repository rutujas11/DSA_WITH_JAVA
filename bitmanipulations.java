
public class bitmanipulations {
    public static void main(String args[]){

//-----> 1)GET bit 
    ///    - get bit at any position from the number
    ///   Q)get 3rd bit(position=2) of a number n = 0101 (5 in decimal)
    ///   --> i)bit mask : 1<<index ==> 1<<2 => 0001<<2 => 0100 
    ///      ii)AND operation: 0100 AND 0101(n) => 0100
    ///     iii) now if answer of anding 0100 is non-zero then bit at position 2 is 1 else it is 0
    ///      iv) here it is nonzero therefore bit is 1 at position 2.
    
        int n = 5;  //0101
        int pos = 2;
        int bitmask = 1<<pos;
        
        if((bitmask & n) == 0){
            System.out.println("Bit is Zero");
        } else{
            System.out.println("Bit is one");
        }


//-----> 2) SET bit
     /// - sets new bit to the desired position
     ///  Q) Set the 2nd bit (position = 1) of a number n. (n=0101) (task: convert 0101 to 0111 (changing 2nd last 0 to 1))
     /// --> i)bit mask : 1<<i ==> 1<<1 ==> 0001<<1 ==> 0010
     ///     ii)Operation OR : 0101 | 0010 ==> 0111(ans)
        int n1 = 5;
        int pos1 = 1;
        int bitmask1 = 1<<pos1;

        System.out.println(bitmask1 | n1);


//-----> 3) CLEAR bit
   ///    - make desired bit 0
   ///    Q) clear 3rd bit(position = 2) of a number n.(n=0101)    here last 1 =>0th index, 2nd last 0 => 1st index therefore 3rd bit is 3rd last 1(with index 2)
   ///      i) bit mask: 1<<i ==>1<<2 ==> 0001<<2 ==> 0100
   ///      ii) operation (n AND (NOT(Bitmask)))
   ///           n(0101) & (~(0100)) ==> 0101 & 1011 ==> 0001
   ///            therefore answer = 0001(bit 1 is removed from position 2 and replaced by 0)
        int n2 = 5;
        int pos2 = 2;
        int bitmask2 = 1<<pos2;

        System.out.println(n2 & (~(bitmask2)));

//-----> 4) UPDATE bit
   ///     i)for conversion 1 to 0 ===> use logic of CLEAR bit 
   ///    ii)for conversion 0 to 1 ===> use logic of SET bit 
   
       // from 0 to 1
        int n3 = 5;
        int pos3 = 1;  // 2nd last 0 from 0101
        int bitmask3 = 1<<pos3;
        System.out.println("0 to 1 conversion of 2nd last 0 of 0101: "+(n3 | bitmask3)); //op ==> 0111 ==> 7

       // from 1 to 0
       int n4 = 5;
       int pos4 = 0;
       int bitmask4 = 1<<pos4;
       System.out.println("1 to 0 conversion of last 1 of 0101: "+(n4 & (~(bitmask4)))); //op ==> 0100 ==> 4

    }
}
