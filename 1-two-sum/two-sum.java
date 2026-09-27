class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> abc = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer compliment=target-nums[i];
            if(abc.containsKey(compliment)){
                return new int[]{abc.get(compliment),i};
            }
            abc.put(nums[i],i);
            } 
            return new int[]{};

        }
    }
