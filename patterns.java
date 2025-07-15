public class patterns {
    public static void main(String args[]){

        // //1)border of square
        // int n = 4;
        // int m = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j = 1;j<=m;j++){
        //         if(i==1 || j==1 || i==n|| j==m){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();

            //2)half pyramid
            for(int i = 1;i<=4;i++){                                     //* 
                for(int j = 1;j<=i;j++){                                 //**
                    System.out.print("*");                             //***
                }                                                        //****
                System.out.println();
            }

            //3)inverted half pyramid
            for(int i = 1;i<=4;i++){                                     //****
                for(int j = i;j<=4;j++){                                 //***
                    System.out.print("*");                             //**
                }                                                        //*
                System.out.println();
            }
    }
}

