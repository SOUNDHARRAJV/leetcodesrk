class Solution {
    public int reverseDegree(String s) {
        char[] str = s.toCharArray();
        int tsum=0;
        int sum=0;
        int mul=1;
        for(int i=0;i<str.length;i++){
            sum = 'z'-str[i]+1;
            mul=(i+1)*sum;
            tsum +=mul;
        }
        return tsum;
    }
}