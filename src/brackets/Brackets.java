package brackets;

public class Brackets {


    /**
     * We are given strings containing brackets of 4 types - round (), square [], curly {} and angle <> ones.
     * The goal is to check, whether brackets are in a correct sequence.
     * I.e. any opening bracket should have closing bracket of the same type somewhere further by the string,
     * and bracket pairs should not overlap, though they could be nested:
     *
     * examples:
     * "(a+[b*c]-{d/3})" returns true
     * "(a + [b * c) - 17]" returns false (overlapping)
     * "(((a * x) + [b] * y) + c" returns false
     * "<< fluffy > [[Pillows]]>" returns true
     *
     * @param string
     * @return true if brackets match and false otherwise.
     */
    public static boolean isMatching(String string) {
        return false; //TODO
    }


    //BONUS CHALLENGES - difficult

    /**
     * An abundant number is a number for which the sum of its proper divisors
     * (divisors not including the number itself) is greater than the number itself.
     * For example, 12 is abundant because its proper divisors are 1, 2, 3, 4, and 6 which add up to 16.
     *
     * Print all the abundant numbers from 1 to 100 inclusive, each on their own line.
     *
     * BONUS - this Challenge is from code.golf, Code Golf is a game designed to let you show off your
     * code-fu by solving problems in the least number of characters. Try to solve this challenge using
     * as few characters as you can.
     */
    public static void printAbundentNumbers() {

    }


    /**
     * Even more difficult.
     * This one is also about brackets but of a single kind - let them be round brackets.
     *
     * For given N you are to tell how many correct bracket strings of length 2N could be built.
     *
     *  examples of correct bracket strings:
     *  (()(()(()))), ()()()()(()), (())(())()(), etc...
     *
     * Examples:
     *
     * Here is only one variant for N=1: ()
     * Two variants for N=2: ()() and (())
     * Five for N=3: ((()))  (())()  ()(())  (()())  ()()()
     *
     *
     * @param n
     * @return the number of varients of given N
     */
    public static int numberOfVarients(int n) {
        return 0; //TODO
    }

    // TEST CLIENT
    public static void main(String[] args) {
        //challenge 1
        System.out.println(isMatching("(a+[b*c]-{d/3})"));
        System.out.println(isMatching("(a + [b * c) - 17]"));
        System.out.println(isMatching("(((a * x) + [b] * y) + c"));
        System.out.println(isMatching("<< fluffy > [[Pillows]]>"));
        System.out.println();

        //challenge 2
        printAbundentNumbers();
        System.out.println();

        //challenge 3
        System.out.println(numberOfVarients(1));
        System.out.println(numberOfVarients(2));
        System.out.println(numberOfVarients(3));
        System.out.println(numberOfVarients(4));
    }
}
