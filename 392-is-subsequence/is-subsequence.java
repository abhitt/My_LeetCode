class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n>m){
            return false;
        }

        int i=0;
        int j=0;
        int total =0;

        while (i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                total++;
                i++;
                j++;
            }
            else{
                j++;
            }

        
        }
        return total == n;

    }
}