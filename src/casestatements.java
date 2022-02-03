import java.util.*;

public class casestatements {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("slaam");
            break;
            case 3: System.out.println("habibi");
            break;
            default: System.out.println("Invalid");
        }



    }

}
