class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if(x.containsKey(need)){
                return new int[]{x.get(need),i};
            }
            x.put(nums[i],i);
        }
        return null;
    }
}