class Solution {
    public int maxProduct(int[] nums) {
    //    int maxProduct=nums[0];
    //    for(int i =0; i<nums.length; i++){
    //     int currprod= 1;
    //     for(int j =i; j<nums.length; j++){
    //         currprod *= nums[j];
    //         maxProduct =Math.max(maxProduct, currprod);
    //     }
    //    } 
    //    return maxProduct;

   
//we maintain a currpro,in which we multiply all elements, and we aso keep a track of 
//minproduct, - 
int maxend = nums[0];
int minend= nums[0];
int maxProduct= nums[0];

for(int i =1; i<nums.length; i++){
    int num = nums[i];

   if(num < 0){
    //swap minend prod and maxend prod
    int temp = maxend;
    maxend = minend;
    minend = temp;
   }

    maxend = Math.max(num, maxend * num);
    minend = Math.min(num, minend * num);

    maxProduct = Math.max(maxend, maxProduct);  

}
return maxProduct;
    }
}