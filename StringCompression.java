Problem: leetcode 443
  
  
 class Solution {
    public int compress(char[] chars) {
        int k=0;
        for(int i=0;i<chars.length;){
            char letter=chars[i];
            int count=0;
            while(i<chars.length&&chars[i]==letter){
                count++;
                i++;
            }
            chars[k++]=letter;
            if(count>1){
                for(char c: String.valueOf(count).toCharArray()){
                    chars[k++]=c;
                }
            }
            
        }
        return k;
    }
}
