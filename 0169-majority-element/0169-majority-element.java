class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Collections.max(map.values());
        int k=0;

        for (Integer key : map.keySet()) {
            if (map.get(key).equals(max)) {
                k = key;
                break; 
            }
        }

        return k;
    }
    }
