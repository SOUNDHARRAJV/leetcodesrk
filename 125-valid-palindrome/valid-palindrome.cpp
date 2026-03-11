class Solution {
public:
    bool isPalindrome(string s) {
       string str="";
       for(int i=0;i<s.length();i++){
        
        if(isalpha(s[i]) || isdigit(s[i]) ){
            str+= tolower(s[i]);
        }
       } 
       string str1=str;
       reverse(str.begin(),str.end());
       return (str==str1);
    }
};