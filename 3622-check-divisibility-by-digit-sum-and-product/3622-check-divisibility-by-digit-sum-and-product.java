class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int c= n;

        while (n > 0){
           int i = n % 10;
            sum += i;
            prod = prod * i;
            n = n / 10;

        

        }



        if (c % (sum + prod) == 0){
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