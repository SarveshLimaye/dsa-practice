public class Skip {
    public static void main(String[] args) {
        String ans = "badcftra";
        System.out.println(SkipChar(ans));
        String ans1 = "loitadkjhyuiadk";
        System.out.println(SkipString(ans1));

    }

    static String SkipChar(String input) {
        if (input.isEmpty()) {
            return "";
        }

        char ch = input.charAt(0);

        if (ch == 'a') {
            return SkipChar(input.substring(1));
        } else {
            return ch + SkipChar(input.substring(1));
        }
    }

    static String SkipString(String input) {
        if (input.isEmpty()) {
            return "";
        }
        if (input.startsWith("adk")) {
            return SkipString(input.substring(3));
        } else {
            return input.charAt(0) + SkipString(input.substring(1));
        }

    }
}
