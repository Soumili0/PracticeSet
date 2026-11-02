class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right =0;
        for(int i=0;i<piles.length;i++){
            right = Math.max(right,piles[i]);
        }

        while(left < right){
            int mid = left +(right-left)/2;

            if(canEatAll(piles,h,mid)){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return left;
        
    }

    private boolean canEatAll(int [] piles, int h, int k){
        long hours =0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i] +k-1)/k;
        }
        return hours <=h;
    }

}