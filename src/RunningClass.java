import java.util.Scanner;

public class RunningClass{


    public static void main(String[] args) {

        AgeCalculation age=new AgeCalculation();
      //  System.out.println("I am :: " + age.c + "years old");
       // System.out.println("I am + " + age.k + "years old");

        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age::");
        scan.nextInt();
        System.out.println("You are so young!!!");


    }
}


