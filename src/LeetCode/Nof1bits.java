package LeetCode;

public class Nof1bits {
    public static int hammingWeight(long n) {
        int c = 0;
        while(n > 0){
            c += n%10;
            n /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
//        System.out.println(hammingWeight(11111111111111111111111111111101));
    }
}
