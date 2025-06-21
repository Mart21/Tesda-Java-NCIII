public class CheckVowelsAndConsonant {

    public static void checkSwitch(char ch) {
        System.out.println("\n--- Checking '" + ch + "' with switch ---");
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not an alphabet.");
                }
        }
    }
  
    public static void main(String[] args) {
       
        char testChar1 = 'E';
        checkSwitch(testChar1); // Example usage

        char testChar2 = 'r';
        checkSwitch(testChar2);

        char testChar3 = '$';
        checkSwitch(testChar3);
    }
}