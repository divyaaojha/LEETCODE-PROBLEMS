class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> triangle = new ArrayList<>();
       for(int i=0; i<numRows; i++){
        //each row made of size i+1, and initialised with 1
        List<Integer> row= new ArrayList<>(Collections.nCopies(i+1, 1));

        //editing middle values i.e from index 1 , to i-1, 0 based indexing
        for(int j =1; j<i; j++){
            //added above 2 elements and stored in row
            row.set(j, triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
        }
        triangle.add(row);


       } 
       return triangle;
    }
}