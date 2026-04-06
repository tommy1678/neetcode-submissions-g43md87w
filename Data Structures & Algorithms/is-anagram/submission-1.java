class Solution {
    public boolean isAnagram(String s, String t) {
        return map(s).equals(map(t));

    }
    private HashMap<Character, Integer> map(String x){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length(); i++){
            map.put(x.charAt(i), map.getOrDefault(x.charAt(i), 0) + 1);
        }
        return map;
    }
}
