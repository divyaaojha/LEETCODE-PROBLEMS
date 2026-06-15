class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n: nums1){
            set1.add(n);
        }
        for (int n : nums2){
            set2.add(n);
        }
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        Iterator<Integer> itr1= set1.iterator();
        Iterator<Integer> itr2= set2.iterator();
        while(itr1.hasNext()){
            int ele = itr1.next();
            if(!set2.contains(ele)){
                ans.get(0).add(ele);
            }
        }
        while(itr2.hasNext()){
            int ele = itr2.next();
            if(!set1.contains(ele)){
                ans.get(1).add(ele);
            }
        }
        return ans;

        }




    
    }
