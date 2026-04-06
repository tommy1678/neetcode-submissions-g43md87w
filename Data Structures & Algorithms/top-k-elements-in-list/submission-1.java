class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> value = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            value.add(new int[] {m.getKey(), m.getValue()});
        }
        value.sort((a, b) -> b[1] - a[1]);

        int[] ans = new int[k];

        for (int i = 0; i <k; i++){
            ans[i] = value.get(i)[0];
        }
        return ans;
    }
}
