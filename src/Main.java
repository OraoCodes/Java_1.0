import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Africa");
//        System.out.print("I am a Product Designer who writes DB queries");
//        //This is just but a comment
//        System.out.println("testing out escape characters");
//        /*
//        I am testing out a multiline comment
//        Lets talk variables - there are about 9 data types
//        Boolean, int, char, Float, short, Long, string, byte, double.
//        Each can be used based on what each person needs to achieve.
//        See Data  types in play.
//         */
//        int x; // declaration
//        x = 123; //assignment
//        //OR one could basically perform Declaration and Assignment at the same time;
//
//        int y = 123; //the action being known as initialization.
//        System.out.println(y);
//
//        String name = "wycliffe";// String
//        boolean male = true;//Boolean
//        long population = 34759676767697L; //notice the L at the end of the long.
//        char symbol = 'c';
//        byte age = 23; //holds -between 0-255 - Negligible impact.
//
//        //Swapping variables.
//
//        //Step 1: Declare variable.
//        String a = "kool-aid";
//        String b = "water";
//        // Step 2: Declare an empty variable;
//        String temp;
//        //Step 3: Assign the empty variable the contents of the first variable.
//        temp = a;
//        //Step 4:Reassign the first variable the second variable.
//        a = b;
//        //Step 5: Assign the value of the temporary variable to the first variable.
//        temp = b;
//        System.out.println(a);

//        //collecting user input.
//        //step 1. Import the scanner Utility. (import java.util.Scanner.)
//        //step 2 use scanner class to create a scanner object.
//        Scanner = new Scanner(System.in);
//        //step 3 printout the question on the console
//        System.out.println("Hello Welcome to Archeo-hub, what is your name?");
//        //Step 3 assign a data type to the input.
//        String name = scanner.nextLine();
//        //step 4 print out the input.
//        System.out.println("welcome "+name);

        //Try out 2.
//        Scanner scan = new Scanner(System.in);
//        System.out.println(scan.nextLine());

//        //try out 3 - own
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hello chief, whats your ID ?");
//        String myId = scanner.nextLine();
//
//        System.out.println("So your Id is "+myId);
        //Try out 4 own

//        Scanner scan = new Scanner(System.in);
//        System.out.println(scan.nextLine());
//
//        Scanner intscanner = new Scanner(System.in);
//        System.out.print(intscanner.nextInt());
//        intscanner.nextLine();
//
//        Scanner testscan = new Scanner(System.in);
//        System.out.println(testscan.nextLine());

        //Hypotenuse calculation algorithm
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("what the height in cm ?");
//        double x = scanner.nextDouble();
//        System.out.println("what is the length in cm ?");
//        double y = scanner.nextDouble();
//        scanner.nextLine();
//
//        double z = Math.sqrt((x*x)+(y*y));
//
//        System.out.println("Your Hypotenuse is " + z );

//        //Generating a random number
//        //step 1 - import the random class.
//        //Step 2 - Instantiate the random class
//        Random randomizer = new Random();
//        //Step 3 - create a variable and store the random number
//        //Step 4 randomising double
//        double z = randomizer.nextDouble();
//        //Step 5 = randomise a boolean
//        boolean married = randomizer.nextBoolean();
//        int r = randomizer.nextInt(6)+1;
//        System.out.println(married);

//        --------------------------------------------------------------
//        //if statements.
//        Scanner scannet = new Scanner(System.in);
//
//        int age = scannet.nextInt();
//
//        if (age > 18){
//            System.out.println("Wow you are an adult");
//        } else if (age == 18) {
//            System.out.println("Just got here");
//        }
//        else {
//            System.out.println("Hey youngie !");
//        }

//        ------------------------------------------------------------------------
        //Switches - used in cases where one does not need to use so many if statements
//
//        Scanner scanner = new Scanner(System.in);
//        String pet = scanner.nextLine();
//        switch (pet){
//            case "dog": System.out.println("A dog is s pet");
//            break;
//            case "cat": System.out.println("A Cat is a pet");
//            break;
//            default: System.out.println("I don't seem to understand");
//        }
//
////         second attempt - id cracker
//
//        System.out.println("Please insert your Pin");
//        Scanner idScanner = new Scanner(System.in);
//        int id = idScanner.nextInt();
//
//        switch (id){
//            case 36750652: System.out.println("Password is correct");
//            break;
//            default: System.out.println("Pin is wrong");
//        }

        // Testing out a switch on my own - minimal reference
//
//        System.out.print("please share your age");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        switch (age){
//            case age 19: System.out.println("You are under age");
//            default:
//        }
        //code did not execute because of the switch class only works for println
//        **********************************************************************?
        //Testing out logical operator

//        Scanner scanner = new Scanner(System.in);
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("what is your gender");
//        String gender = scanner.nextLine();
//
//        if (id >= 18 && gender.equals("male")){
//            System.out.println("You are an adult");
//        }else{
//            System.out.println("You are a kid");
//        }
//        Scanner scanner  = new Scanner(System.in);
//        String name = "";
//
//        while(name.isBlank()){
//            System.out.print("Please enter your name");
//            name = scanner.nextLine();
//        }
//        System.out.print("Hello "+name);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter your name");
//        String name = scanner.nextLine();
//
//        while (name.isBlank()){
//            System.out.println("Your name is needed to begin the game");
//            scanner.nextLine();
//        }
//        System.out.println("Lets rumble "+name);
//
        //Setting up for loops - these are loops that count to a specific number.

        for(int i = 0; i <= 10; i++){
            System.out.println(i);

        }

    }
}
