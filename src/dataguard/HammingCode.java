package dataguard;

public class HammingCode {

    public static String generateServerSideCode(int[] inputBits) {
        // Set the input bits to '0111'


        // Call the method to generate Hamming code
        int[] originalCode = generateHammingCode(inputBits);

        // Convert the array to a string
        return arrayToString(originalCode);
    }

    public static String generateReceiverSideCode(int[] receivedCode) {
        // Convert the array to a string
        return arrayToString(receivedCode);
    }

    public static String checkMatch(String serverSideCode, String receiverSideCode) {
        if (serverSideCode.equals(receiverSideCode)) {
            return "Match: Server side code and Receiver side code are the same.";
        } else {
            int[] errorPositions = findErrorPositions(serverSideCode, receiverSideCode);
            return "Mismatch: Error Positions - " + arrayToString(errorPositions);
        }
    }

    private static int[] generateHammingCode(int[] inputBits) {
        int n = inputBits.length;
        int pN = 0;
        int i = 0;
        while (n + pN > Math.pow(2, i) - 1) {
            pN += 1;
            i += 1;
        }
        int codeLength = n + pN;
        int j = 0, k = 0;
        int[] code = new int[codeLength];
        for (i = 0; i < codeLength; i++) {
            if (i == Math.pow(2, k) - 1) {
                code[i] = 0;
                k += 1;
            } else {
                code[i] = inputBits[j];
                j += 1;
            }
        }
        for (i = 0; i < pN; i++) {
            int position = (int) Math.pow(2, i);
            int value = calculateParity(position, codeLength, code);
            code[position - 1] = value;
        }

        return code;
    }

    private static int calculateParity(int position, int codeLength, int[] code) {
        int count = 0;
        int i = position - 1;
        while (i < codeLength) {
            count += sumArray(code, i, Math.min(i + position, codeLength));
            i += 2 * position;
        }
        return count % 2;
    }

    private static int sumArray(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++)
            sum += array[i];
        return sum;
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i]).append(", ");
        }
        if (array.length > 0) {
            result.append(array[array.length - 1]);
        }
        return result.toString();
    }


    private static int[] findErrorPositions(String serverSideCode, String receiverSideCode) {
        int minLength = Math.min(serverSideCode.length(), receiverSideCode.length());
        int[] errorPositions = new int[minLength];
        int index = 0;
        for (int i = 0; i < minLength; i++) {
            if (serverSideCode.charAt(i) != receiverSideCode.charAt(i)) {
                errorPositions[index++] = i + 1;
            }
        }
        int[] result = new int[index];
        System.arraycopy(errorPositions, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        // Example usage in the main method
        String serverSideCode = generateServerSideCode(new int[]{0, 1, 1, 1});
        System.out.println("Server Side Code: " + serverSideCode);

        // For testing receiver side, replace the array with actual received code
        int[] receivedCode = {0, 1, 1, 1, 1};
        String receiverSideCode = generateReceiverSideCode(receivedCode);
        System.out.println("Receiver Side Code: " + receiverSideCode);

        // Check if the codes match and get error positions if they don't match
        String matchResult = checkMatch(serverSideCode, receiverSideCode);
        System.out.println(matchResult);
    }
}
