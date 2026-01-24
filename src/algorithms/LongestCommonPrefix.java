package algorithms;

/*
https://leetcode.com/problems/longest-common-prefix/description/
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String resultado = longestCommonPrefix(strs);
        System.out.println(resultado);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) {
            return strs[0];
        }

        String menorPalavra = strs[0];
        for(String palavra : strs) {
            if(palavra.length() < menorPalavra.length()) {
                menorPalavra = palavra;
            }
        }

        if(menorPalavra.equals("")) {
            return "";
        }

        String resposta = "";
        int k = 0;

        while(resposta.length() < menorPalavra.length()) {
            for(int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(k) != menorPalavra.charAt(k)) {
                    return resposta;
                }
            }
            resposta += menorPalavra.charAt(k);
            k++;
        }
        return resposta;
    }
}
