class Solution {
    public int countCommas(int n) {
        int count=0;
            for(int i =1000;i<=n;i++){
                if(i<1000000){
                    count++;
                }
                else if(i<1000000000){
                    count=count+2;
                }
                else {
                    count=count+3;
                }
            }    
                return count;
            
    }
}