import java.util.*;


public class Half_Pyramid_180_Rotation {

    public static void main(String args[]){

        int n=4;

        for(int i=0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
