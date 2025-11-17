class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

int[] num =new int[m+n];
int index =0;
 int i =0; int j =0;
while(i<m && j<n ){
   
    
    if(nums2[j] <= nums1[i]){
        num[index]=nums2[j];
         j++;
    }
    else{
        num[index]=nums1[i];
         i++;
    }
    index++;
    
}

while(i<m){
    num[index++]= nums1[i++];
}
while(j<n){
    num[index++]= nums2[j++];
}

for(int k =0; k< num.length ; k++){
    nums1[k]= num[k];
}


    }
}