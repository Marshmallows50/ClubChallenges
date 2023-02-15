package editDistance;

/**
 * Programming club challenge for February 15, 2023.
 */
public class EditDistance {
    /**
     * Find the minimum number operations to convert str1 to str2.
     * Operations can consist of inserting, removing, or replacing a single
     * character at a time to make str1 equal str2.
     *
     * The method should throw an IllegalArgumentException if any input is null.
     *
     * Examples:
     * inputs: "dog" and "fog" return 1 (replace 'd' with 'f' in str1)
     * inputs: "tuesday" and "wednesday" return 4
     * inputs: "123" and "456" return 3
     *
     * For 2410/2420 students, make another method and try to do this recursively
     * and non-recursively. Afterwards, figure out which solution is more efficient.
     *
     * @param str1 the string to be converted into str2
     * @param str2 the string str1 should be converted to
     * @return The number of edits/operations it takes to transform str1 to str2
     * @throws IllegalArgumentException when str1 or str2 are null
     */
    public static int editDistance(String str1, String str2){
        return 0; //TODO
    }

    public static void main(String[] args) {
        System.out.println("dog and fog: " + editDistance("dog", "fog")); // 1

        System.out.println("tuesday and wednesday: " + editDistance("tuesday", "wednesday")); // 4

        System.out.println("123 and 456: " + editDistance("123","456")); // 3

        System.out.println("abc and null: " + editDistance("abc", null)); // IllegalArgumentException
    }
}