class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String word : strs){
            int length = word.length();
            encoded.append(length).append("#").append(word);
        }
        return encoded.toString();
    }

    //4#neet4#code4#love3#you
    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();
        int i = 0;
        while(i < str.length()){
            int pos = str.indexOf("#", i);
            int size = Integer.parseInt(str.substring(i, pos));
            i = pos+1;
            decoded.add(str.substring(i, i+size));
            i += size;           
        }
        return decoded;

    }
}
