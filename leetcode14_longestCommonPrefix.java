class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.length;i++)
        {
           int x = strs[i].length();
            if(len>x)
                len = x;
        }
        // System.out.println(len);
        for(int i=0;i<len;i++)
        {
            int count=0;
            int flag =0;
            for(int j=0;j<strs.length-1;j++)
            {
                if(strs[j].charAt(i)==strs[j+1].charAt(i))
                    count++;
                else
                {
                    flag =1;
                    break;
                }
            }
            System.out.println(count);
           try{ if(count==strs.length-1)
                sb.append(strs[0].charAt(i));
            if(flag==1)
                break;}
            catch(ArrayIndexOutOfBoundsException e){
                
                System.out.println(e);
            }
        }
        
        String s = sb.toString();
        return s;
            
    }
}
