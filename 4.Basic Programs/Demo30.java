//! Write a program to find the sum of digit until a single digit? 
public class Demo30 {

    public static void main(String[] args) {
        int n=38;
        System.out.println(addDigits(n));

    }

    public static int addDigits(int n) {
        int sum = n;
        while (n / 10 > 0) {
            int temp = n;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n = sum;
        }
        return sum;
    }
}

