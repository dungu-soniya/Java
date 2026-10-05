public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello Java";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. substring()
        System.out.println("Substring: " + str.substring(6));

        // 6. contains()
        System.out.println("Contains Java: " + str.contains("Java"));

        // 7. startsWith()
        System.out.println("Starts with Hello: " + str.startsWith("Hello"));

        // 8. endsWith()
        System.out.println("Ends with Java: " + str.endsWith("Java"));

        // 9. equals()
        String str2 = "Hello Java";
        System.out.println("Equals: " + str.equals(str2));

        // 10. equalsIgnoreCase()
        String str3 = "hello java";
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str3));

        // 11. indexOf()
        System.out.println("Index of Java: " + str.indexOf("Java"));

        // 12. replace()
        System.out.println("Replace: " + str.replace("Java", "World"));

        // 13. trim()
        String str4 = "   Hello Java   ";
        System.out.println("Trim: " + str4.trim());

        // 14. concat()
        System.out.println("Concat: " + str.concat(" Programming"));
    }
}
