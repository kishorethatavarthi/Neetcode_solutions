class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (key, value) -> value == null ? 1 : value + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = entries.get(i).getKey();
        }

        return ans;
        
    }
}
