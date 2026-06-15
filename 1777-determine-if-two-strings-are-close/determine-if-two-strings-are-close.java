class Solution {
    boolean check1(String s1, String s2){
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();
        

        for(char c: s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        
        }
        for(char c: s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        
        }

        //   for(char c: map1.keySet()){
          
        //     if(!map1.containsKey(c) ){
        //             return false;
        //     }
            
        // }

        return map1.keySet().equals(map2.keySet());
     

    }
    boolean check2( String s1, String s2){
        // //calculate no of unique characters- use set
        // Set<Character>set1 = new HashSet<>();
        // Set<Character>set2 = new HashSet<>();
        // for(char c: s1.toCharArray()){
        //     set1.add(c);
        // }
        // for(char c: s2.toCharArray()){
        //     set2.add(c);
        // }
        // return set1.size()==set2.size();

        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2= new HashMap<>();

        for(char c: s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c: s2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        List<Integer> l1= new ArrayList<>();
        for(Map.Entry <Character, Integer> e: map1.entrySet()){
            l1.add(e.getValue());
        }
        List<Integer> l2= new ArrayList<>();
        for(Map.Entry <Character, Integer> e: map2.entrySet()){
            int val = e.getValue();
            l2.add(val);
            
        }

        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);


       

    }
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        // first check- if all characters are 
        boolean ans1= check1(word1, word2);
     

          boolean ans2= check2(word1, word2);
          return (ans1 && ans2);
    


    }
}