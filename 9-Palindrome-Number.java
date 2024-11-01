class Solution {
    public boolean isPalindrome(int x) {
        int newNumber = 0;
        int oldNumber = x;
        if(x < 0){
            return false;
        }
        while(x != 0){
            newNumber = newNumber *10+ (x % 10);
            x = x / 10;
        }
        return newNumber == oldNumber;
    }
}