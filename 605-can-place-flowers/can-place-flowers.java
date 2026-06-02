class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
    
        for(int i =0; i<flowerbed.length; i++){
            boolean leftEmpty =
            (i==0 || flowerbed[i-1]==0);

            boolean rightEmpty =
            (i==len-1 || flowerbed[i+1]==0);

            
                 if(leftEmpty && rightEmpty && flowerbed[i]==0){
                    n--;
                    flowerbed[i]=1;
                
            }
             
        }
        if(n <=0)return true;
        return false;
    }
}

