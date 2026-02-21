package algorithms;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        RemoveDuplicatesFromSortedArray remove = new RemoveDuplicatesFromSortedArray();
        int k = remove.removeDuplicates(nums);
        System.out.println("k: " + k);
        for(int num : nums) {
            System.out.println(num);
        }
    }


    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int numero = nums[0];
        int iterador = 1;
        int k = 1;
        int posicaoUltimoK = 0;

        while(iterador < nums.length && nums[iterador] >= numero) {
            if(nums[iterador] > numero) {
                k++;
                posicaoUltimoK++;
                nums[posicaoUltimoK] = nums[iterador];
            }
            numero = nums[iterador];
            iterador++;
        }

        return k;
    }

}
