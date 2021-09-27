package UniqueEmailAddresses;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> received = new HashSet<>();
        for(String email : emails){
            String local = email.split("@")[0];
            String domain = email.split("@")[1];
            local = local.contains("+")?local.substring(0,local.indexOf("+")):local;
            
            local = local.replaceAll("\\.","");
            received.add(local+"@"+domain);
        }
         return received.size();       
    }
}