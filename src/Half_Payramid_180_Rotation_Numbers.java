import java.util.*;


public class Half_Payramid_180_Rotation_Numbers {

    public static void main(String args[]){

        int n=100;

        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }


}
