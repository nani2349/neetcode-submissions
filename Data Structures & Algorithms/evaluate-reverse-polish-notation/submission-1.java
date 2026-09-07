class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();
        for(String t:tokens){
          
          if(t.equals("+")){
            int last = s1.pop();
            int secondLast = s1.pop();
            int sum = secondLast+last;
            s1.push(sum);
          }
          else if(t.equals("*")){
             int last = s1.pop();
              int secondLast = s1.pop();
              int mul = secondLast*last;
              s1.push(mul);

          }
          else if(t.equals("-")){
            int last = s1.pop();
            int secondLast = s1.pop();
            int min = secondLast - last;
            s1.push(min);

          }
          else if(t.equals("/")){
            int last = s1.pop();
            int secondLast = s1.pop();
            int div = secondLast/last;
            s1.push(div);
            
          }
          else{
            s1.push(Integer.parseInt(t));
          }
          

        }
        return s1.peek();
        
    }
}
