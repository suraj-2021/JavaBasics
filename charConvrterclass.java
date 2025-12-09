class LowerToUpper {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            result = result + ch;
        }

        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + result);
    }
}
