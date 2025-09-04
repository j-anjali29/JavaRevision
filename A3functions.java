import java.util.*;

public class A3functions {

    public static void printName(String name){
        System.out.println(name);
        return;
    }

    public static int sum(int a,int b){
        return a+b;
    }
    public static int product(int a,int b){
        return a*b;
    }
    public static void factorial(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printName(name);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(sum(a,b));
        // System.out.println(product(a, b));
        int n = sc.nextInt();
        factorial(n);

    }
}
