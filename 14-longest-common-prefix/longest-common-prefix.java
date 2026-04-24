class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0 ){
            return "";
        }
        String s = strs[0];
        int index =strs[0].length();
        for(int i =1; i< strs.length ; i++){
           
            String temp = strs[i];
            if(temp=="")return "";  //if(temp.equals(""))
            int k=0;

            while( k < temp.length() && k < s.length() && temp.charAt(k)== s.charAt(k)){
               k++;
            
            }
            
             if(index >k){
                index =k;
            }
             s = s.substring(0,index);
       }

        return s;

    }
}
            // 🔴 4. Redundant + confusing update
                // if(index > k){
                //     index = k;
                // }
                // s = s.substring(0, index);

                // 👉 This works, but:

                // index is unnecessary
                // you're already shrinking s
 