class Solution {
    public boolean isAnagram(String s, String t) {
        return getMap(s).equals(getMap(t));
    }
    private HashMap<Character, Integer> getMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            Character l = s.charAt(i);
            map.put(l, map.getOrDefault(l, 0) + 1);
        }
        return map;
    }
}
