class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        int l = 0;
        int r = 1;
        int max = 1;
        int count = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while (r < s.length()){
            map.put(s.charAt(l), 1);
            if (!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), 1);
                count++;
                max = Math.max(max, count);
                r++;
            }
            else{
                l++;
                r = l + 1;
                count = 1;
                map = new HashMap<Character, Integer>();
            }
        }
        return max;
    }
}
