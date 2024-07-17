class CustomStack {
        int []arr = null;
        int currSize = 0;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];

    }
    
    public void push(int x) {
        if (currSize == arr.length){
            return;
        }
        arr[currSize]=x;
        currSize++;
    
    }
    
    public int pop() {
        if(currSize == 0){
            return -1;
        }

        int ans = arr[currSize-1];
        arr[currSize-1]=0;
        currSize--;
        return ans;
    }
    
    public void increment(int k, int val) {
        if(val==0 || currSize== 0){
            return;
        }

        if(k>arr.length){
            k = arr.length;
        }
        for(int i=0;i<k;i++){
            arr[i] = arr[i] + val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */