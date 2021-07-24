package CountVowelPermutation;


class Solution {
    public int countVowelPermutation(int n) {
        long ca = 1; // this is the initialization 
        long ce = 1; // number of words ending with a,e,i,o,u of length 1 will be sum of all
        long ci = 1;
        long co = 1;
        long cu = 1;
        long MOD = 1000000007;
        for(int i = 1;i<n;i++)
        {
            // now using the rules all the words ending e will be words ending
            // with a and i in previous stage, cos we have to follow the rule 
            // so make current state as previos,i.e, count of a ending words currently 
            // will be the base for count of (root) e ending words which will emerge from 
            // it in the next step (or level of recursive tree)
            // keep on doing this till you reach the desired length
            long pa = ca; 
            long pe = ce;
            long pi = ci;
            long po = co;
            long pu = cu;
            ca = (pu+pi+pe)%MOD; // these % are to avoid overflow
            ce = (pa+pi)%MOD;
            ci = (po+pe)%MOD;
            co = (pi)%MOD;
            cu = (pi+po)%MOD;
        }
        
        
        return (int)((ca+ce+ci+co+cu)%MOD); // return the sum count of all the words ending in vowels

    }
}
