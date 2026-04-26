class Solution {
    public boolean isIsomorphic(String s, String t) {
    
       int ssize = s.length();
       int tsize = t.length();
       if(tsize != ssize){
        return false;
       } 

        
        // //lets use freq array
        // int[]freqs= new int[200];
        // int[] freqt = new int[200];
        
        // for(int i =0; i< ssize; i++){
        //     char ss = s.charAt(i);
        //     char tt = t.charAt(i);
        //     //comparing before putting value- so prev operations get checked
        //     if(freqs[ss]!= freqt[tt]){
        //         return false;
        //     }
        //     freqs[ss]=i+1;
        //     freqt[tt]=i+1;
        // }
        // return true;

//sol 2
 //try using hashmap- to map
 //right now my loop isnt detecting, if all elemenst of s are different, then it isnt able to work as expected, lest see how we can fix this.
//let me add a check to count if count of different element , return false

HashMap<Character, Character> map1 = new HashMap<>();
Set<Character> sset= new HashSet<>();
Set<Character> tset= new HashSet<>();


       for(int i = 0; i<ssize; i++){
        sset.add(s.charAt(i));
        tset.add(t.charAt(i));
        if(map1.containsKey(s.charAt(i)) ){
            if(map1.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
         else {
            map1.put(s.charAt(i), t.charAt(i));
        }
       
       }
       if(sset.size() != tset.size())return false;
    
       return true;
    }
}