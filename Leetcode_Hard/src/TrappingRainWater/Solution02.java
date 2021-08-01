package TrappingRainWater;

public class Solution02 {

	public int trap(int[] height) {
        if(height.length==0)
            return 0;
        int trap=0;
        int top=height[0], index=0;
        for(int i=0;i<height.length;i++){
            if(top<=height[i]){
                index=i;
                top=height[i];
            }
        }
        int left = height[0];
        for(int i=0; i<index; i++) {
            if(height[i] > left) left = height[i];
            else if(height[i] < left) trap += (left - height[i]);
        }
        int right = height[height.length - 1];
        for(int i=height.length-1; i>index; i--) {
            if(height[i] > right) right = height[i];
            else if(height[i] < right) trap += (right - height[i]);
        }
        return trap;
    }
	
}
