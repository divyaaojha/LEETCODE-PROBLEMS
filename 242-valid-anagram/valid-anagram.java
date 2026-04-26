class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }

        int[]freq =  new int[26]; 
        // for(int i =0; i<s.length(); i++){
        //     freq[s.charAt(i) -'a']++;
        //     freq[t.charAt(i) -'a']--;
        // }
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c: t.toCharArray()){
            freq[c-'a']--;
        }
        for(int f: freq){
            if(f!=0)return false;
        }
        return true;


 //************************************************************************************************************ */       
        //works 
        // char[]cs = s.toCharArray();
        // char[] ct = t.toCharArray();
        // Arrays.sort(cs);
        // Arrays.sort(ct);
        // if(Arrays.equals(cs,ct))return true;
        // return false;
//**************************************************************************************************** */
// freq[s.charAt(i) - 'a']++;

// This converts a character into an index:

// 'a' - 'a' = 0  
// 'b' - 'a' = 1  
// 'c' - 'a' = 2  
// ...
// 'z' - 'a' = 25

// So it maps 'a' → 0, 'b' → 1, ..., 'z' → 25 ✔️

// 🔴 What about char - 0 ?
// s.charAt(i) - 0

// This gives you the ASCII / Unicode value:

// 'a' → 97  
// 'b' → 98  
// 'z' → 122
// 🧠 Key pattern
// Expression	Meaning	Use case
// c - 'a'	Normalize to 0–25	lowercase letters
// c - 'A'	Normalize to 0–25	uppercase letters
// c - '0'	Convert char digit → int	'5' → 5
// c - 0	ASCII value	rarely useful

// ✅ Better mental framework
// Case 1: Only lowercase
// int[] freq = new int[26];
// freq[c - 'a']++;
// Case 2: Upper + lower + digits (ASCII)
// int[] freq = new int[128]; // enough
// freq[c]++;
// Case 3: Anything (Unicode-safe)
// HashMap<Character, Integer> map = new HashMap<>();
// map.put(c, map.getOrDefault(c, 0) + 1);

/****************************************************************************************** */
        

    }
}