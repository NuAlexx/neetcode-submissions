class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(s.length() != t.length()){
            return false;
        }

        int sStart = ch1[0];
        int tStart = ch2[0];

        for(int i = 0; i < ch1.length; i++){
            for(int j = 0; j < ch2.length; j++){

                if(ch1[i] != ch2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
