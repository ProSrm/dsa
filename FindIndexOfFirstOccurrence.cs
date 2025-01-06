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