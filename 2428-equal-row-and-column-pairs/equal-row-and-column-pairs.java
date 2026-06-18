class Solution {
    public int equalPairs(int[][] grid) {
    HashMap<List<Integer> , Integer> rowcount = new HashMap<>();
    HashMap<List<Integer> , Integer> colcount = new HashMap<>();

    for (int row = 0; row < grid.length; row++) {

    List<Integer> currentRow = new ArrayList<>();

    for (int col = 0; col < grid[0].length; col++) {
        currentRow.add(grid[row][col]);
    }

    rowcount.put(
        currentRow,
        rowcount.getOrDefault(currentRow, 0) + 1
    );
}

  for (int col = 0; col < grid[0].length; col++) {

    List<Integer> currentRow = new ArrayList<>();

    for (int row = 0; row< grid.length; row++) {
        currentRow.add(grid[row][col]);
    }

    colcount.put(
        currentRow,
        colcount.getOrDefault(currentRow, 0) + 1
    );
}
    int count =0;
    for(Map.Entry<List<Integer> , Integer> e: rowcount.entrySet()){

    if( colcount.containsKey( e.getKey() ) ){
        count += e.getValue() * colcount.get(e.getKey());
    }
}

return count;


    }
}