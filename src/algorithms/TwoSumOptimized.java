package algorithms;

/*
https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSumOptimized {
    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        int target = 9;

        TwoSumOptimized solucao = new TwoSumOptimized();
        int[] resultado = solucao.twoSum(input, target);

        System.out.println("Resultado: " + Arrays.toString(resultado));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int numero = nums[i];
            int numeroASerBuscado = target - numero;
            if(hashMap.containsKey(numeroASerBuscado)) {
                return new int[] {hashMap.get(numeroASerBuscado), i};
            }
            hashMap.put(numero, i);
        }
        throw new IllegalArgumentException("Não tem solução");
    }
}
