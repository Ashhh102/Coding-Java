class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int x = a.length + b.length;
        int [] combined = new int[x];
        for(int i= 0; i<a.length; i++){
            combined[i] = a[i];
        }
        
        for(int i =0; i< b.length; i++ ){
            combined[a.length+i]= b[i];
        }
        
        Arrays.sort(combined);
        int y = combined[k-1];
        return y;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna