public class CaseConverter {
    // Convert lowercase string to uppercase
    public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If char is lowercase, convert to uppercase by subtracting 32
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    // Convert uppercase string to lowercase
    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If char is uppercase, convert to lowercase by adding 32
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        String lower = "hello world";
        String upper = "JAVA PROGRAM";

        System.out.println("Lower to Upper: " + toUpperCase(lower)); // outputs HELLO WORLD
        System.out.println("Upper to Lower: " + toLowerCase(upper)); // outputs java program
    }
}
