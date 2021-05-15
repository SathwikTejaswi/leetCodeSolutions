/** 
Runtime: 2 ms, faster than 97.65% of Java online submissions for Container With Most Water.
Memory Usage: 52.8 MB, less than 28.29% of Java online submissions for Container With Most Water.
*/

class ContainerWithMostWaterFaster {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = -1;
        int currentArea = -1;
        
        while (left < right) {
            
            if (height[left] < height[right]) {
                currentArea = (right - left) * height[left];
                left += 1;
            }
            else {
                currentArea = (right - left) * height[right];
                right -= 1;
            }
            
            if (currentArea > maxArea)
                maxArea=currentArea;
        }
        
        return maxArea; 
        
    }
}

  
