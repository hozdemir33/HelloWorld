import java.util.Scanner;
import java.util.SortedMap;

public class conversionOfTemprature {

    public static void main(String[] args) {

        // C= (F-32)/1.8
        System.out.println("Please Enter a TempValue::");
        Scanner sc= new Scanner(System.in);

        int f=   sc.nextInt();
        double c= (f-32)/1.8;

        System.out.println("The CENCIUS VALUE IS ::::"+ c);



          }

    }

