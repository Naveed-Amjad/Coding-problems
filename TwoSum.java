class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<>();

        int result[] = new int[2];

        for(int i =0; i< nums.length;i++){
            int temp = target - nums[i];
            if(hm.containsKey(temp)){
                result[0] = i;
                result[1] = hm.get(temp);
                break;
            }
            hm.put(nums[i],i);
        }
        return result;
	}
}