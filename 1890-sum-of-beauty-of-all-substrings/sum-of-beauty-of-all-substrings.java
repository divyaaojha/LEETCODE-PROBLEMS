class Solution {
    public int beautySum(String s) {
        
        int n = s.length();
        int sum=0;
       for(int i = 0; i < n; i++){
    int[] freq = new int[26];

    for(int j = i; j < n; j++){
        //since we have to do it for every single string, thats why min max calculation inside thsi for loop, for every i to j th length substring, w eare calculating beauty
        freq[s.charAt(j) - 'a']++;

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int f : freq){
            if(f > 0){
                min = Math.min(min, f);
                max = Math.max(max, f);
            }
        }

        sum += (max - min);
    }
}
        return sum;

        /* 42/52 TLE
            int minmaxfreq(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int min= Integer.MAX_VALUE;;
        int max =0;
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
            int k =map.get(c);
           
        }

        //calculate min max after map is formed
        for(int val : map.values()){
        max = Math.max(max, val);
        min = Math.min(min, val);
        }
        
         return max-min;
    }
    public int beautySum(String s) {
        int n = s.length();
        int sum=0;
        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                int freq =minmaxfreq(s.substring(i, j+1));
                if(sum +freq >= Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                sum +=freq;
            }
        }
        return sum;
        */
    }
}