class Solution {
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int vcnt = 0, mvcnt = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                vcnt++;
            }
        }
        mvcnt = vcnt;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                vcnt--;
            }
            if(isVowel(s.charAt(i))){
                vcnt++;
            }
            mvcnt = Math.max(vcnt,mvcnt);
        }
        return mvcnt;
    }
}