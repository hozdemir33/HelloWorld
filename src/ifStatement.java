import java.util.Scanner;

public class ifStatement {

    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        // System.out.println("What is your age:::");
//        int A1 = a1.nextInt();
//
//        System.out.println("This my AGE::" + A1);
//
//        if (A1 >=8 && A1<=30) {
//            System.out.println("You are still young!!!");
//        }
//
//        if(A1>35 || A1>=60){
//            System.out.println("You are old person");
//        }

        //int yearAge=a1.nextInt();
       // int birthAge=2023-yearAge;
       // System.out.println(birthAge);



    // C= (F-32)/1.8;
        System.out.println("Please nete a Fahrenhiet Value:::"+a1);
        double givenFahrenheit = a1.nextDouble();
        double calculatedCelsiusIs=(givenFahrenheit-32)/1.8;


    }
}
