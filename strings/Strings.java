
import java.util.Scanner;

public class Strings {
    @SuppressWarnings("resource")
    public static void main(String args[]){
//-----> String declaration
        // String name = "rutuja";
        // String fullname = "Rutuja Shete";
        // String sentence = "My name is Rutuja Shete";
        // System.out.println(sentence);

//-----> user input string
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name please: ");
        // //String username = sc.next();  if we enter "rutu shete" as input it will only print rutu. to print full sentence we have to use nextLine()
        // String username = sc.nextLine();
        // System.out.println("Your name is : "+ username);

//-----> Concatenation
        String firstname = sc.next();        
        String lastname = sc.next();  
        System.out.println(firstname + " " + lastname);
        System.out.println("Your full name is : "+firstname.concat(lastname)); 
        
//-----> length()
        System.out.println("length of string is : "+ firstname.length());

//-----> charAt
        for(int i=0;i<firstname.length();i++){
            System.out.println(firstname.charAt(i));
        }

//-----> Compare strings
        //cases ---> 1)if str1 > str2 then returns +ve value
        //           2)if str1 < str2 then returns -ve value
        //           3)if str1 == str2 then returns 0 
        System.out.println("Enter two strings to compare : ");
        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.compareTo(str2) == 0)   // here we can also use "==" to compare but in some cases this operator fails for some test cases
        {
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        //here, for hello and bello, hello is greater coz h>b as in alphabet order
        // for aabhello and aachello, aa is equal but in b and c, c>b therefore, aachello > aabhello

//-----> Substring
        //string.substring(begin index, end index(exclusive))
        // indexing of string starts from 0. like for first char of sentence index is 0 not 1
        String sample = "This is me rutuja shete";
        String subpart = sample.substring(11,16);  //output => rutuj
        System.out.println(subpart);

//-----> Strings are immutable
       //- we can't change or modify the string once we declared it in memory


//----->/reverse sentence
        String s = "the sky is blue";
        s = s.trim().replaceAll("\\s+"," ");
        String[] words = s.split(" ");
        System.out.println(words.length);
        StringBuilder reverse = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            reverse.append(words[i]);
            System.out.println(reverse);
            if(i!=0){
                reverse.append(" ");
            }
            
        }
        System.out.println(reverse.toString());
    }
}
