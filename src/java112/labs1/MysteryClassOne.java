package java112.labs1;
/**
 * Mystery Class Lab - first TDD of semester
 * @author mbpriebe
 */

public class MysteryClassOne {
    /**run Myster Class Program.
    *Output results from mysterMethodOne
    *@param args command line arguments
    */
   public static void main(String[] args) {
       MysteryClassOne lab2 = new MysteryClassOne();
       System.out.println("The value is: " + lab2.mysteryMethodOne());
   }
    /**
     * adding mystery method to pass the tests.
    */
   public int mysteryMethodOne() {
        return 1;
    }
}
