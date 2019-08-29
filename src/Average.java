import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor a = new ArgsProcessor(args);
        int n1 = a.nextInt("Value of n1");
        int n2 = a.nextInt("Value of n2");

        double average = (double)(n1+n2)/2;
        System.out.println("The average of " + n1 + " and " + n2 + " is " + average);

    }

}
