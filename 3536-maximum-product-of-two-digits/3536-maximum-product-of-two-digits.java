class Solution {
    public int maxProduct(int n) {
        
        int fmax=0,smax=0;
        while(n!=0)
        {
           int rem = n%10;

           if(rem>fmax){
            smax=fmax;
            fmax=rem;
           }else if(rem > smax){

                    smax=rem;
           }

           n/=10;
        }


        return fmax*smax;

       

    }
}