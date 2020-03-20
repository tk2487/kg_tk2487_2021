import java.util.HashMap;

class Main {
    public static void main(String[] argv) {
        String s1 = argv[0];
        String s2 = argv[1];
        System.out.println(mapping(s1, s2));
    }

    public static boolean mapping(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<Character, Character>(); // Map characters of string 1 to string 2

        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                if (map1.get(s1.charAt(i)) != s2.charAt(i)) {
                    return false;
                }
            } else {
                map1.put(s1.charAt(i), s2.charAt(i));
            }
        }
        
        return true;
    }
}
