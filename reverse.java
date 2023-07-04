/**
 * Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
   The signature of the function is:
   int f(int n)
 */
class reverse{
    public static void main(String[] args){
        int test = reverseNum(0);
        System.out.println(test);
    }
    public static int reverseNum(int num){
        int x = 0;
        int rev = 0;
        if (num < 0){
            num = num * -1;
            while (num > 10)
            {
            x = num % 10;
            num = num / 10;
            rev = (rev + x) * 10;
            }
            return -1 * (rev + num);
        }
        while (num > 10){
            x = num % 10;
            num = num / 10;
            rev = (rev + x) * 10;
        }
        return rev + num;
    }
}