public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello Java";
        String str2 = "Programming";

        // 1. length()
        System.out.println("1. Length: " + str.length());

        // 2. charAt()
        System.out.println("2. Character: " + str.charAt(1));

        // 3. toUpperCase()
        System.out.println("3. Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("4. Lowercase: " + str.toLowerCase());

        // 5. concat()
        System.out.println("5. Concatenation: " + str.concat(" World"));

        // 6. replace()
        System.out.println("6. Replace: " + str.replace("Java", "World"));

        // 7. substring()
        System.out.println("7. Substring: " + str.substring(6));

        // 8. contains()
        System.out.println("8. Contains: " + str.contains("Java"));

        // 9. startsWith()
        System.out.println("9. Starts with: " + str.startsWith("Hello"));

        // 10. endsWith()
        System.out.println("10. Ends with: " + str.endsWith("Java"));

        // 11. equals()
        System.out.println("11. Equals: " + str.equals("Hello Java"));

        // 12. equalsIgnoreCase()
        System.out.println("12. Equals Ignore Case: "
                + str.equalsIgnoreCase("hello java"));

        // 13. indexOf()
        System.out.println("13. Index: " + str.indexOf("Java"));

        // 14. trim()
        String text = "   Hello Java   ";
        System.out.println("14. Trim: " + text.trim());

        // 15. isEmpty()
        System.out.println("15. Is Empty: " + str.isEmpty());
    }
}
