class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
      int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int max =0;
      for(int i=0; i<n;i++){
        if(max<candies[i]){
            max=candies[i];
        }
      }

      for(int i=0; i<n;i++){
        int sum=candies[i]+extra;
        if(sum>=max){
            result.add(true);
        }else{
            result.add(false);
        }
      }
      return result;  
    }
}