class Solution {
    public int largestInteger(int num) {
        
 List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        char[] digits = String.valueOf(num).toCharArray();
        
        // Separate digits
        for(char c : digits){
            int d = c - '0';
            if(d % 2 == 0) even.add(d);
            else odd.add(d);
        }
        
        // Sort descending
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());
        
        int e = 0, o = 0;
        int result = 0;
        
        // Rebuild number
        for(char c : digits){
            result *= 10;
            int d = c - '0';
            
            if(d % 2 == 0){
                result += even.get(e++);
            } else {
                result += odd.get(o++);
            }
        }
        
        return result;
   
    }
}