class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int stack[] = new int[n];
        int top = -1;
        int res[] = new int[n];

        for(int i=n-1; i>=0; i--) {
            while(top != -1 && temperatures[stack[top]] <= temperatures[i]){
                top--;
            }

            if(top != -1) 
                res[i] = stack[top] - i;

            stack[++top] = i;
        }

        return res;
    }
}
