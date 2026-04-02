class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        int start = 0, end = s.length()-1;
        while(start <= end){
            char lch = s.charAt(start);
            char rch = s.charAt(end);
            if(!Character.isLetterOrDigit(lch)){
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(rch)){
                end--;
                continue;
            }

            if(lch != rch){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
