package Medium;

import java.util.HashSet;

/**
https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums){
            if (hashSet.contains(num)){
                return num;
            }
            hashSet.add(num);
        }
        return -500;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();
        findTheDuplicateNumber.findDuplicate(nums);
    }
}