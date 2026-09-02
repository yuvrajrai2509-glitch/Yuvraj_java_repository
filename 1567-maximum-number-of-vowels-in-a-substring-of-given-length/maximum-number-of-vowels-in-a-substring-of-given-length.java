class Solution {
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int cnt=0;

        int maxi=Integer.MIN_VALUE;
        while(j<s.length()){
            if(isVowel(s.charAt(j))){
                cnt++;
            }
            if(j-i+1==k){
                maxi=Math.max(maxi,cnt);
                if(isVowel(s.charAt(i))){
                    cnt--;
                }
                i++;
            }
            j++;
        }
        return maxi;
    }
}