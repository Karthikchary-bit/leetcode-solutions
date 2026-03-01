public class Solution {
    public static void main(String[] args){
        int[] nums ={17823,48,2847,727,98};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(even(n)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int n = digits2(num);
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
    public static int digits2(int n) {
        return (int)(Math.log10(n))+1;
    }
    }

