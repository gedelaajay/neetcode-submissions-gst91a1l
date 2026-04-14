class Solution {
    public int findLucky(int[] arr) {
        int res=-1;
        for(int i:arr){
            int count=0;
            for(int j:arr){
                if(i==j){
                    count++;
                }
            }
            if(count==i){
            res=Math.max(res,i);
        }
    }
    return res;
    }
}



               