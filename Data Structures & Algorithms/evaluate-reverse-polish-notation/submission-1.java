class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
            if(isNumeric(s)){
                stack.push(s);
            }
            else if(isOperand(s)){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                if(s.equals("+")){
                    int ans = num1+num2;
                    stack.push(String.valueOf(ans));
                }
                if(s.equals("-")){
                    int ans = num2-num1;
                    stack.push(String.valueOf(ans));
                }
                if(s.equals("*")){
                    int ans = num1*num2;
                    stack.push(String.valueOf(ans));
                }
                if(s.equals("/")){
                    int ans = num2/num1;
                    stack.push(String.valueOf(ans));
                }
            }
        }
            return Integer.parseInt(stack.peek());
        
    }
    public boolean isNumeric(String str) { 
        try {  
            Integer.parseInt(str);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }   
    public boolean isOperand(String str){
        if(str.equals("+") || str.equals("*") || str.equals("/") ||str.equals("-") ){
            return true;
        }
        return false;
    }
}
