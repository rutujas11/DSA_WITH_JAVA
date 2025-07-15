public class stringbuilder {
    public static void main(String args[]){

//-----> string builder declaration
        StringBuilder sb = new StringBuilder("Rutuja");
        System.out.println(sb);

//-----> char at index 
        System.out.println("character at index 0 : "+sb.charAt(0));

//-----> set new char at index ---> string.setCharAt(index, new char)
        sb.setCharAt(1,'i');
        System.out.println("Printing new string after setting new char at index 1 : "+sb);

//-----> insert new char at any position in string without changing the original string
         // insert(index, character)
        sb.insert(0,'S');
        System.out.println("Inserting new char at index 0 : "+sb);

//-----> Append (inserting new char at the end)
        sb.append("S");
        System.out.println("String after appending S : "+sb);

//-----> Delete char or subpart of string
        // string.delete(start index, end index(exclusive))
        sb.delete(0,1);      //deleting starting "S"
        System.out.println("String after deleting initial S : "+sb);

//-----> Reverse the string
        // swap elements from first half of string to second half part of string
        //ex --> for hello : swap h with o, swap e with l, swap middle l with itself
        StringBuilder newsb = new StringBuilder("rutuja");
        System.out.println("Original String : "+newsb);
        for(int i = 0; i<newsb.length()/2; i++){
            int front = i;
            int back = newsb.length()-1-i; //accessing elements from back, for iteration 1 front = 0 and back = 6-1-0(i) = 5(last character)

            char frontchar = newsb.charAt(front);
            char backchar = newsb.charAt(back);

            newsb.setCharAt(front, backchar);
            newsb.setCharAt(back, frontchar);
        }
        System.out.println("String after reversing : "+newsb);


        /////reverse sentence
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
