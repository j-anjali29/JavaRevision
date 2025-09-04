
import java.util.*;
public class A4Array{
    public static void main(String args[]){
    //    int arr[]=new int[3];
        // arr[0]=97;
        // arr[1]=87;
        // arr[2]=98;

        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);

        // int arr[] = {79,89,97};

        // for(int i=0;i<3;i++){
        //     System.out.println(arr[i]);
        // }
        
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];


        // input
        // for(int i=0;i<size;i++){
        //     number[i] = sc.nextInt();
        // }


        //  output
        // for(int i=0;i<size;i++){
        //     System.out.println(number[i]);
        // }
 

        // liner search

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // for(int i=0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();

        // // output
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==x){
        //         System.out.print("x is fount at: "+i);
        //     }
        // }

        // 2D Array 

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //input
        // rows
        for(int i=0;i<rows;i++){
            //col
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();

            }
        }

        int x = sc.nextInt(); 

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("Found at index: "+ i+" "+ j);
                }
            }
        }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }



    }
}