class Solution {
    public boolean checkGoodInteger(int n) {
        int square=0;
        int sum= 0;
        while(n>0)
        {
            int digit = n%10;
            sum=sum+digit;
            square = square + digit*digit;
            n= n/10;
        }
        return square-sum>=50;        
    }
}