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




    //     if(strs.length==0 || strs == null){
    //         return "";
    //     }
    //     String prefix = strs[0];
    //     for(int i =0; i<strs.length; i++){
    //         while(strs[i].indexOf(prefix) != 0){
    //             prefix = prefix.substring(0, prefix.length() -1);
    //             if(prefix.isEmpty()){
    //                 return "";
    //             }
    //         }
    //     }
    // return prefix;
        
    }
}