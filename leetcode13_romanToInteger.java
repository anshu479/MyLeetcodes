class Solution {
    public int romanToInt(String s) {
        int res =0;
        for(int i=0;i<s.length();i++)
        {
            int s1 = value(s.charAt(i));
            
            if(i+1<s.length())
            {
                int s2 = value(s.charAt(i+1));
                if(s1>=s2)
                {
                    res = res+s1;
                }
                else 
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else 
                res = res +s1;    
        }
        return res;
        
    }
    public int value(char s){
        if(s=='I')
            return 1;
         if(s=='V')
            return 5;
         if(s=='X')
            return 10;
         if(s=='L')
            return 50;
         if(s=='C')
            return 100;
         if(s=='D')
            return 500;
         if(s=='M')
            return 1000;
        else 
            return 0;
    }
}
