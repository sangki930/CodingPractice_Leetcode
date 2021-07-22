package PushDominoes;

class Solution {
    public String pushDominoes(String dominoes) {
        char ch[]=dominoes.toCharArray();
     
        
        for(int j=0;j<ch.length;j++){
            char c = ch[j];
            if(c=='.')
                continue;
            if(c=='L'){
                int tmp=j-1;
                while(tmp>=0){
                    if(ch[tmp]!='.')
                        break;
                    ch[tmp--]='L';
                }
            }else if(c=='R'){
                
                int left = j;
                int right = dominoes.indexOf("L",left);
                left=dominoes.lastIndexOf("R",right);
                for(int l=j;l<=left;l++){
                    ch[l]='R';
                }
                if(right!=-1){
                    for(int i=0;i<(right-left+1)/2;i++){
                        ch[left+i]='R';
                        ch[right-i]='L';
                        }
                    j=right;
                }else{
                     for(int i=j;i<ch.length;i++)
                         ch[i]='R';
                    
                }
                
            }
        }
        
        
        return new String(ch);
    }
}
