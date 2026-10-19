class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count=1;
        for(char c : order.toCharArray()){
            map.put(c, count++);
        }


        for(int i =0; i<words.length-1 ; i++){
          String w1 = words[i];
          String w2 = words[i+1];

          int j =0;

          while(j < w1.length() && j <w2.length()){

            char c1 =w1.charAt(j);
            char c2 =w2.charAt(j);

            if(c1 != c2){
                if(map.get(c1) > map.get(c2) ){
                return false;
            }

            break;
            }
            j++;
            

          }
          if(j ==w2.length() && w1.length() > w2.length()){
            return false;
          }
        }
        return true;
    }
}