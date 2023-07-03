/**
 * An array with an odd number of elements is said to be centered if all elements (except the middle one) are 
 * strictly greater than the value of the middle element. Note that only arrays with an odd number of elements 
 * have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered 
 * array, otherwise it returns 0.
 */
class isCenterd{
    public static void main(String[] args){
        int[] array1= {1};
        int output= iscenterd(array1);
        System.out.println(output);
    }
    public static int iscenterd(int[] array){
        int arrayLength = array.length;
        if ( arrayLength % 2 == 0){
            return 0;
        }
        else{
            int midIndex = (arrayLength)/2;
            for (int i = 0; i <= arrayLength - 1; i++){
                if( array[i] <= array[midIndex] && i != midIndex){
                    return 0;
                }
            }
            return 1;
        }

    }
}