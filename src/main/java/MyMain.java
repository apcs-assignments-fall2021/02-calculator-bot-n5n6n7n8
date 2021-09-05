import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        if(a!=min&&a!=max)
        {
            return a;
        }
        else if(b!=min&&b!=max)
        {
            return b;
        }
        return c;
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if(Math.max(Math.abs(a), Math.abs(b))==Math.abs(a))
        {
            return a;
        }
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean calculating=true;
        while(calculating) {
            System.out.println("Which math function would you like to calculate? (Median, Magnitude, or Pythagoras?)");
            String input = scan.nextLine();
            if (input.equals("median") || input.equals("Median")) {
                System.out.println("Ok. Type three integers. Which is the first value?");
                int meda = scan.nextInt();
                System.out.println("Which is the second value?");
                int medb = scan.nextInt();
                System.out.println("Which is the third value?");
                int medc = scan.nextInt();
                System.out.println("The median is " + median(meda, medb, medc));
                String placeholder=scan.nextLine();
            } else if (input.equals("magnitude") || input.equals("Magnitude")) {
                System.out.println("Ok. Type two integers. Which is the first value?");
                int maga = scan.nextInt();
                System.out.println("Which is the next value?");
                int magb = scan.nextInt();
                System.out.println("The value with the greatest absolute value is  " + magnitude(maga, magb));
                String placeholder=scan.nextLine();
            } else if (input.equals("pythagoras") || input.equals("Pythagoras")) {
                System.out.println("Ok. Type two integers. Which is the first value?");
                int pya = scan.nextInt();
                System.out.println("Which is the second value?");
                int pyb = scan.nextInt();
                System.out.println("The hypotenuse length is " + pythagoras(pya,pyb));
                String placeholder=scan.nextLine();
            } else {
                System.out.println("The input was misunderstood or mistyped. Please try again.");
            }
            System.out.println("Would you like to calculate again? Type 'yes' or 'no'");
            String again=scan.nextLine();
            if(again.equals("no"))
            {
                calculating=false;
            }
        }
    }
}
