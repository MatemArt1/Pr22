public class Like22 {
    public class Solution {
        public static Object[] longestRepetition(String s) {

            int count = 1;
            int max = 0;
            String result = "";
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                    count++;
                    if (count > max) {
                        max = count;
                        result = s.substring(i + 1, i + 2);
                    }
                } else {
                    count = 1;
                }

            }
            return new Object[]{result, max};
        }
    }
}
