public class Demo31 {
    public static void main(String[] args) {
        int n = 2;
        int output[] = countBits(n);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    // ? Approach 1
    public static int[] countBits(int n) {
        int count[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            count[i] = count[i >> 1] + i % 2;
        }
        return count;
    }

    // ? Approach 2
    /* public int[] countBits(int n) {
        int count[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            String binary = DecimalToBinary(i);
            String binary = Integer.toBinaryString(i);
            count[i] = CountOne(binary);
        }
        return count;
    }

    public String DecimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int last = n & 1;
            sb.insert(0, last);
            n = n >> 1;
        }
        return sb.toString();
    }

    public int CountOne(String binary) {
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    } */
}


