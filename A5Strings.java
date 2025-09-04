import java.util.*;
import javax.script.SimpleBindings;

public class A5Strings{
    public static void main(String args[]){
        // Stru=ing Declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // concatenation 
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName+" "+lastName;
        
        // System.out.println(fullName.length());

        // // charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1>s2 : +ve value
        // 2 s1==s2 : 0
        // 3 s1<s2 : -ve value

        // if(name1.compareTo(name2)==0){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println(
        //         "Not equal"
        //     );
        // }

        // if(name1==name2){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("not ");
        // }

        // if(new String("tony")==new String("tony")){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("not");
        // }

        // String sentence = "TonyStark";
        // String name = sentence.substring(4);
        // System.out.println(name);
        

        // strings are immutable


        // // String builder
        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // char At index 0 
        // System.out.println(sb.charAt(0));

        // set char at index 0
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);


        // sb.insert(2, 'n');
        // System.out.println(sb);

        // delete the extra 'n'
        // sb.delete(2,4);
        // System.out.println(sb);
        // StringBuilder sb1= new StringBuilder("h");
        // sb1.append("e");
        // sb1.append("l");
        // sb1.append("l");
        // sb1.append("o");
        // System.out.println(sb1);

        StringBuilder sb = new StringBuilder("hello");
        
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i; // 5-1-0=4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

            
        }
        
        System.out.println(sb);

    }
}