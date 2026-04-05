class Solution {
    public boolean judgeCircle(String m) {
        char[] moves = m.toCharArray();
       int s =0,t=0;
       for(int i=0;i<moves.length;i++){
        if(moves[i]=='L')
        {
            s++;
        }
        if(moves[i]=='D'){
            t++;
        }
        if(moves[i]=='R')
        {
            s--;
        }
        if(moves[i]=='U'){
            t--;
        }
       }
       return (t==0 && s==0); 
    }
}