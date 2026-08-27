class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int right = stack[top--];
                int left = stack[top--];
                
                int result = 0;
                if (token.equals("+")) result = left + right;
                else if (token.equals("-")) result = left - right;
                else if (token.equals("*")) result = left * right;
                else if (token.equals("/")) result = left / right;
                
                stack[++top] = result;
            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }
        
        return stack[top];
    }
}

