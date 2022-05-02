import java.util.*;

/**
 * app01
 * Find the strength a password as per the definition of strength mentioned
 * below.The strength of a password is the sum of all the unique characters in
 * all the possible substrings of a word.E.g password is "test" and possible
 * substrings are -> "t","e","s","t", "te","es","st", "tes", "est", "test"
 * For e.g. Here the strength is 1 + 1 + 1 + 1+ 2+ 2 + 2 + 3 + 3 + 3 = 19
 * 
 */
public class app01 {
    public static void main(String[] args) {
        String str = "test";
        System.out.println(fun(str));
    }

    static int fun(String str) {
        int strength = 0;
        Set<String> list = new HashSet<>();
        generateSubstrings(str, list);
        System.out.println(list);
        for (String ele : list)
            strength += ele.length();
        return strength;
    }


    static void generateSubstrings(String str, Set<String> list) {
        for (int i = 0; i < str.length(); i++) {
            String subStr = "";
            for (int j = i; j < str.length(); j++) {
                subStr += str.charAt(j);
                list.add(subStr);
            }
        }
    }

}