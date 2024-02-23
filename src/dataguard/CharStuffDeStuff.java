package dataguard;

public abstract class CharStuffDeStuff {

    static final String START = "DLESTX ";
    static final String END = " DLEETX";

    public static String stuffData(String input) {
        StringBuilder stuffed = new StringBuilder(START);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'D' && input.charAt(i + 1) == 'L' && input.charAt(i + 2) == 'E') {
                stuffed.append("DLEDLE");
                i += 2;
            } else {
                stuffed.append(input.charAt(i));
            }

        }

        stuffed.append(END);

        return stuffed.toString();
    }

    public static String deStuffData(String input) {
        StringBuilder destuffed = new StringBuilder();
        for (int i = 6; i < input.length(); i++) {
            if (input.charAt(i) == 'D' && input.charAt(i + 1) == 'L' && input.charAt(i + 2) == 'E' && input.charAt(i + 3) == 'D' && input.charAt(i + 4) == 'L' && input.charAt(i + 5) == 'E') {
                destuffed.append("DLE");
                i += 5;
            } else {
                destuffed.append(input.charAt(i));
            }
        }
        destuffed.delete(destuffed.length() - 7, destuffed.length());

        return destuffed.toString();
    }
}
