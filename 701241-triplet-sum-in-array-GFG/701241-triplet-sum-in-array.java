class Solution {
    public boolean hasTripletSum(int a[], int target) {
        // code Here
        Arrays.sort(a);
        int i = 0;
        
        int k = i + 1;
        
        while(i<k && k<a.length){
            int j = a.length-1;
            
            while(k<j && j<a.length){
                if(a[i]+a[k]+a[j]== target){
                    return true;
                }
                else if(a[i]+ a[k]+ a[j] < target){
                    k++;
                }
                else{
                    j--;
                }
            }
            
            i++;
            k=i+1;
            
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna