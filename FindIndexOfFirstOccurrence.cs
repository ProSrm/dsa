public class Solution {
    public int StrStr(string haystack, string needle) {
        int lenghtHaystack=haystack.Length;
        int lengthNeedle=needle.Length;

        if (lengthNeedle == 0) return 0; 
        for(int i=0;i<=lenghtHaystack - lengthNeedle;i++){
            int k=i;
            for(int j=0;j<lengthNeedle;j++){
               
                if(haystack[k]==needle[j]){
                    k++;
                }
                else{
                    break;
                }
                if(j==lengthNeedle-1)
                    return i;
            }
        
        }
        return -1;

    }
}

/*

28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.


*/
