class Solution {
    public int findLucky(int[] arr) {
       Map<Integer,Integer>count=new HashMap<>();
       for(int num:arr){
        count.put(num,count.getOrDefault(num,0)+1);
       }
       int res=-1;
       for(int num:count.keySet()){
        if(num==count.get(num)){
            res=Math.max(res,num);
        }
       }
       return res;
    }
}
       