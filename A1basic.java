import java.util.Scanner;


class A1basic{
    public static void main(String[] args){
        // System.out.println("Hello world");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("Equal");
        // }else if(a>b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("b is greater ");
        // }


        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch(button){
        //    case 1:  System.out.println("hello");
        //    break;
        //    case 2: System.out.println("Nameste");
        //    break;
        //    case 3 : System.out.println("Bonjour"); 
        //    break;
        //    default: System.out.println("Invalid!!");
        // }

        // for(int i=1;i<11;i++){
        //     System.out.println(i);
        // }

        // int i=1;
        // while(i<11){
        //     System.out.println(i);
        // }

        // int i=0;
        // do { 
        //     System.out.println(i);
        //     i=i+1;
        // } while(i<11);

        // int i = 10;
        // while(i<11){
        //     System.out.println("Apna College");
        //     i++;
        // }

        // do { 
        //     System.out.println("Apna College");
        //     System.out.println(i++);
        // } while (i<20);


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);


        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }

        

    }
}