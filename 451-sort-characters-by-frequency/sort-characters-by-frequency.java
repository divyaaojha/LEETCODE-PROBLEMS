class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put( c , map.getOrDefault(c,0)+1 );
        }
        TreeMap<Integer, List<Character>> r = new TreeMap<>(Collections.reverseOrder());
        //all entries added to the tree
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            //if key didnt exist, added key, and an empty list for it
            if(! r.containsKey(entry.getValue())){
                r.put(entry.getValue(),new ArrayList<>() );
            }
            // now the current freq is as a value inside tree, so get it, and add the char to it value
            //r.get(entry.getValue())   => this give an arraylist
            r.get(entry.getValue()).add(entry.getKey());
        }

        //now building the string , we iterate over the treemap
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,List<Character>> entry : r.entrySet()){
            //entry.getKey() is freq- is an integer
            //entry.getValue() is list of character
            for(char c : entry.getValue()){
                for(int i =0; i< entry.getKey() ; i++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();



        // HashMap<Character, Integer> map = new HashMap<>();
        // //1.count freq by map
        // for(char c : s.toCharArray()){
        //     map.put( c , map.getOrDefault(c,0)+1 );
        // }

        // //2.to arrange all characters in descending order, accor to thier freq, i.e value store in map, we make a priority queue, that will keep more freq char in the front
        // //this pq is of type entry of our hashmap type, so that later we can access key, and value of each entry

        // PriorityQueue< Map.Entry<Character, Integer>> pq = new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue());

        // //3.add ele in pq
        // pq.addAll(map.entrySet());

        // //4.now polling elements from pq, and building string into stringbuilder
        // StringBuilder sb = new StringBuilder();
        // while(!pq.isEmpty()){
        // Map.Entry<Character, Integer> entry = pq.poll();
        // sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        // }

        // return sb.toString();
        
    }
}