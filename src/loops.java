import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


        String k = "Burak Ozdemir";

        //for (int i = 0; i < k.length(); i++) {
        //   System.out.print(k.charAt(i));
        // }


        //   System.out.println("HOW old are you:::");

        //  int agePerson=   sc.nextInt();
        //  System.out.println(2023-agePerson);

        //  Can you solve  2(3-x)=23;

        //  2.3-2.x=23
        //  6-2x=23
        // -2x=17
        //  x=-8.5


        // char a = 'a';
        //  System.out.println(a);

        // char b = 'b';
        // System.out.println(b);//print b

        //   System.out.println(a + b);//total char is :: 195


//        String name = "Aaron";
//        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));


        //     try {
        // System.out.println(name.charAt(5));
        // System.out.println(name.charAt(10));


        //     }catch(Exception e){

        //    System.out.println("This is the:::StringIndexOutOfBoundsException ");


        String str = "Hasan";
        String revStrName = "";

        for(int i=str.length()-1; i>=0; i--){

            revStrName=revStrName + str.charAt(i);
        }
       // System.out.println(revStrName);

        String str1="ozdemir";
       // String newStr1=""; //How you reverse a STRING

        for(int i=str1.length()-1; i>=0; i--) {
           // newStr1=newStr1+str1.charAt(i);

            char n1= str1.charAt(i);

            if(n1==str1.charAt(i)){
                System.out.print(n1);

            }
        }
          //  System.out.println(newStr1);



    }
}
