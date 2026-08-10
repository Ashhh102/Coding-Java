class Solution {
    int missingNum(int arr[]) {
        int n = arr.length+1;
        long sum=0;
        for(int i:arr){
            sum+=i;
        }
        long nn=(long)n*(n+1)/2;
        return (int)(nn-sum);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna