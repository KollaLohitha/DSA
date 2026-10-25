class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int revX = 0;
        while(x!=0){
            int lastdigit = x % 10;
            x = x / 10;
            revX = (revX * 10) + lastdigit;
        }
        return temp==revX;
    }
}