class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Stack<Integer> s1 = new Stack<>();
        for(int i =0;i<temperatures.length;i++){
            while(!s1.isEmpty() && temperatures[i]>temperatures[s1.peek()] ){
                int prev = s1.pop();
                arr[prev] = i-prev;

            }
            s1.push(i);
        }
        return arr;
       
        
    }
}
