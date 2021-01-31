package java112.labs1;
/**
 * Class required to pass lab 3 tests.
 * @author mbpriebe
 */

public class LabThree {
    /**
     * main method for lab three. prompts user to enter command line arg.
     * @param args and word
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            LabThree lab3 = new LabThree();
            lab3.run(args[0]);
        }
    }
    /**
     * prints out the command line arg from main
     * @param variable command line args passed in
     */
    public void run(String variable) {
        String input = "test";
        System.out.println("input: " + variable);
    }

}
