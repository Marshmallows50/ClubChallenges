package ConvertString;

/**
 * Programming club challenge for February 15, 2023.
 */
public class ConvertString {
    /**
     * convert str1 to str2.
     * Operations can consist of inserting, removing, or replacing a single
     * character at a time to make str1 equal str2.
     *
     * The method should throw an IllegalArgumentException if any input is null.
     *
     * Extra Challenge: find and print the minimum number operations to convert str1 to str2.
     * Examples:
     * inputs: "dog" and "fog" prints 1 (replace 'd' with 'f' in str1)
     * inputs: "tuesday" and "wednesday" prints 4
     * inputs: "123" and "456" prints 3
     *
     * We encourage collaboration with other club members.
     *
     * @param str1 the string to be converted into str2
     * @param str2 the string str1 should be converted to
     * @return String that was converted to str2
     * @throws IllegalArgumentException when str1 or str2 are null
     */
    public static String convertString(String str1, String str2){
        return null; //TODO
    }

    public static void main(String[] args) {
        System.out.println("dog and fog: " + convertString("dog", "fog")); // 1 minimum

        System.out.println("tuesday and wednesday: " + convertString("tuesday", "wednesday")); // 4 minimum

        System.out.println("123 and 456: " + convertString("123","456")); // 3 minimum

        System.out.println("abc and null: " + convertString("abc", null)); // IllegalArgumentException
    }
}