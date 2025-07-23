public class Demo33 {
    public static void main(String[] args) {
        int n = 10;
        binaryToDecimal(n);
        String binary = "1010";
        decimalToBinary(binary);
    }

    public static void binaryToDecimal(int decimal) {
        // ! using inbuilt method
        // String binary=Integer.toBinaryString(decimal);
        // System.out.println(binary);

        // ! Using manual Method
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        System.out.println("Binary : " + binary);
    }

    public static void decimalToBinary(String binary) {
        // ! using inbuilt method
        // int decimal=Integer.parseInt(binary,2);
        // System.out.println(decimal);

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal = decimal + bit * (int) Math.pow(2, power++);
        }
        System.out.println("Decimal :" + decimal);
    }
}
