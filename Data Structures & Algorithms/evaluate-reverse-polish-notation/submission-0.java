class Solution {
    public int evalRPN(String[] tokens) {
        int []stack = new int[tokens.length];
        int top = -1;

        int op1, op2, res = 0;
        for(String ch : tokens){
            try{
                int num = Integer.parseInt(ch);
                stack[++top] = num;
            }catch(NumberFormatException e){
                op2 = stack[top--];
                op1 = stack[top--];

                switch(ch){
                    case "+":
                        res = op1 + op2;
                        break;

                    case "-":
                        res = op1 - op2;
                        break;

                    case "*":
                        res = op1 * op2;
                        break;

                    case "/":
                        res = op1 / op2;
                        break;
                }

                stack[++top] = res;
            }
        }

        return stack[top];
    }
}
