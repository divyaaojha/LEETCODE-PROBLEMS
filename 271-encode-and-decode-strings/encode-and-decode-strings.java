public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        // 1. Initialize the StringBuilder
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<strs.size(); i++){
            int length = strs.get(i).length();
            sb.append(length);
            sb.append('#');
            sb.append(strs.get(i));
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int n = s.length();
        List<String> ans = new ArrayList<>();
        int i =0;
        while(i<n){
            int j =i;

            while(s.charAt(j) != '#'){
                j++;
            }
            int num = Integer.parseInt(s.substring(i, j));

            String temp = s.substring(j+1, j+1+num); //as excluding the last index, so we make i start from this last index only in next iteration
            ans.add(temp);
            i = j+1+num;
        }

        return ans;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));