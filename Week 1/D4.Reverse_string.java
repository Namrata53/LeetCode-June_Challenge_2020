/*Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

*/

//just take two pointer from both side, keep swapping with the help of a temp variable till mid

class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1; i<s.length/2; i++,j--){
            char t;
            t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
}