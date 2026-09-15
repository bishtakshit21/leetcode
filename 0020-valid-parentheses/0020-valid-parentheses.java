class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('||arr[i]=='['||arr[i]=='{'){
                stack.push(arr[i]);
            }else if(stack.isEmpty()){
                return false;
            }
            else{
                char j=stack.peek();
                if(j=='('&&arr[i]==')'){
                    stack.pop();
                } else if(j=='{'&&arr[i]=='}'){
                    stack.pop();
                } else if(j=='['&&arr[i]==']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }}
    }