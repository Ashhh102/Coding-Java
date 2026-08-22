class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j){
            if(arr[i] + arr[j] == target){
                return true;
            }
            else if(arr[i]+ arr[j]< target){
                i++;
            }
            else if(arr[i]+ arr[j]> target){
                j--;
            }
                
            
        }
        
        return false;
        // code here
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna