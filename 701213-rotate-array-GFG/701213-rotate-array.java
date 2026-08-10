class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        rotate(arr, 0, n-1);
        rotate(arr, 0,n-d-1 );
        rotate(arr, n-d, n-1);
        
    }
    public static void rotate(int []arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
            
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna