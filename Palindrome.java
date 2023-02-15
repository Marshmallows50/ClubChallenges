package palendrome;

/**
 * Determines if a character array contains a palindrome.
 * @author Your Name Here!
 */
public class Palindrome {

    /**
     * Checks if a character array contains a palindrome
     * @param palindromeArray array to be checked
     * @return <code>true</code> if array contains a palindrome, otherwise returns <code>false</code>.
     */
    public static boolean isPalindrome(char[] palindromeArray){
        int rightSide = palindromeArray.length - 1;
        for (int i=0; i < rightSide; i++) {
            if (!(palindromeArray[i] == palindromeArray[rightSide - i]))
                return false;
        }
        return true;
    }

    /**
     * A testing method that prints information
     * on if our palindrome is truly a palindrome or not.
     * @param palindromeArray
     * @author Rianna McIntyre
     */
    public static void palindromeTester(char[] palindromeArray){
        System.out.printf("%s is a palindrome .. %b! \n",
                String.valueOf(palindromeArray), isPalindrome(palindromeArray));
    }

    // = = = = = TEST CLIENT = = = = = = //
    public static void main(String[] args){
        char[] palindromeOne = new char[] {'t','a','c','o','c','a','t'}; //tacocat
        char[] palindromeTwo = new char[] {'c','i','v','i','c'}; //civic
        char[] palindromeThree = new char[] {'r','o','t','a','t','o','r'}; //rotator
        char[] palindromeFour = new char[] {'r','a','c','e','c','a','r'}; //racecar
        char[] palindromeFive = new char[] {'l','i','e','s'}; //lies ... NOT A PALINDROME!

        char[][] allPalindromes = new char[][] {
              palindromeOne, palindromeTwo, palindromeThree, palindromeFour, palindromeFive
        };

        for (char[] palindrome : allPalindromes) {
            palindromeTester(palindrome);
        }
    }

}
