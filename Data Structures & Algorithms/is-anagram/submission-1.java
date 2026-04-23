class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        if(arrayT.length != arrayS.length){
            return false;
        }

    HashMap<Character, Integer> string1Map = new HashMap<Character,Integer>();
    HashMap<Character, Integer> string2Map = new HashMap<Character,Integer>();
    for(int i = 0; i < arrayS.length; i++){
        string1Map.put(arrayS[i], string1Map.getOrDefault(arrayS[i], 0)+1);
        string2Map.put(arrayT[i], string2Map.getOrDefault(arrayT[i], 0)+1);
    }
    if(string1Map.equals(string2Map)){
        return true;
    }
    return false;
    }
}
