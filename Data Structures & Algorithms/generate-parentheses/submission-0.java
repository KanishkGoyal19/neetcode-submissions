class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        recursiveSol(0,0,n,ans,stack);
        return ans;        
    }
    public void recursiveSol(int open, int close,int n, List<String>ans, StringBuilder stack){
        if(open == close && open == n){
            ans.add(stack.toString());
            return;
        }
        if(open < n){
            stack.append('(');
            recursiveSol(open+1, close,n, ans, stack);
            stack.deleteCharAt(stack.length()-1);
        }    
        if(open > close){
            stack.append(')');
            recursiveSol(open, close+1,n, ans, stack);
            stack.deleteCharAt(stack.length()-1);
        }    
        }
}

//base case for recursive, open=closed=n
//can only add a parenthesis is close<open




                                                              