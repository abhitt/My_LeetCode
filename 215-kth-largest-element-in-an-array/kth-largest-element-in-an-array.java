class Solution {
    public int findKthLargest(int[] a, int k) {
    //    PriorityQueue<Integer> pq = new PriorityQueue<>(); 
    //    for(int i=0; i<k ; i++){
    //        pq.add(a[i]);
    //    }
    //    for(int i=k; i<a.length; i++){
    //        if(pq.peek()< a[i]){
    //            pq.poll();
    //            pq.add(a[i]);
    //        }
    //    }
    //    return pq.peek();
    // }
    Arrays.sort(a);
    int n = a.length;
    return a[n-k];
    }
}