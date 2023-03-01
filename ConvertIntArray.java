package ConvertIntArray;

import java.util.Arrays;

public class ConvertIntArray {


    /**
     * First Challenge, this one is easy, so make it fast and efficient.
     * Obviously, don't use an existing method.
     *
     * Convert an int into an array consisting of the digits of
     * that number.
     *
     * examples:
     * 5656 returns [5,6,5,6]
     * 000 returns [0]
     *
     * Extra Challenge: Try to optimize and do this with the least amount of
     * memory that you can. You can use
     * <code>Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()</code>
     * to get your current memory usage. Compare your memory usage before and after
     * the method runs. You should put this in the main method.
     *
     * @param original - the number to be turned into an array
     * @return int[] consisting of the digits of <code>original</code>
     * @throws IllegalArgumentException if the number is less than 0
     */
    public static int[] convertIntToArray(int original) {
        return null;
    }


    /**
     * Second Challenge.
     *
     * Convert an int[] into a regular int consisting of the digits in the
     * array, but in sorted order from largest to smallest.
     *
     * examples:
     * [3,1,8,6] returns 8631
     * [1,5,9,5] returns 9551
     *
     * Extra Challenge 1: implement your own or a popular sorting algorithm
     * to sort numbers, don't use an existing solution. Try to find one that
     * works well for this particular use case if you can.
     *
     * Extra Challenge 2: Try to optimize and do this with the least amount of
     * memory that you can. You can use
     * <code>Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()</code>
     * to get your current memory usage. Compare your memory usage before and after
     * the method runs. You should put this in the main method.
     *
     * @param array - array to be converted into an int
     * @return an int consisting of the digits in <code>array</code> but
     * in sorted order
     *
     * @throws IllegalArgumentException if the array has any numbers less than 0
     * @throws IllegalArgumentException if the array is empty.
     */
    public static int convertIntArrayToSortedInt(int[] array) {
        return 0;
    }


    public static void main(String[] args) {
        // ~~~~~~~~~TEST CLIENT~~~~~~~~~
        // feel free to add anything to the main method.
        System.out.println("Numbers Converted to Array:");
        System.out.println("12345: " + Arrays.toString(convertIntToArray(12045)));
        System.out.println("000: " + Arrays.toString(convertIntToArray(000)));
        System.out.println("5656: " + Arrays.toString(convertIntToArray(5656)));
        System.out.println("1: " + Arrays.toString(convertIntToArray(1)));
//        System.out.println("-29: " + Arrays.toString(convertIntToArray(-29))); // exception
        System.out.println();

        System.out.println("Arrays converted into ints:");
        System.out.println("[3,1,8,6]: " + convertIntArrayToSortedInt(new int[] {3, 1, 8, 6}));
        System.out.println("[1,5,9,5]: " + convertIntArrayToSortedInt(new int[] {1, 5, 9, 5}));
        System.out.println("[-3,1,8,6]: " + convertIntArrayToSortedInt(new int[] {-3, 1, 8, 6})); // exception
//        System.out.println("[]: " + convertIntArrayToSortedInt(new int[] {})); // exception




    }
}
