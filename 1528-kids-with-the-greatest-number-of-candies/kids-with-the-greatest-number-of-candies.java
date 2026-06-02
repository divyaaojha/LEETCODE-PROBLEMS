class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int maxcandie =0;
       for(int i =0; i< candies.length; i++){
        maxcandie= Math.max(maxcandie, candies[i]);
       } 

        List<Boolean>ansarr= new ArrayList<>();

       for(int i =0; i<candies.length; i++){
        int currcandi =candies[i] + extraCandies;
        if(currcandi >= maxcandie){
            ansarr.add(true);
        }
        else{
            ansarr.add(false);
        }
       }
       return ansarr;
    }
}