/*
    APPROACH - Sliding Window Using HashMap
    TIME COMPLEXITY = O(N)
    SPACE COMPLEXITY = O(N)
 */

 /* NOTE :- map.remove(fruits[left]) will remove entire fruit instead of its frequency */

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0; 
        int count = 0;
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size() > 2){
                int excess = fruits[left];
                map.put(excess,map.get(excess)-1);
                if(map.get(excess)==0){
                    map.remove(excess);
                }
                left++;
            }
            count = Math.max(count,right-left+1);
        }
        return count;
    }
}