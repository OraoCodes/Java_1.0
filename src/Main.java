import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //introductions to Java Methods - a block of code one call at a particular time to perform a certain function.

        //testing out a method that takes in two integers and multiplies them
        int x = 5;
        int y = 10;

        System.out.println(multiply(x,y));
    }
    static int multiply(int a, int b){
        return a * b;
    }
}
