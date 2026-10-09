class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hs=new HashSet<>();

       for(int num:nums){
        hs.add(num);
       }
      // System.out.println(hs);
       int longest=0;
       for(int num:hs){
        if(!hs.contains(num-1)){
            int current=num;
            int count=1;
            while(hs.contains(current+1)){
                current++;
                count++;
            }
            System.out.println(longest);
            longest=Math.max(longest,count);
        }
       }
       return longest;
    }
}
