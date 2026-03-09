class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//the m+n solution with constant space - 3 POINTERS

int i = m-1;
int j = n-1;
int k = m+n -1;

while(i>=0 && j >= 0){
    if(nums1[i] >= nums2[j]){
        nums1[k--]= nums1[i--];
    }
    else{
        nums1[k--]=nums2[j--];
    }
}

while(i>=0){
 nums1[k--]= nums1[i--];
}
while( j >= 0){
nums1[k--]=nums2[j--];
}

//*************************************************************************************************** */
// // // O((m+n)log(m+n)) solution - we want next o(m+n) solution
// //  int k =0;                              
// // for(int i =m; i<m+n; i++ ){
// // nums1[i]=nums2[k++];
// // }
// // Arrays.sort(nums1);

// //******************************************************************************************************** */
// //o(m+n) solution, but taken extra space*************

// int[] num =new int[m+n];
// int index =0;
//  int i =0; int j =0;
// while(i<m && j<n ){
   
    
//     if(nums2[j] <= nums1[i]){
//         num[index]=nums2[j];
//          j++;
//     }
//     else{
//         num[index]=nums1[i];
//          i++;
//     }
//     index++;
    
// }

// while(i<m){
//     num[index++]= nums1[i++];
// }
// while(j<n){
//     num[index++]= nums2[j++];
// }

// for(int k =0; k< num.length ; k++){
//     nums1[k]= num[k];
// }  

    }
}