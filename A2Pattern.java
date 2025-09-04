public class A2Pattern {
    public static void main(String[] args) {
        // int n = 4;
        // int m = 5;
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n=4;
        // int m=5;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(i==0 || j==0 || i==n-1 || j==m-1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n=4;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=0;i--){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n= 4; 
            /*
                    *
                  * *
                * * *
              * * * *
             
              */

        // for(int i=1;i<=n;i++){
        //     //inner loop - for space
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop - for stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        /*
         1
         1 2
         1 2 3 
         1 2 3 4
         */

        //  int n=4;
        //  for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        //  }


        /*
         12345
         1234
         123
         12
         1
         */

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // int number=1;
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // 0-1 triangle
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // butterfly pattern

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // solid rhombus

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // number pyramid

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
            
        //     }
        //     System.out.println();
        // }


        


    }
}
