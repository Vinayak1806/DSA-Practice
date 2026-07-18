class Solution {
    public boolean checkString(String s) {
        int count=0;
        for (int i=1;i<s.length();i++){
            char ch = s.charAt(i);
                          
            if(s.charAt(i-1)=='b' && ch=='a'){
                count++;
            }
            
        }
        return count<1;
    }
}