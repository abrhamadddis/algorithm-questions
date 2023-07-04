/*
 * Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing 
 * lengthcharacters starting with the startcharacter of the input array. 
 * The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 */
import java.util.Arrays;

public class arraySlice {
    public static void main(String[] args){
        char[] test = sliceArray(new char[]{'a', 'b', 'c'}, 0, 4);
        System.out.println(Arrays.toString(test));
    }
    public static char[] sliceArray(char[] a, int start, int len){
        if( start < 0 || len < 0 || start + len - 1 >= a.length){
            return null;
        }
        char[] newArray = new  char[len];
        for (int i=start, j=0; j<len; i++, j++)
        {
            newArray[j] = a[i];
        }
        return newArray;
    }
}
