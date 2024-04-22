import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //arrayList - practise

        ArrayList<String> food = new ArrayList<String>();

        food.add("Omena");
        food.add("fulu");
        food.add("kuon");

        food.set(0, "susshi");
        food.remove(2);
        food.clear();

        for (int i=0; i<food.size(); i++ ){
            System.out.println(food.get(i));
        }

        //test 1

        ArrayList<String> family = new ArrayList<>();

        family.add("grandpa");
        family.add("grandma");
        family.add("mother");

        for(int i=0; i<family.size(); i++){
            System.out.println(family.get(i));
        }

    }
}
