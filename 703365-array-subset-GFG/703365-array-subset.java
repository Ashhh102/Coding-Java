
class Solution {
    public boolean isSubset(int a[], int b[]) {
        if(b.length>a.length){
            return false;
            }
            
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0; 
        int j = 0;
        int len = b.length;
        while(len>0 && j<a.length){
            if(b[i]== a[j] ){
                i++;
                len--;
                j++;
            }
            else{
                j++;
            }
            
            
            
        }
            
        if(i == b.length){
            return true;
        }
        else{
            return false;
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna