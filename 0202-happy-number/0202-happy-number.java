class Solution {
      int check(int n)
     {
        int sum=0;
        while(n!=0)
        {
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;            
        }
        return sum;
     }
    public boolean isHappy(int n) {
     int slow =n;
     int fast = n;

     while(fast!=1)
     {
        slow=check(slow);
        fast=check(check(fast));

        if(slow==fast && fast!=1)
        {
            return false;
        }
     }
     return true;

    }
}