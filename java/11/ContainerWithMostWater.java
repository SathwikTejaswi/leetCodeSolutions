class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int samples = height.length;
        int area = -1;
        
        for (int i=0; i<samples; i++){
            int hLeft = height[left];
            int hRight = height[right];
            int hTemp = Math.min(hLeft, hRight);
            area = Math.max(area, (right-left)*hTemp);
            
            if (hLeft<hRight)
                left+=1;
            else
                right-=1;
        }
        
        return area;
    }
}