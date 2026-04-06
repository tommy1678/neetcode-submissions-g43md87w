class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create hashmap for each string in list
        //key is hashmap and value is list of strings
        //new key, add hashmap and new list containing string
        //same key, add string to the list
        //return each list

        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();
        for (String s : strs){
            HashMap<Character, Integer> word = new HashMap<>();
            word = getMap(s);
            if (!map.containsKey(word)){
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(word, list);
            }
            else{
                List<String> list = map.get(word);
                list.add(s);
                map.put(word, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    private HashMap<Character, Integer> getMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }
}
