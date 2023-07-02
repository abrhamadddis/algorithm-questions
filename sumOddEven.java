/**
 * Write a function that takes an array of integers as an argument and returns a value based on 
 * the sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the 
 * array and let Y = the sum of the even numbers.The function should return X – Y
 */
class sumOddEven{
    public static void main(String[] args){
        int[] testCase = {};
        int out_Put = sumoddeven(testCase);
        System.out.println(out_Put);
    }
    public  static int sumoddeven(int[] array){
        int arraylen = array.length;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i <= arraylen - 1; i++){
            if( array[i] % 2 == 0){
                sumEven = sumEven + array[i];
            }
            else{
                sumOdd = sumOdd + array[i];
            }
        }
        return (sumOdd - sumEven);
    }
}