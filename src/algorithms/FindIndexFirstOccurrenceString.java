package algorithms;

/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

public class FindIndexFirstOccurrenceString {
    public static void main(String[] args) {
        FindIndexFirstOccurrenceString f = new FindIndexFirstOccurrenceString();
        String haystack = "mississippi";
        String needle = "issipi";

        int indice = f.strStr(haystack, needle);
        System.out.println(indice);

        int indice2 = f.solucao2(haystack, needle);
        System.out.println(indice2);
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int solucao2(String haystack, String needle) {
        boolean encontrou = false;
        int indice = 0;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                encontrou = true;
                indice = i;
                for(int j = 1; j < needle.length(); j++) {
                    if(j >= haystack.length() || j+i >= haystack.length()) {
                        return -1;
                    }
                    if (!(haystack.charAt(i + j) == needle.charAt(j))) {
                        encontrou = false;
                        break;
                    }
                }
                if(encontrou) {
                    return indice;
                }
            }
        }
        return -1;
    }
}
