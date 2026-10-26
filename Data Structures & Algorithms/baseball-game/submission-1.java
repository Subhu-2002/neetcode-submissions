class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        int top = -1;
        int []stack = new int[operations.length];

        for(int i = 0; i < operations.length; i++){
            switch(operations[i]){
                case "+":
                    top++;
                    stack[top] = (stack[top - 1]) + (stack[top - 2]);
                    break;

                case "D":
                    top++;
                    stack[top] = (stack[top - 1]) * 2;
                    break;

                case "C":
                    top--;
                    break;

                default:
                    top++;
                    stack[top] = Integer.valueOf(operations[i]);

            }
        }

        for(int i=0; i<=top; i++){
            sum += stack[i];
        }

        return sum;
    }
}