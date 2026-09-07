class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s1 = new Stack<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            while(!s1.isEmpty() && heights[i]<heights[s1.peek()]){
                int height=heights[s1.pop()];
                int width;
                if(s1.isEmpty()){
                    width=i;
                }
                else{
                    width=i-s1.peek()-1;
                }
                int area = height*width;
                 maxArea=Math.max(area,maxArea);


            }
             s1.push(i);


        }
        while(!s1.isEmpty()){
            int height=heights[s1.pop()];
            int width;
            if(s1.isEmpty()){
                width=heights.length;
            }
            else{
                width=heights.length-s1.peek()-1;
            }
            int area=height*width;
             maxArea=Math.max(area,maxArea);

        }
       return maxArea;
        
    }
}
