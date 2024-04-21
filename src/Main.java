import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Practising arrays.

        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Mustang"; //Reassign values of the
        System.out.println(cars[1]);

        //another options for drafting arrays.

        String[] gender =  new String[4];

        gender[0] = "Males";
        gender[1] = "female";
        gender[2] = "binary";
        gender[3] = "non-binary";

        System.out.println(gender[0]);

        //listing all array items in the - Done through a loop.
        //listing all family members in my family

        String[] oraos = new String[7];

        oraos[0] = "Charles";
        oraos[1] = "rosemary";
        oraos[2] = "wycliffe";
        oraos[3] = "effy";
        oraos[4] = "mitchelle";
        oraos[5] = "fidel";
        oraos[6] = "natasha";

        for (int i = 0; i < oraos.length ; i++) {
            System.out.println(oraos[i]);

        }
    }
}
