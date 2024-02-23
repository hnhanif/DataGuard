package dataguard;

public class DecimalBinaryConverter {

    // Method to convert decimal to binary
    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            int digit = num % 2;
            binary.insert(0, digit);
            num = num / 2;
        }
        return binary.toString();
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        char[] binaryArray = binary.toCharArray();
        for (int i = binaryArray.length - 1; i >= 0; i--) {
            int portion = Character.getNumericValue(binaryArray[i]) * (int) Math.pow(2, binaryArray.length - 1 - i);
            decimal += portion;
        }
        return decimal;
    }

    // Method to convert IP address from decimal to binary
    public static String ipDecimalToBinary(String ipAddress) {
        String[] address = ipAddress.split("\\.");
        StringBuilder ipBinary = new StringBuilder();

        for (String add : address) {
            int decimal = Integer.parseInt(add);
            String binDigit = decimalToBinary(decimal);

            // Ensure that each binary digit is 8 characters long
            while (binDigit.length() < 8) {
                binDigit = "0" + binDigit;
            }

            ipBinary.append(binDigit).append(".");
        }

        return ipBinary.substring(0, ipBinary.length() - 1);
    }

    // Method to convert IP address from binary to decimal
    public static String ipBinaryToDecimal(String ipAddress) {
        String[] address = ipAddress.split("\\.");
        StringBuilder decimalAddress = new StringBuilder();
        for (String add : address) {
            int decimal = binaryToDecimal(add);
            decimalAddress.append(decimal).append(".");
        }
        return decimalAddress.substring(0, decimalAddress.length() - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test case 1: Convert IP address from decimal to binary and then back to decimal
        String result1 = ipDecimalToBinary("205.55.91.243");
        System.out.println("Binary IP address: " + result1);
        System.out.println("Decimal IP address: " + ipBinaryToDecimal(result1));

        // Test case 2: Convert decimal to binary and then back to decimal
        int decimalNumber = 42; // Change this value for different test cases
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary number: " + binaryNumber);
        int decimalConvert = binaryToDecimal(binaryNumber);
        System.out.println("Converted Decimal number: " + decimalConvert);
    }
}
