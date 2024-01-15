import java.util.Scanner;

public class loop1 {


    public static void main(String[] args) {

        String str1 = "hasan";//THIS IS HOW YOU REVERSE A STRING
        String revStr1 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {

            revStr1 = revStr1 + str1.charAt(i);
        }

         System.out.println(revStr1);


        //HOW TO REVERSE A NUMBER==== 123 =====321

        int num = 567;
        int reverseNum = 0;

        while (num > 0) {
            int k = num % 10;
            reverseNum = reverseNum * 10 + k;
            num = num / 10;

        }

        //   System.out.println(reverseNum);

        //THIS IS HOW YOU REVERSE A NUMBER
        int number = 123;
        int reverNumberIs = 0;

        while (number > 0) {

            int h = number % 10;
            reverNumberIs = reverNumberIs * 10 + h;
            number /= 10;

        }
        // System.out.println(reverNumberIs);


        //How to reverse a number

        int j = 987654321;
        int revJ = 0;

        while (j > 0) {

            int g = j % 10;
            revJ = revJ * 10 + g;
            j = j / 10;


        }
        System.out.println(revJ); //WORKING AS EXPECTED


        //HOW TO FIND IF THE GIVE STRING IS PALINDROME OR NOT

        //EX;  NOON   IF YOU REVERSE IT NOON
        //EX; HASAN  IFYOU REVERSE IT NOW IT BECOMES NASAH "not palindrome"

        String name = "MoM";
        String revNa = "";


        for (int k = name.length() - 1; k >= 0; k--) {

            revNa = revNa + name.charAt(k);

        }

         System.out.println(revNa);

        if (revNa.equalsIgnoreCase(name)) {

             System.out.println("Palindrome...");
        } else {
             System.out.println("NOT A PALINDROME");
        }


        //Armstrong number 153= 1^3 + 5^3 + 3^3  == 1 + 125 + 27 =153

         Scanner sc=new Scanner(System.in);
          System.out.println("Please Enter a number:::");
         int z = sc.nextInt();
        int temp=z;
        int sum=0;

        while(temp>0){
            int id=temp%10;
            sum=sum+(id*id*id);
            temp=temp/10;
            }

        //Armstrong Number How to find it????

      if(sum==z){
          System.out.println("Armord");

      } else {
          System.out.println("NOT");
      }

    }
}

