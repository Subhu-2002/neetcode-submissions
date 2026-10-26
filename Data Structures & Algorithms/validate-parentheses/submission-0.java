class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char brc : s.toCharArray()){
            if(brc == '[' || brc == '(' || brc == '{'){
                stack.push(brc);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }

                char sym = stack.pop();
                if((brc == ')' && sym != '(') || (brc == ']' && sym != '[') || (brc == '}' && sym != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
