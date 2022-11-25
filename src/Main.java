public class Main {
    /*
    Character with longest consecutive repetition.
    For a given string s find the character c (or C) with longest consecutive repetition and return:
Object[]{c, l};
where l (or L) is the length of the repetition.
If there are two or more characters with the same l return the first in order of appearance.

For empty string return:

Object[]{"", 0}
     */
    public class Solution {
        public static Object[] longestRepetition(String s) {
            if (s == "") return new Object[]{"", 0};
            int maxl = 1;
            char maxc = s.charAt(0);
            int l = 1;
            char c = s.charAt(0);
            for (int i = 1; i < s.length(); i++)
            {
                if (s.charAt(i) == s.charAt(i - 1))
                {
                    c = s.charAt(i);
                    l++;
                }
                else
                {
                    l = 1;
                }
                if (l > maxl)
                {
                    maxl = l;
                    maxc = c;
                }
            }
            return new Object[]{ "" + maxc, maxl};
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}