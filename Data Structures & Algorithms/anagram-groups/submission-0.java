class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hm=new HashMap<>();
        for(String st:strs){
            char [] cha=st.toCharArray();
            Arrays.sort(cha);
            String key = new String(cha);
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(st);
        }
        return new ArrayList<>(hm.values());
    }
}
