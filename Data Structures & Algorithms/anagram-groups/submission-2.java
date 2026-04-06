class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String s: strs){
        char[] string = s.toCharArray();
        Arrays.sort(string);
        String t = new String(string);
        if(!map.containsKey(t)){
            List<String> list = new ArrayList<>();
            list.add(s);
            map.put(t, list);
        }
        else{
            map.get(t).add(s);
        }
    }
    return new ArrayList<>(map.values());
}
}
