import java.util.HashMap;

class Main {
    public static boolean main(String[] args) {
        String s1 = arg[0];
        String s2 = arg[1];
        if (s1.lenth != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<Character, Character>(); // Map characters of string 1 to string 2

        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                if (map.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
