package algorithms;

/*
https://leetcode.com/problems/palindrome-number/description/

Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:

-231 <= x <= 231 - 1
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;

        PalindromeNumber solucao = new PalindromeNumber();
        boolean resposta = solucao.isPalindrome(x);

        System.out.println("Resultado: " + resposta);
    }

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int original = x;
        int reverso = 0;

        while(x != 0) {
            int ultimoDigito = x % 10;
            x /= 10;
            reverso = (reverso * 10) + ultimoDigito;
        }

        return original == reverso;
    }
}
