package Arrays;

public class TrappingRainwater {
    public static int trappedRainWater(int heights[]){
        int n = heights.length; // baar baar na likhna pare uske liye :)

        // calculate left max boundary  -array
        int leftMax[] = new int[n];
        leftMax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(heights[i],leftMax[i-1]);
        }
        // calculate right max boundary  -- array
        int rightMax[]= new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2;i<=0;i--){// bcz n-1 ke liye calculate ho chuka hai
            rightMax[i]=Math.max(heights[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i=0;i<n;i++){
            // waterlevel = min(leftMax bound, rightMax boundaary)
              int waterLevel = Math.min(leftMax[i], rightMax[i]);

              // trapped water = (waterLeverl-height[i])*widhth  but here width=1
             trappedWater += waterLevel - heights[i];
        }
        return trappedWater;
        
         
    }
    public static void main(String[] args) {
        int heights[]={4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainWater(heights));
    }
}
