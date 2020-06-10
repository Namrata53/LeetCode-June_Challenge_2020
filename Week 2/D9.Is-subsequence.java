/*Given a string s and a string t, check if s is subsequence of t.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

*/

// Idea is to search letters of subseq in the given string and increment the count of subseq till its length
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        for(int i=0,j=0; i < t.length(); i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
            if(j == s.length()){
                return true;
            }
        
        }
        return false;
        
    }
}