/**
 * NOT DONE
 */

public class LeetCode1071 {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder build = new StringBuilder();

        if (str1.length() < str2.length()) {
            build.append(str1);
            if (str2.toLowerCase().contains(build.toString().toLowerCase())) {
                return build.toString();
            }
        } else if (str2.length() < str1.length()) {
            build.append(str2);
            reduce(str1, str2);
            if (str1.toLowerCase().contains(build.toString().toLowerCase())) {
                return build.toString();
            }
        }

        String ans = "";

        return ans;
    }

    public String reduce(String str1, String str2) {
        StringBuilder build = new StringBuilder();

        if (str1.length() < str2.length()) {
            build.append(str1);
            if (str2.toLowerCase().contains(build.toString().toLowerCase())) {
                return build.toString();
            }
        } else if (str2.length() < str1.length()) {
            build.append(str2);
            if (str1.toLowerCase().contains(build.toString().toLowerCase())) {
                return build.toString();
            }
        }

        return null;
    }
}
