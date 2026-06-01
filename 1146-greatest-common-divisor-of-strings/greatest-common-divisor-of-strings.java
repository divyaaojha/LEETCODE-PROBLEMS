class Solution {
    public boolean helper(String str, String pattern ){
        //helper function to divide and pattern building
        int n = str.length();
        int m = pattern.length();//pattern must b smaller in length than str we are matching it with

        if(n%m !=0) return false;
        
        int times = n/m;
        StringBuilder sb = new StringBuilder();
        while(times >0){
            sb.append(pattern);
            times--;
        }
        return sb.toString().equals(str);

    }
    public String gcdOfStrings(String str1, String str2) {
        int minlen = Math.min(str1.length(), str2.length());


        //starting division /finding from larger strings at the end, so that when match happens , we return and its largest match we returned
        for(int i =minlen; i>=1; i--){
            String candidate = str1.substring(0,i);
            if( helper(str1, candidate) && helper(str2, candidate) ){
                return candidate;
            }
        }
        return "";
    }
}