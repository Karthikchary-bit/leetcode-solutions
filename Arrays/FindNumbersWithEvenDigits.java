class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int n = digits(num);
        if(n%2==0){
            return true;
        }
        return false;

    }
    public static int digits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        
        }
        return count;
    }
}