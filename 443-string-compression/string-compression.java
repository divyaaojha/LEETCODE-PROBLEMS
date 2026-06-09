class Solution {
    public int compress(char[] chars) {
        int start=0;
        int end =0;
        int write =0;
        int count =0;
        while( end < chars.length){

            if(chars[start] == chars[end]){
                end++;
            }
            else{
                count = end-start;
                chars[write++]=chars[start];
                if(count >1){
                    char[]arr = String.valueOf(count).toCharArray();
                    int sizearr = arr.length;
                    int k =0;
                    
                    while(k<sizearr){
                        chars[write++]=arr[k++];
                    }
                }
               

                start= end;
            }
        }

            count = end - start;
            chars[write++] = chars[start];

            if (count > 1) {
            char[] arr = String.valueOf(count).toCharArray();

            for (char c : arr) {
            chars[write++] = c;
            }
            }
        return write;
    }
}