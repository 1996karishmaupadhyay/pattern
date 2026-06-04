public class StringsBasic {
    class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else{
                 i++;
                j--;
               
            }
        }
        return true;
    }
}
    public static void validatePalindrome(String s) {
        // use the inner Solution class to check palindrome
        StringsBasic outer = new StringsBasic();
        Solution sol = outer.new Solution();
        boolean isPal = sol.isPalindrome(s);
        System.out.println(s + " -> " + isPal);
    }
    public static void main(String[] args) {
        String name = " Aarti tyagi&^*123";
        // System.out.println(name);
        // System.out.println(name.length());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.charAt(2));
        // System.out.println(name.indexOf('a'));
        // System.out.println(name.indexOf('t'));
        // System.out.println(name.indexOf('z'));
        // System.out.println(name.substring(1, 4));
        // System.out.println(name.substring(2));
        // System.out.println(name.replace('a', 'x'));
        // System.out.println(name.replace("ar", "xy"));
        // System.out.println(name.contains("art"));
        // System.out.println(name.contains("xyz"));
        // System.out.println(name.startsWith("Aa"));
        // System.out.println(name.endsWith("gi"));
        // System.out.println(name.equals(" Aarti tyagi"));
        // System.out.println(name.equals("aarti"));
        // System.out.println(name.equalsIgnoreCase(" aarti tyagi"));

        // print ascii value of each character in the string
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + " : " + (int) name.charAt(i));
        }

        // count letter number special character and space in the string
        int letterCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;
        int spaceCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Letter Count: " + letterCount);
        System.out.println("Number Count: " + numberCount);
        System.out.println("Special Character Count: " + specialCharCount);
        System.out.println("Space Count: " + spaceCount);

        //
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else {
                ans.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(ans);

        validatePalindrome("Aarti tyagi");
    }
}
