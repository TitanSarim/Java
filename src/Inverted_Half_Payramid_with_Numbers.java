import java.util.*;

public class Inverted_Half_Payramid_with_Numbers {

    public static void main(String args[]){

        int n =10;

        for(int i=n; i>=1; i--){

            for(int j= 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}
