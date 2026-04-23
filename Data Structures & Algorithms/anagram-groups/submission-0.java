class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        for(String s : strs){
            int [] character = new int[26];
            for(char c : s.toCharArray()){
                character[c-'a']++;
            }
            String key = Arrays.toString(character);
            anagram.putIfAbsent(key, new ArrayList<>());
            anagram.get(key).add(s);
        }
        return new ArrayList<>(anagram.values());
    }
}
