/*
 * Write a function that accepts a character array, a zero-based start position and a length. It should return a character array containing containing 
 * lengthcharacters starting with the startcharacter of the input array. 
 * The function should do error checking on the start position and the length and return null if the either value is not legal.
The function signature is:
char[ ] f(char[ ] a, int start, int len)
 */


public class arraySlice {
    public static void main(String[] args){
        char[] test = sliceArray(new char[]{'a', 'b', 'c'}, 0, 1);
        System.out.println(new String(test));
    }
    public static char[] sliceArray(char[] a, int start, int len){
        int count = 0;
        char[] newArray = {};
        int k = 0;
        for( int i = start; i <= a.length -1; i++){
            count = count + 1;
        }
        if( count > len){
            return null;
        }
        else{
            for (int j = start; j <= a.length - 1; j++){
                newArray[k] = a[j];
                k++;
            }
        }
        return newArray;
    }
}
