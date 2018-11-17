package Easy;

import java.util.HashMap;

public class TwoSum {
    class Solution {
        int num[] = {2,7,11,15};
        int target = 9;
        int[] answer = new int[2];
        public int[] twoSum(int[] nums, int target) {
            //Since there is one solution, just find the compliment
            HashMap<Integer,Integer> track = new HashMap<>();
            for (int i=0; i<nums.length;i++){
                track.put(nums[i],i);
            }
            for (int i=0; i<nums.length;i++){
                int current = nums[i];
                int compliment = target-current;
                if (track.containsKey(compliment) && track.get(compliment)!=i){
                    answer[0] = i;
                    answer[1] = track.get(compliment);
                }
            }
            return answer;
        }

    }
}
