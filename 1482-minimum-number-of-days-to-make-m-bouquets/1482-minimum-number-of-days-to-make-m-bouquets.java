class Solution {
    public boolean valid(int[] bloomDay,int days,int m,int k)
    {
        int flower = 0;
        int bouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                flower++;

                if (flower == k) {
                    bouquets++;
                    flower = 0;
                }
            } else {
                flower = 0;
            }
        }

        return bouquets >= m;       
    }


    public int minDays(int[] bloomDay, int m, int k) {

        int low = 0;
        int high= 0;
        for (int bloom : bloomDay) {
            high = Math.max(high, bloom);
        }
        for (int bloom : bloomDay) {
            low = Math.min(low, bloom);
        }

        int res = -1;

        while(low<=high)
        {
            int guess =(low+high)/2;
            
            if(valid(bloomDay,guess,m,k))
            {
                res=guess;
                high=guess-1;
            }
            else
            {
               low=guess+1;
            }            
        }
        return res;
    }
}