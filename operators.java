public class operators {
    public static void main(String args[]){

/////ARITHMETIC OPERATORS
//-----> Binary operators ===> +, -, *, /, %  (perform operations on two operands(numbers))
        System.out.println("Addition : "+(10+5));
        System.out.println("Subtraction : "+(10-5));
        System.out.println("Multiplication : "+(10*5));
        System.out.println("Division : "+(10/5));
        System.out.println("Modulo : "+(10%5));
        
//-----> Unary operators ===> ++, -- (perform on only one operand)
       // 1)Pre increment (++a)  ==> 1)change value  2) use value
        int a = 10;
        int b = ++a;
        System.out.println("Print a : "+a);   //1)change value ==> a = a+1 ==> a=11 2)use value ==>print a as 11 (and not as 10)
        System.out.println("Print b : "+b);   //here b=++a so it will increment value of a by 1 and then assign it to b therefore b = a+1=11
  
      // 2)Post increment (x++) ==> 1)use value   2)change value
        int x = 10;
        int y = x++;
        System.out.println("Print x : "+x);  // 1)use value therefore as x++ ==> x=x+1=11 hence 2)use value x == 11
        System.out.println("Print y : "+y);  //here y = x++ so it will use value of x as 10 for y and then increment x therefore y = x = 10
         
     // 3)pre decrement(same rules as pre increment)
     // 4)post decrement(same rules as post increment)


/////RELATIONAL OPERATORS
    // 1) == (boolean output ==> true if equal, false if not equal)
    // 2) != (boolean output ==> true if not equal, false if equal)
    // 3) > (a > b ==> boolean output ==> true if a is greater, else false)
    // 4) < (a < b ==> boolean output ==> true if a is smaller, else false)
    // 5) >= (a >= b ==> boolean output ==> true if a is greater or equal to b, else false)
    // 6) <= (a <= b ==> boolean output ==> true if a is smaller or equal to b, else false)


/////LOGICAL OPERATORS
    // 1) && (AND)
    // 2) || (OR)
    // 3) ! (NOT operator)


///// BITWISE OPERATOR
    // ex : A = 0101, B = 0110
    // 1) & (binary AND) ===> (0101 & 0110) == 0100
    // 2) | (binary OR) ===> (0101 | 0110) == 0111
    // 3) ^ (binary XOR) ===> (0101 & 0110) == 0011   (if both same then false else true)
    // 4) ~ (binary one's complement) ===> ~(0101) == 1010
    // 5) << (binary left shift) ===> A<<1 --> it will shift each bit in A to left by 1 position ===> 0101<<1 == 1010, B(0110)<<1 == 1100
    // 6) >> (binary right shift) ===> A>>1 --> it will shift eact bit in A to right by 1 position ===> 0101>>1 ==0010, B(0110)>>1 == 0011
 

/////ASSIGNMENT OPERATORS
    // 1) =    ex: a=b assigns value of b to a
    // 2) +=   ex: a+=b ===> a=a+b   
    // 2) -=   ex: a-=b ===> a=a-b   
    // 2) *=   ex: a*=b ===> a=a*b   
    // 2) /=   ex: a/=b ===> a=a/b   

    }
    
}
