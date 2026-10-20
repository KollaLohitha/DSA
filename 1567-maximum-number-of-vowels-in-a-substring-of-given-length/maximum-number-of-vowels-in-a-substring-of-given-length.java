class Solution {
    public int maxVowels(String s, int k) {
        int vcnt = 0, mvcnt = 0;
        for(int i = 0; i < k; i++){
            if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vcnt++;
            }
        }
        mvcnt = vcnt;
        for(int i = k; i < s.length(); i++){
            if(s.charAt(i-k)=='a' || s.charAt(i-k) =='e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u'){
                vcnt--;
            }
            if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vcnt++;
            }
            mvcnt = Math.max(vcnt,mvcnt);
        }
        return mvcnt;
    }
}