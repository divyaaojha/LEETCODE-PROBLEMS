class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Boyer Moore algorithm- to find majority candidate - a greedy cancellation algorithm.
        //linear time, constant space

       //since majority means  > n/3, so only 2 or less candidates can be there.
       int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int c1=0; // count of candidate 1
        int c2=0; // count of candidate 2
        int candi1=0;
        int candi2=0;

        //voting phase
        for(int i =0; i<n ; i++ ){
            if(nums[i]== candi1){
                c1++;
            }
            else if(nums[i]== candi2){
                c2++;
            }
            else if(c1==0){
                candi1= nums[i];
                c1++;
            }
            else if(c2==0){
                candi2= nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;

        //verification phase
        for(int num: nums){
            if(candi1 == num){
                c1++;
            }
            else if(candi2 == num){
                c2++;
            }
            
        }
       
         if(c1 > (n/3)){
            ans.add(candi1);
         }

         if(c2 > (n/3)){
            ans.add(candi2);
         }

         return ans;
    //********************************************************************************************************** */
    // nlogn solution, constant space
    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     List<Integer> ans = new ArrayList<>();
    //     int count=0;
    //    int i =0; int j =0;
    //    while(j<n){
    //     if(nums[i]==nums[j]){
    //         j++;
    //         count++;
    //         if(count> (n/3) && !ans.contains(nums[i]) ){
    //                 ans.add(nums[i]);
    //             }
    //     }
    //     if( j <n && nums[i] != nums[j]){
    //         i =j;
    //         count=0;
    //     }
    //    }

    //     return ans;

        /************************************************************************************************************** */
        // int n = nums.length;
        // HashMap<Integer, Integer> freqmap = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();

        // for(int i =0; i<n; i++){
        //     freqmap.put(nums[i], freqmap.getOrDefault(nums[i], 0)+1);
        //     if(freqmap.get(nums[i]) > (n/3) && !ans.contains(nums[i])){
        //         ans.add(nums[i]);
        //     }
        // }
        // return ans;
        //**************************************************************************************** */
        // //brute force, tc= n^2, sc = 0(1)
        // int n = nums.length;
        // int count=0;
        // List<Integer> ans = new ArrayList<>();
        // for(int i =0; i<n; i++){
        //     for(int j =i; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             count++;    
        //          }
        //         }

        //         if(count> (n/3) && !ans.contains(nums[i]) ){
        //             ans.add(nums[i]);
        //         }
        //         count=0;
        //     }
        // return ans;
    }
}