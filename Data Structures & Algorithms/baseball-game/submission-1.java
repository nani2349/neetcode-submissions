class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("+")){
                int last=stack.pop();
                int secondLast=stack.peek();
                int sum = last+secondLast;
                stack.push(last);
                stack.push(sum);
            }
            else if(op.equals("D")){
                int prev=stack.peek();
                int doub=prev*2;
                stack.push(doub);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
            
        }
        int total = 0;
        while(!stack.isEmpty()){
            total+=stack.pop();
        }
        return total;
        
    }
}