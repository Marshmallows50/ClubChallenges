package palendrome;

import java.util.*;

/**
 * Additional methods for those who like an extra challenge.
 */
public class ExtraChallenges {

    private static final String HashMap = null;

    // = = = = = =  E X T R A   C H A L L E N G E 1  = = = = = =
	/**
     * Reverses the elements of a character array.
     * 
     * Try to do that without using String or StringBuilder.
     * 2420: Can you reverse the array without using extra memory?
     * 
     * @param array array to be checked
     *
     */
    public static void reverse(char[] array){
        Stack<Character> s = new Stack<>();
        for (char c: array) {
            s.push(c);
        }
        for (int i =0; i < array.length; i++){
            array[i] = s.pop();
        }
    }
    
    /**
     * Helps test the method reverse 
     * by calling it with various character arrays.
     */
    public static void testReverse(){
    	System.out.println("Testing reverse:");
    	System.out.println("----------------");
    	char[] array = "Hello".toCharArray();
    	reverse(array);
        System.out.println("Hello" + " => " + String.valueOf(array));
        
    	array = "SLCC".toCharArray();
    	reverse(array);
        System.out.println("SLCC" + " => " + String.valueOf(array));
        
    	array = "x".toCharArray();
    	reverse(array);
        System.out.println("x" + " => " + String.valueOf(array));     

    	array = "".toCharArray();
    	reverse(array);
        System.out.println("" + " => " + String.valueOf(array));
        System.out.println();
    }
    
    // = = = = = =  E X T R A   C H A L L E N G E 2  = = = = = =
    /**
     * Finds the first character in the 
     * array that is included exactly once.
     * If no such character exists, an IllegelArgumentException 
     * is thrown.
     * 
     * E.g., [a x a c x w ] should return c
     * 2420: What is the bigO of your solution?
     * 
     * @param array array to be checked
     * @return first character that appears only once in the array
     */
    public static char firstCharacterIncludedOnce(char[] array){ 
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c:array) {
            if(!map.containsKey(c))
                map.put(c, 1);
            else
                map.replace(c, map.get(c)+1);
        }
        Set<Map.Entry<Character, Integer>> s = map.entrySet();
        for (Map.Entry<Character, Integer> e: s) {
            if (e.getValue() == 1)
                return e.getKey();
        }
        throw new IllegalArgumentException("no character appears only once.");
    }
    
    /**
     * Helps test the method reverse 
     * by calling it with various character arrays.
     */
    public static void testFirstCharacterIncludedOnce(){
    	System.out.println("Testing firstCharacterIncludedOnce:");
    	System.out.println("-----------------------------------");
    	
    	char[] array = "Hello".toCharArray();
        System.out.printf("%30s: expected = H actual = %c%n", "Hello", firstCharacterIncludedOnce(array));
        
    	array = "racecar".toCharArray();
        System.out.printf("%30s: expected = e actual = %c%n", "racecar", firstCharacterIncludedOnce(array));   
    	
        array = "eel".toCharArray();
        System.out.printf("%30s: expected = l actual = %c%n", "eel", firstCharacterIncludedOnce(array));
        
    	array = "acdefghijklmnoonmlkjihgfedcBa".toCharArray();
        System.out.printf("%30s: expected = B actual = %c%n", "acdefghijklmnoonmlkjihgfedcBa", firstCharacterIncludedOnce(array));   
      
    	array = "x".toCharArray();
        System.out.printf("%30s: expected = x actual = %c%n", "x", firstCharacterIncludedOnce(array));
        
    	array = "".toCharArray(); 
    	 firstCharacterIncludedOnce(array); // expected: IllegalArgumentException
        System.out.println();
    } 

    // = = = = = TEST CLIENT = = = = = =//
    public static void main(String [] args){
    	testReverse();
    	testFirstCharacterIncludedOnce();
    }
}
