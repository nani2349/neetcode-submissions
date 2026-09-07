class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1 = new Stack<>();
      for(int a:asteroids){
        boolean alive=true;
        while(!s1.isEmpty() && s1.peek()>0 && a<0){
            int top = s1.peek();
            if(top<Math.abs(a)){
                s1.pop();
                continue;
            }
            else if(top == Math.abs(a)){
                s1.pop();
                alive = false;
                break;
            }
            else{
                alive = false;
                break;
            }
        
        }
        if(alive){
            s1.push(a);
        }

      }
      int[] res = new int[s1.size()];
      for(int i=res.length-1;i>=0;i--){
        res[i]=s1.pop();
      }
      return res;

     
        
    }
}