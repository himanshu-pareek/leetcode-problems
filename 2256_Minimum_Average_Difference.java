class Solution {
    private int average (long sumOfElements, int numberOfElements) {
        if (numberOfElements == 0) {
            return 0;
        }
        return (int)(sumOfElements / numberOfElements);
    }
    public int minimumAverageDifference(int[] nums) {
        final int n = nums.length;
        
        int minAvgDiff = Integer.MAX_VALUE;
        int index = -1;
        
        long rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }
        long leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            leftSum = leftSum + nums[i];
            rightSum = rightSum - nums[i];
            
            int averageLeft = average (leftSum, i + 1);
            int averageRight = average (rightSum, n - i - 1);
            
            int averageDiff = Math.abs (averageLeft - averageRight);
            
            if (averageDiff < minAvgDiff) {
                minAvgDiff = averageDiff;
                index = i;
            }
        }
        
        return index;
    }
}
