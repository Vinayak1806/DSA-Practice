class Solution {
public long nana(int[]arr,int speed)
    {
        long hours=0;
        for(int i=0;i<arr.length;i++)
        {
            hours += arr[i] / speed;
            if(arr[i] % speed != 0)
            {
                hours++;
            }
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high= 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int res = high;

        while(low<=high)
        {
            int guess =(low+high)/2;
            long hr= nana(piles, guess);

            if(hr>h)
            {
                low=guess+1;
            }
            else
            {
                res=guess;
                high=guess-1;
            }            
        }
        return res;
    }
}