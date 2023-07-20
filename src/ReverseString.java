public class ReverseString {
    public static void main(String[] args) {
        String output = reverse("shantanu");
        System.out.println(output);
    }

    private static String reverse(String input) {
        String output = "";
        if (input.isEmpty()) { // Check if the string in empty
            return "String is empty";
        } else {
            String trimmedString = input.trim();

            for (int i = trimmedString.length() - 1; i >= 0; i--) {
                output = output + trimmedString.charAt(i);
            }
        }
        return output;
    }

}