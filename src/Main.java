import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int results = bmiCalculator(a,b);
        System.out.println(results);

    }
    static int bmiCalculator(int a, int b){
        int z = a*b;
        return z;
    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method 21");
        return a+b+c;
    }

}
