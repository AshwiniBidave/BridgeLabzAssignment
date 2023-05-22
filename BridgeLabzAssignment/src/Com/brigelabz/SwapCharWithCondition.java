
public class SwapCharWithCondition {
    public static void main(String[] args) {
        System.out.println(flipEndChars("Cat, dog, and mouse.")); // Output: ".at, dog, and mouseC"
        System.out.println(flipEndChars("ada")); // Output: "Two's a pair."
        System.out.println(flipEndChars("Ada")); // Output: "adA"
        System.out.println(flipEndChars("z")); // Output: "Incompatible."
    }

    public static String flipEndChars(String str) {
        if (str.length() < 2) {
            return "Incompatible.";
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);

        if (firstChar == lastChar) {
            return "Two's a pair.";
        }

        return lastChar + str.substring(1, str.length() - 1) + firstChar;
    }
}

