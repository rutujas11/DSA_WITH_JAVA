import java.util.Scanner;
public class twoDarrays {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter cols");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("enter elements");
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("enter key to search:");
        int key = sc.nextInt();
        for(int i = 0; i<rows; i++){
            for(int j=0; j<cols;j++){
                if(key == matrix[i][j])
                System.out.print("key found at "+i+"th row and "+j+"th column");
            }
        }
    }
}
