import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class arrays {

    public static void main(String[] args) {



        String[] a= {"a", "b", "c"};


       //HOW TO PRINT IN ARRAY LIST ???????????

        String [] b= {"hasan"};

        for(String newStorage:b) {

            boolean hl = newStorage.startsWith("h");

            // System.out.println(hl);

            String[] arr = {"a", "b", "c"};
            System.out.println(Arrays.toString(arr));

            int[] arrInt = {1, 2, 3};

            System.out.println(Arrays.toString(arrInt));

            ArrayList<String> AR= new ArrayList<>();

            AR.add("a");
            AR.add("b");
            AR.add("c");
            AR.clear();
            System.out.println(AR);

            int[] arrNewList = { -7, -5, 5, 10, 0, 3, 20, 25, 25 };

            for(int i=0; i<arrNewList.length; i++)
               for(int j=i+1; j<arrNewList.length; j++){

                   if(arrNewList[i]==arrNewList[j]){
                       System.out.println(Arrays.toString(arrNewList));
                   }

               }

        }
    }
}
