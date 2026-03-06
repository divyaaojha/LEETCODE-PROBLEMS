class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

    // standard approach for 2 sum is --- SORTING + 2 POINTER ---
    //3 sum- has to be reduced to 2 sum, by fixing the one element,
    // and then for the remaning 2 element loops from i=0; to i<n-2
    //if 3 ele only, n-3 th is we fixed, n-2 th and n-1 th we are finding, thats why i< n-2, maximum
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();
    
    //SORTING *******************
    Arrays.sort(nums);


    // 2 POINTEWR inside for loop ***************
    for(int i =0; i<n-2; i++){

        //if current element same as prev, it will give duplicate answer only, so better skip it
        //when i more than 0, other wise out of bound error
        if(i>0 && nums[i-1]==nums[i]){
            continue;
            //successfully skipped , this as this may have caused duplicates in ans
        }
        //left pointer will obvio start from, next ele, i.e i+1
        int left = i+1;
        int right = n-1;
        while(left<right){
            // check if the 
            // 1. sum ==0
            // 2. sum < 0
            // 3. sum > 0

            int sum = nums[i] + nums[left] + nums[right];

            // 1.
            if(sum ==0){
                ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                //move pointers, as we have to check more such triplets if any***
                left++;
                right--;

                //the same way as we stopped nums[i] duplicates, we will skip nums[left] and nums[right] duplicates as well
                while(left<right && nums[left] == nums[left-1]) left++;
                while(left<right && nums[right]== nums[right+1]) right--;
            }

            // 2.
            else if(sum < 0){
                // sum is smaller so move left to higher value i.e ahead , as we sorted the array
                left++;
            }

            // 3.
            else{
                right--;
            }
        }

    }
    return ans;
    
    }
}